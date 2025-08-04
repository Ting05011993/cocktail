package com.example.cocktail.service;

import com.example.cocktail.entity.Cocktail;

import java.util.List;

public interface CocktailService {

	List<Cocktail> getAllCocktail();

	Cocktail getCocktailById(Long id);

	Cocktail getCocktailByName(String cocktailName);

	List<Cocktail> findByNameContaining(String input);

	List<Cocktail> getCocktailByBase(Integer baseId);

	Cocktail createCocktail(Cocktail cocktail);

	void updateCocktail(Long id, Cocktail cocktail);

	void deleteCocktailById(Long id);
}
