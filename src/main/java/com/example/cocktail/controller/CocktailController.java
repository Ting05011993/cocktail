package com.example.cocktail.controller;

import com.example.cocktail.entity.Cocktail;
import com.example.cocktail.service.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cocktails")
public class CocktailController {

	@Autowired
	private CocktailService cocktailService;

	//全部調酒列表
	@GetMapping
	public String showAllCocktails(Model model){
		List<Cocktail> cocktails = cocktailService.getAllCocktail();
		model.addAttribute("cocktails", cocktails);
		return "index";
	}

	//導向新增頁面
	@GetMapping("/add")
	public String addCocktailPage(Model model){
		model.addAttribute("cocktail", new Cocktail());
		return "cocktails/add";
	}

	//傳送新增資料
	@PostMapping
	public String addCocktail(@ModelAttribute Cocktail cocktail){
		cocktailService.createCocktail(cocktail);
		return "redirect:/cocktails";
	}

	//導向修改頁面
	@GetMapping("/edit/{id}")
	public String editCocktailPage(@PathVariable Long id, Model model){
		Cocktail cocktail = cocktailService.getCocktailById(id);
		if (cocktail == null){
			return "redirect:/cocktails";
		}else {
			model.addAttribute("cocktail", cocktail);
			return "cocktails/edit";
		}
	}

	//傳送修改資料
	@PostMapping("/update/{id}")
	public String editCocktail(@PathVariable Long id, @ModelAttribute Cocktail cocktail){
		cocktailService.updateCocktail(id, cocktail);
		return "redirect:/cocktails";
	}

	//刪除資料
	@GetMapping("/delete/{id}")
	public String deleteCocktail(@PathVariable Long id){
		cocktailService.deleteCocktailById(id);
		return "redirect:/cocktails";
	}
}
