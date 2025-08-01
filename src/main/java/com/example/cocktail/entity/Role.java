package com.example.cocktail.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "role_name", length = 20, nullable = false)
	private String roleName;

	@Column(name = "create_dt", nullable = false)
	private LocalDateTime createDt;

	@Column(name = "update_dt")
	private LocalDateTime updateDt;
}
