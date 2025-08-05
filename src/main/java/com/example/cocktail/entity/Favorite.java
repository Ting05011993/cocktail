package com.example.cocktail.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "favorite")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(FavoriteId.class)
public class Favorite {

	@Id
	private Long memberId;

	@Id
	private Long cocktailId;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "member_id", referencedColumnName = "id")
	private Member member;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "cocktail_id", referencedColumnName = "id")
	private Cocktail cocktail;

	@NotNull
	@Column(name = "create_dt")
	private LocalDateTime createDt;
}
