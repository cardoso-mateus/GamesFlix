package com.gamesflix;

public class Main {

    public static void main(String[] args) {
        Games doom = new Games("Doom", "Shooter", 1993, false);
        doom.rate(10);
        doom.rate(8);
        doom.rate(7.5);
        doom.getDataSheet();
    }

}