package com.gamesflix.models.classes;

import com.gamesflix.controlers.interfaces.FiltersInterface;

public class PcGames extends Games implements FiltersInterface {
    private boolean mouseKeyboard;
    private boolean joystick;

    public PcGames(String title, String genre, int launchYear, boolean subscriptionNeeded, boolean mouseKeyboard, boolean joystick) {
        super(title, genre, launchYear, subscriptionNeeded);
        this.mouseKeyboard = mouseKeyboard;
        this.joystick = joystick;
    }

    @Override
    public void getDataSheet() {
        String text = """
                Título: %s
                Gênero: %s
                Ano de lançamento: %d
                Nota: %.1f
                Quantidade de avaliações: %d
                Necessário assinatura: %b
                Aceita mouse e teclado: %b
                Aceita controle: %b
                """.formatted(getTitle(), getGenre(), getLaunchYear(), getRatingAvarage(), getRatingsQuantity(), isSubscriptionNeeded(), isMouseKeyboard(), isJoystick());
        System.out.println(text);
    }

    public boolean isMouseKeyboard() {
        return mouseKeyboard;
    }

    public boolean isJoystick() {
        return joystick;
    }
}