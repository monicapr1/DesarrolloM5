package com.example.roomapp.di
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.roomapp.data.HeroeDB
import com.example.roomapp.data.dao.HeroeDao
import com.example.roomapp.data.mockdata.MockData
import com.example.roomapp.data.repositories.HeroeRepositoriesImpl
import com.example.roomapp.domain.models.Heroe
import com.example.roomapp.domain.repositories.HeroeRepository
import com.example.roomapp.domain.use_cases.GetHeroe
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Volatile
    private var INSTANCE : HeroeDB? = null

    @Provides
    @Singleton
    fun provideDB(
        @ApplicationContext context: Context
    ): HeroeDB {
        return INSTANCE ?: synchronized(this){
            val instance = INSTANCE
            if (instance != null){
                instance
            }
            else{
                val callback = object  : RoomDatabase.Callback(){
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        CoroutineScope(Dispatchers.IO).launch {
                            val db = INSTANCE ?: return@launch
                            val heroeDao = db.heroeDao()
                            populateDatabase(heroeDao)
                        }
                    }
                    suspend fun populateDatabase (heroedao : HeroeDao){
                        val heroe = Heroe.heroes
                        heroedao.insertAll(heroe)

                    }
                }
                Room.databaseBuilder(context.applicationContext, HeroeDB::class.java, "heroes_db").addCallback(callback).build()
                    .also {
                        INSTANCE = it
                    }
            }
        }
    }
    @Provides
    @Singleton
    fun provideHeroesRepository(db: HeroeDB): HeroeRepository {
        return HeroeRepositoriesImpl(db.heroeDao())
    }

    @Provides
    @Singleton
    fun provideGetHeroes(heroRepository: HeroeRepository): GetHeroe {
        return GetHeroe(heroRepository)
    }
}