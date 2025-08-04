package com.example.cocktail.repository;

import com.example.cocktail.entity.CocktailFlavorId;
import com.example.cocktail.entity.Flavor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlavorRepository extends JpaRepository<Flavor, Integer> {
}
