package com.gamesflix.models.classes;

import com.gamesflix.models.interfaces.Rateable;

public class Games implements Rateable {
    private String title;
    private String genre;
    private int launchYear;
    private double ratingsSum;
    private int ratingsQuantity;
    private boolean subscriptionNeeded;

    public Games(String title, String genre, int launchYear, boolean subscriptionNeeded) {
        this.title = title;
        this.genre = genre;
        this.launchYear = launchYear;
        this.subscriptionNeeded = subscriptionNeeded;
    }

    public void getDataSheet() {
        String text = """
                Título: %s
                Gênero: %s
                Ano de lançamento: %d
                Nota: %.1f
                Quantidade de avaliações: %d
                Necessário assinatura: %b
                """.formatted(getTitle(), getGenre(), getLaunchYear(), getRatingAvarage(), getRatingsQuantity(), isSubscriptionNeeded());
        System.out.println(text);
    }

    public void rate(double rating) {
        ratingsSum += rating;
        ratingsQuantity++;
    }

    public double getRatingAvarage() {
        return ratingsSum / ratingsQuantity;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    protected String getGenre() {
        return genre;
    }

    private void setGenre(String genre) {
        this.genre = genre;
    }

    protected int getLaunchYear() {
        return launchYear;
    }

    private void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    protected boolean isSubscriptionNeeded() {
        return subscriptionNeeded;
    }

    private void setSubscriptionNeeded(boolean subscriptionNeeded) {
        this.subscriptionNeeded = subscriptionNeeded;
    }

    private double getRatingsSum() {
        return ratingsSum;
    }

    private void setRatingsSum(double ratingsSum) {
        this.ratingsSum = ratingsSum;
    }

    protected int getRatingsQuantity() {
        return ratingsQuantity;
    }

    private void setRatingsQuantity(int ratingsQuantity) {
        this.ratingsQuantity = ratingsQuantity;
    }
}