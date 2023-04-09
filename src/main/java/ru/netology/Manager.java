package ru.netology;

public class Manager {

    private int numberFilm = 10;
    private Film[] films = new Film[0];

    public Manager() {
    }

    public Manager(int numberFilm) {
        this.numberFilm = numberFilm;
    }

    public void addFilms(Film item) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = item;
        films = tmp;
    }

    public Film[] findAll() {
        int resultLength = films.length;
        if (resultLength >= numberFilm) {
            resultLength = numberFilm;
        } else {
            resultLength = films.length;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[i];
        }
        return result;
    }

    public Film[] findLast() {
        int resultLength = films.length;
        if (resultLength >= numberFilm) {
            resultLength = numberFilm;
        } else {
            resultLength = films.length;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

}

