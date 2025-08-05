package com.example.cocktail.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cocktail_ingredient")
@IdClass(CocktailIngredientId.class)
public class CocktailIngredient {

    @Id
    private Long cocktailId;

    @Id
    private Integer ingredientId;

    @ManyToOne
    @MapsId("cocktailId")
    @JoinColumn(name = "cocktail_id", referencedColumnName = "id")
    private Cocktail cocktail;

    @ManyToOne
    @MapsId("ingredientId")
    @JoinColumn(name = "ingredient_id", referencedColumnName = "id")
    private Ingredient ingredient;

    private String amount;

    @Column(name = "create_dt")
    private LocalDateTime createDt;

    @Column(name = "update_dt")
    private LocalDateTime updateDt;
}
