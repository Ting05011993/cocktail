package com.example.cocktail.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
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
@Table(name = "member")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String account;

	@NotBlank
	private String password;

	private String nickname;

	@NotBlank
	@Email
	private String email;

	@Column(name = "last_login")
	private LocalDateTime lastLogin;

	@NotBlank
	@Column(name = "is_active")
	private Boolean isActive;

	@OneToMany(mappedBy = "member")
	private List<Favorite> favorite;

	@NotNull
	@Column(name = "create_dt")
	private LocalDateTime createDt;

	@NotNull
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
}
