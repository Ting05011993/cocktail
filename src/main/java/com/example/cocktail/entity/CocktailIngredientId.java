package com.example.cocktail.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


//cocktail跟ingredient關聯表單
@Embeddable
@Data  // lombok
@NoArgsConstructor
@AllArgsConstructor
public class CocktailIngredientId implements Serializable {
	private Long cocktailId;
	private Integer ingredientId;
}
