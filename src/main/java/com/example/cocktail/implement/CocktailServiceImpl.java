package com.example.cocktail.implement;

import com.example.cocktail.entity.Cocktail;
import com.example.cocktail.repository.CocktailRepository;
import com.example.cocktail.service.CocktailService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CocktailServiceImpl implements CocktailService {

	@Autowired
	private CocktailRepository repo;

	@Override
	public List<Cocktail> getAllCocktail() {
		return repo.findAll();
	}

	@Override
	public Cocktail getCocktailById(Long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Cocktail getCocktailByName(String cocktailName) {
		return repo.findByCocktailName(cocktailName);
	}

	@Override
	public List<Cocktail> findByNameContaining(String input) {
		return repo.findByCocktailNameContaining(input);
	}

	@Override
	public List<Cocktail> getCocktailByBase(Integer baseId) {
		return repo.getCocktailByBaseId(baseId);
	}

	@Override
	public Cocktail createCocktail(Cocktail cocktail) {
		return repo.save(cocktail);
	}

	@Override
	public void updateCocktail(Long id, Cocktail cocktail) {
		repo.save(cocktail);
	}

	@Override
	public void deleteCocktailById(Long id) {
		repo.deleteById(id);
	}
}
