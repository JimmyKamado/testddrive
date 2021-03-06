package com.example.lib_recipes.repo.models.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.lib_recipes.repo.models.DummyIngredient
import com.example.lib_recipes.repo.models.DummyRecipe

data class RecipeAndIngredients(
    @Embedded val recipe : DummyRecipe,
    @Relation(
        parentColumn = "recipe",
        entityColumn = "recipe"
    )
    val ingredient: DummyIngredient
)
