package com.example.barcodeapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.barcodeapp.data.BarCodeDB
import com.example.barcodeapp.data.dao.ProductDAO
import com.example.barcodeapp.domain.models.Product
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import java.security.AccessControlContext
import java.util.Objects
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent:: class)
object AppModule {
    @Provides
    fun provideString(): String {
        return "Hola"
    }
    @Provides
    @Singleton
    fun provideBarCodeDb(
        @ApplicationContext context: Context):BarCodeDB {
        val callback = object  : RoomDatabase.Callback(){
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
                val applicationScope = CoroutineScope(SupervisorJob()+ Dispatchers.IO)
                applicationScope.launch {
                    val barCodeDB= provideBarCodeDb(context)
                    val productDAO= barCodeDB.productDao()
                    populateDB(productDAO)
                }
            }
            suspend fun populateDB(productDAO:ProductDAO){
                val products = Product.products
                productDAO.insertAll((products))
            }
        }
        return Room.databaseBuilder(context, BarCodeDB::class.java,"barcode_db").addCallback(callback).build()
    }
}