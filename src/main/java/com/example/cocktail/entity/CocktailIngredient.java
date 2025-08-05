package com.example.cocktail.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
	private Long cocktailId;

	@Id
	private Integer ingredientId;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "cocktail_id", referencedColumnName = "id")
	private Cocktail cocktail;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "ingredient_id", referencedColumnName = "id")
	private Ingredient ingredient;

	private String amount;

	@Column(name = "create_dt")
	private LocalDateTime createDt;

	@Column(name = "update_dt")
	private LocalDateTime updateDt;
}
