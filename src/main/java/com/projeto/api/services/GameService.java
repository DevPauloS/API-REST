package com.projeto.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.api.dtos.GameMinDTO;
import com.projeto.api.entities.Game;
import com.projeto.api.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    GameRepository repo;

    public List<GameMinDTO> getAll() {
        List<Game> result = repo.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
