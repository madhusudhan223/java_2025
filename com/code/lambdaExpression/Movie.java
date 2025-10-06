package com.code.lambdaExpression;

public class Movie{

    private  String title;
    private int likes;
    private Genre genre;

    @Override
    public String toString() {
        return title;
    }

    public Movie(String title, int likes, Genre genre) {
        this.title = title;
        this.likes = likes;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    public Genre getGenre() {
        return genre;
    }
}
