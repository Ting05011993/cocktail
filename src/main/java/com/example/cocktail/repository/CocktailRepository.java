package com.example.cocktail.repository;

import com.example.cocktail.entity.Cocktail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CocktailRepository extends JpaRepository<Cocktail, Long> {

	Cocktail findByCocktailName(String cocktailName);

	List<Cocktail> findByNameContaining(String input);

	List<Cocktail> getCocktailByBase(Integer baseId);
}
