package ru.netology;

public class Film {
    private int id;
    public int numberFilm;
    private String filmsName;
    private String filmsGenre;

    public Film(int id, int numberFilm, String filmsName, String filmsGenre) {
        this.id = id;
        this.numberFilm = numberFilm;
        this.filmsName = filmsName;
        this.filmsGenre = filmsGenre;
    }

}
