package com.example.cocktail.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//member跟cocktail關聯表單
@Embeddable
@Data  // lombok
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteId implements Serializable {

	private Long memberId;
	private Long cocktailId;
}
