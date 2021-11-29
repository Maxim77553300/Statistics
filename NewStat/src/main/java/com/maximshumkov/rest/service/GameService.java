package com.maximshumkov.rest.service;


import com.maximshumkov.rest.dto.AddGameRequest;
import com.maximshumkov.rest.entity.Game;

import java.util.List;

public interface GameService {

    List<Game> findAllGame();

    void addGame(AddGameRequest addGameRequest);

    void updateGame(AddGameRequest addGameRequest);
}
