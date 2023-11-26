package com.gamesflix.controlers;

import com.gamesflix.models.Games;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private List<Games> playList = new ArrayList<Games>();

    public void addToList(Games g) {
        playList.add(g);
    }

    public void showList() {
        System.out.println("Minha play list: ");
        for (Games game : playList) {
            System.out.println(game.getTitle());
        }
    }
}
