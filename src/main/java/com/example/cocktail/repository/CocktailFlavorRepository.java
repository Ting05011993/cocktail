package com.example.cocktail.repository;

import com.example.cocktail.entity.CocktailFlavor;
import com.example.cocktail.entity.CocktailFlavorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CocktailFlavorRepository extends JpaRepository<CocktailFlavor, CocktailFlavorId> {
}
