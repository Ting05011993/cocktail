package com.example.cocktail.repository;

import com.example.cocktail.entity.CocktailIngredient;
import com.example.cocktail.entity.CocktailIngredientId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CocktailIngredientRepository extends JpaRepository<CocktailIngredient, CocktailIngredientId> {
}
