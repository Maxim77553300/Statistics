package com.maximshumkov.rest.controller;


import com.maximshumkov.rest.dto.AddGameRequest;
import com.maximshumkov.rest.dto.ListGameResponse;
import org.springframework.http.ResponseEntity;

public interface GameController {

    ListGameResponse findAllGame();

    ResponseEntity<?> addGame(AddGameRequest addGameRequest);

    ResponseEntity<?> updateGame(AddGameRequest addGameRequest);
}
