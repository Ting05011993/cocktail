package com.example.cocktail.repository;

import com.example.cocktail.entity.CocktailIngredientId;
import com.example.cocktail.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}
