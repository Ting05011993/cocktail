package com.example.cocktail.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CocktailFlavorId {

	private Long cocktailId;
	private Integer flavorId;
}
