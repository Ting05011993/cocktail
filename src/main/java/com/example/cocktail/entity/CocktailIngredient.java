package com.example.cocktail.entity;

import com.example.cocktail.entity.Cocktail;
import com.example.cocktail.entity.CocktailIngredientId;
import com.example.cocktail.entity.Ingredient;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(CocktailIngredientId.class)
public class CocktailIngredient {

	@Id
	@ManyToOne
	@JoinColumn(name = "cocktail_id")
	private Cocktail cocktail;

	@Id
	@ManyToOne
	@JoinColumn(name = "ingredient_id")
	private Ingredient ingredient;

	private String amount;

	@Column(name = "create_dt")
	private LocalDateTime createDt;

	@Column(name = "update_dt")
	private LocalDateTime updateDt;
}
