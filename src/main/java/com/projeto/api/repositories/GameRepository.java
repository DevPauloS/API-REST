package com.projeto.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.api.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{    
}
