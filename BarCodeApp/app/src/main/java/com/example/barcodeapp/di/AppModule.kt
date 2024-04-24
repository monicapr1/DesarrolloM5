package com.example.barcodeapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.barcodeapp.data.BarCodeDB
import com.example.barcodeapp.data.dao.ProductDAO
import com.example.barcodeapp.domain.models.Product
import com.example.barcodeapp.domain.repositories.ProductRepository
import com.example.barcodeapp.domain.repositories.ProductRepositoryImpl
import com.example.barcodeapp.domain.use_cases.GetProducts
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

    @Volatile
    private var INSTANCE: BarCodeDB? = null

    @Provides
    @Singleton
    fun provideBarcodeDb(
        @ApplicationContext context: Context
    ): BarCodeDB {
        return INSTANCE ?: synchronized(this) {
            val instance = INSTANCE
            if (instance != null) {
                instance
            } else {
                val callback = object : RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        CoroutineScope(Dispatchers.IO).launch {
                            val db = INSTANCE ?: return@launch
                            val productDao = db.productDao()
                            populateDatabase(productDao)
                        }
                    }

                    suspend fun populateDatabase(productDao: ProductDAO) {
                        val products = Product.products
                        productDao.insertAll(products)
                    }
                }
                Room.databaseBuilder(
                    context.applicationContext,
                    BarCodeDB::class.java,
                    "barcode_db"
                )
                    .addCallback(callback)
                    .build().also {
                        INSTANCE = it
                    }
            }
        }
    }
    @Provides
    @Singleton
    fun provideProductRepositories(db:BarCodeDB) : ProductRepository{
        return ProductRepositoryImpl(db.productDao())
    }
    @Provides
    @Singleton
    fun provideGetProducts(productRepository: ProductRepository) : GetProducts{
        return GetProducts(productRepository)
    }
}