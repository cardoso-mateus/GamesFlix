package com.gamesflix;

import com.gamesflix.controlers.PlayList;
import com.gamesflix.models.classes.MobileGames;
import com.gamesflix.models.classes.PcGames;

public class Main {

    public static void main(String[] args) {
        PcGames doom = new PcGames("Doom", "Shooter", 1993, false, true, false);
        doom.rate(10);
        doom.rate(8);
        doom.rate(7.5);
        doom.getDataSheet();

        MobileGames candyCrush = new MobileGames("Candy Crush", "Match Three", 2012, true, true, true);
        candyCrush.rate(9);
        candyCrush.rate(8);
        candyCrush.rate(7);
        candyCrush.getDataSheet();

        PlayList playList = new PlayList();
        playList.addToList(doom);
        playList.addToList(candyCrush);
        playList.showList();
    }
}