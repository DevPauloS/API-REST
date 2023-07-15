package com.projeto.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.api.dtos.GameMinDTO;
import com.projeto.api.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {
    
    @Autowired
    private GameService gs;

    @GetMapping
    public List<GameMinDTO> getAll() {
        return gs.getAll();        
    }

    @GetMapping("/{listId}")
    public List<GameMinDTO> findByList(@PathVariable Long id){
        List<GameMinDTO> result = gs.getAll();
        return null;
    }
}
