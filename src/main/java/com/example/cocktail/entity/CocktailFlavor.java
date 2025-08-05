package com.example.cocktail.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@IdClass(CocktailFlavorId.class)
@Table(name = "cocktail_flavor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CocktailFlavor {

	@Id
	private Long cocktailId;

	@Id
	private Integer flavorId;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "cocktail_id", referencedColumnName = "id")
	private Cocktail cocktail;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "flavor_id", referencedColumnName = "id")
	private Flavor flavor;

	@NotNull
	@Column(name = "create_dt")
	private LocalDateTime createDt;

	@NotNull
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
}
