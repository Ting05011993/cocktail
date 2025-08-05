package com.example.cocktail.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "flavor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Flavor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Column(name = "flavor_name")
    private String flavorName;

    @NotNull
    @Column(name = "create_dt")
    private LocalDateTime createDt;

    @NotNull
    @Column(name = "update_dt")
    private LocalDateTime updateDt;
}
