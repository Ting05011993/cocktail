package com.example.cocktail.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
@IdClass(CocktailFlavorId.class)
@Table(name = "cocktail_flavor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CocktailFlavor {

	@Id
	@ManyToOne
	@JoinColumn(name = "cocktail_id")
	private Cocktail cocktail;

	@Id
	@ManyToOne
	@JoinColumn(name = "flavor_id")
	private Flavor flavor;

	@NotNull
	@Column(name = "create_dt")
	private LocalDateTime createDt;

	@NotNull
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
}
