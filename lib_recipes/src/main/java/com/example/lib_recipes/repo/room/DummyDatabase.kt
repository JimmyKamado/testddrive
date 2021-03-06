package com.example.lib_recipes.repo.room


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.lib_recipes.repo.models.DummyIngredient
import com.example.lib_recipes.repo.models.DummyRecipe

@Database(entities = [DummyIngredient::class, DummyRecipe::class], exportSchema = false, version=1)
abstract class DummyDatabase: RoomDatabase() {
    abstract fun dummyDao(): DummyDao

    companion object {
        const val DB_NAME = "RECIPES_AND_INGREDIENTS_DB"

        fun getDatabaseInstance(context: Context): DummyDatabase {
            return Room.databaseBuilder(context, DummyDatabase::class.java, DB_NAME)
                .fallbackToDestructiveMigration().build()
        }
    }


}