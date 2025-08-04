package com.example.cocktail.repository;

import com.example.cocktail.entity.Favorite;
import com.example.cocktail.entity.FavoriteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
}
