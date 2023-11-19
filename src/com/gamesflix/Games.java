package com.gamesflix;

public class Games {
    private String title;
    private String genre;
    private int launchYear;
    private double ratingsSum;
    private int ratingsQuantity;
    private boolean subscriptionNeeded;

    public Games(String title, String genre, int launchDate, boolean subscriptionNeeded) {
        this.title = title;
        this.genre = genre;
        this.launchYear = launchDate;
        this.subscriptionNeeded = subscriptionNeeded;
    }

    void getDataSheet() {
        String text = """
                Título: %s
                Gênero: %s
                Ano de lançamento: %d
                Nota: %.1f
                Quantidade de avaliações: %d
                """.formatted(getTitle(), getGenre(), getLaunchYear(), getRatingAvarage(), getRatingsQuantity());
        System.out.println(text);
    }

    void rate(double d) {
        ratingsSum += d;
        ratingsQuantity++;
    }

    double getRatingAvarage() {
        return ratingsSum / ratingsQuantity;
    }

    private String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private String getGenre() {
        return genre;
    }

    private void setGenre(String genre) {
        this.genre = genre;
    }

    private int getLaunchYear() {
        return launchYear;
    }

    private void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    private boolean isSubscriptionNeeded() {
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

    private int getRatingsQuantity() {
        return ratingsQuantity;
    }

    private void setRatingsQuantity(int ratingsQuantity) {
        this.ratingsQuantity = ratingsQuantity;
    }
}