package com.maximshumkov.rest.dto;


import com.maximshumkov.rest.entity.Game;

import java.util.List;

public class ListGameResponse {


    List<Game> games;

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
