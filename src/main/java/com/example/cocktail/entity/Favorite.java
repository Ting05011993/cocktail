package com.example.cocktail.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "favorite")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(MemberFavoriteId.class)
public class Favorite {

	@Id
	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;

	@Id
	@ManyToOne
	@JoinColumn(name = "cocktail_id")
	private Cocktail cocktail;

	@NotNull
	@Column(name = "create_dt")
	private LocalDateTime createDt;
}
