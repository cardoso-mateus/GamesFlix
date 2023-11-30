package com.gamesflix.models.classes;

import com.gamesflix.controlers.interfaces.FiltersInterface;

public class MobileGames extends Games implements FiltersInterface {
    boolean androidAvailable;
    boolean iosAvailable;

    public MobileGames(String title, String genre, int launchYear, boolean subscriptionNeeded, boolean androidAvailable, boolean iosAvailable) {
        super(title, genre, launchYear, subscriptionNeeded);
        this.androidAvailable = androidAvailable;
        this.iosAvailable = iosAvailable;
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
                Disponível para Android: %b
                Disponível para iOS: %b
                """.formatted(getTitle(), getGenre(), getLaunchYear(), getRatingAvarage(), getRatingsQuantity(), isSubscriptionNeeded(), isAndroidAvailable(), isIosAvailable());
        System.out.println(text);
    }

    public boolean isAndroidAvailable() {
        return androidAvailable;
    }

    public boolean isIosAvailable() {
        return iosAvailable;
    }
}