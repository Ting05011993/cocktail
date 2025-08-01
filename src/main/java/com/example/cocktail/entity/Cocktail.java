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
@Table(name = "cocktail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cocktail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Column(name = "cocktail_name")
	private String cocktailName;

	@NotNull
	@JoinColumn(name = "glass_id")
	private Glass glassId;

	@NotNull
	@JoinColumn(name = "base_id")
	private Base baseId;

	@NotNull
	@Column(name = "is_Alcoholic")
	private Boolean isAlcoholic;

	@NotBlank
	private String description;

	@NotBlank
	@Column(columnDefinition = "TEXT")
	private String method;

	@NotBlank
	private String photoUrl;

	@OneToMany(mappedBy = "cocktail")
	private List<CocktailIngredient> ingredients;

	@OneToMany(mappedBy = "cocktail")
	private List<Favorite> favorite;

	@NotNull
	@Column(name = "create_dt")
	private LocalDateTime createDt;

	@NotNull
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
}
