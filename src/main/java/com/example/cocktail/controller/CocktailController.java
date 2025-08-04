package com.example.cocktail.controller;

import com.example.cocktail.entity.Cocktail;
import com.example.cocktail.implement.CocktailServiceImpl;
import com.example.cocktail.service.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cocktails")
public class CocktailController {

	@Autowired
	private CocktailService cocktailService;

	@GetMapping
	public String showAllCocktails(Model model){
		List<Cocktail> cocktails = cocktailService.getAllCocktail();
		model.addAttribute("cocktails", cocktails);
		return "index";
	}
}
