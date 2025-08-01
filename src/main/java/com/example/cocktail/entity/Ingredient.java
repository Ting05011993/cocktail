package com.example.cocktail.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "ingredient")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank
	@Column(name = "ingredient_name")
	private String ingredientName;

	@OneToMany(mappedBy = "ingredient")
	private List<CocktailIngredient> cocktails;

	@NotNull
	@Column(name = "create_dt")
	private LocalDateTime createDt;

	@NotNull
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
}
