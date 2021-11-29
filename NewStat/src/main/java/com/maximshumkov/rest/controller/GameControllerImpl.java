package com.maximshumkov.rest.controller;


import com.maximshumkov.rest.dto.AddGameRequest;
import com.maximshumkov.rest.dto.ListGameResponse;
import com.maximshumkov.rest.entity.Game;
import com.maximshumkov.rest.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class GameControllerImpl implements GameController{
    @Autowired
    private GameService gameService;

    @GetMapping("/games")
    @Override
    public ListGameResponse findAllGame() {
        List<Game> list = gameService.findAllGame();
        ListGameResponse listGameResponse = new ListGameResponse();
        listGameResponse.setGames(list);
        return listGameResponse;
    }

    @Override
    public ResponseEntity<?> addGame(AddGameRequest addGameRequest) {
        return null;
    }

    @Override
    public ResponseEntity<?> updateGame(AddGameRequest addGameRequest) {
        return null;
    }
}
