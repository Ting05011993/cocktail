package com.example.cocktail.repository;

import com.example.cocktail.entity.Cocktail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CocktailRepository extends JpaRepository<Cocktail, Long> {

	Cocktail findByCocktailName(String cocktailName);

	List<Cocktail> findByCocktailNameContaining(String input);

	@Query("SELECT c FROM Cocktail c WHERE c.base.id = :baseId")
	List<Cocktail> getCocktailByBaseId(Integer baseId);
}
