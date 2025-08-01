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

@Entity
@Table(name = "base")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank
	@Column(name = "base_name")
	private String baseName;

	@NotNull
	@Column(name = "create_dt")
	private LocalDateTime createDt;

	@NotNull
	@Column(name = "update_dt")
	private LocalDateTime updateDt;
}
