package com.gamesflix.controlers.classes;

import com.gamesflix.controlers.interfaces.FiltersInterface;
import com.gamesflix.models.classes.Games;

import java.util.ArrayList;
import java.util.List;

public class Filters {
        List<Games> filteredGames = new ArrayList<>();

    public void subscriptionFilter(Games games) {
        if (games.subscriptionFilter() == 1) {
            filteredGames.add(games);
        }
    }

    public void getFilteredGames() {
        System.out.println("Jogos filtrados: ");
        for (Games game : filteredGames) {
            System.out.println(game.getTitle());
        }
        System.out.println();
    }
}