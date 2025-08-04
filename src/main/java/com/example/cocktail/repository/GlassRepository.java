package com.example.cocktail.repository;

import com.example.cocktail.entity.Glass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlassRepository extends JpaRepository<Glass, Integer> {
}
