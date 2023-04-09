package ru.netology;
import ru.netology.Manager;
import ru.netology.Film;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerFilmTest {

    Film first = new Film(1, 1, "Bloodshot", "Action");
    Film second = new Film(2, 2, "Forward", "Cartoon");
    Film third = new Film(3, 3, "Hotel Belgrade", "Comedy");
    Film fourth = new Film(4, 4, "Invisible man", "Action");
    Film fifth = new Film(5, 5, "Trolls. World tour", "Cartoon");
    Film sixth = new Film(6, 6, "Number one", "Comedy");
    Film seven = new Film(7, 3, "Hotel Belgrade", "Comedy");
    Film eight = new Film(8, 4, "Invisible man", "Action");
    Film nine = new Film(9, 5, "Trolls. World tour", "Cartoon");
    Film ten = new Film(10, 6, "Number one", "Comedy");

    @Test
    public void findAllFilms() {
        Manager film = new Manager();
        film.addFilms(first);
        film.addFilms(second);
        film.addFilms(third);
        film.addFilms(fourth);
        film.addFilms(fifth);
        film.addFilms(sixth);
        film.addFilms(seven);
        film.addFilms(eight);
        film.addFilms(nine);
        film.addFilms(ten);

        Film[] expected = {first, second, third, fourth, fifth, sixth, seven, eight, nine, ten};
        Film[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findAll() {
        Manager film = new Manager(2);
        film.addFilms(first);

        Film[] expected = {first};
        Film[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void filmFive() {
        Manager film = new Manager(3);
        film.addFilms(first);
        film.addFilms(second);
        film.addFilms(third);
        film.addFilms(fourth);
        film.addFilms(fifth);
        film.addFilms(sixth);
        film.addFilms(seven);
        film.addFilms(eight);
        film.addFilms(nine);
        film.addFilms(ten);

        Film[] expected = {first, second, third};
        Film[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void filmFindLast() {
        Manager film = new Manager();
        film.addFilms(first);
        film.addFilms(second);
        film.addFilms(third);
        film.addFilms(fourth);
        film.addFilms(fifth);
        film.addFilms(sixth);
        film.addFilms(seven);
        film.addFilms(eight);
        film.addFilms(nine);
        film.addFilms(ten);

        Film[] expected = {ten, nine, eight, seven, sixth, fifth, fourth, third, second, first};
        Film[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void filmFindLastTest() {
        Manager film = new Manager();
        film.addFilms(first);
        film.addFilms(second);
        film.addFilms(third);
        film.addFilms(eight);
        film.addFilms(nine);
        film.addFilms(ten);

        Film[] expected = {ten, nine, eight, third, second, first};
        Film[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void filmFindLastFive() {
        Manager film = new Manager(5);
        film.addFilms(first);
        film.addFilms(second);
        film.addFilms(third);
        film.addFilms(fourth);
        film.addFilms(fifth);
        film.addFilms(sixth);
        film.addFilms(seven);
        film.addFilms(eight);
        film.addFilms(nine);
        film.addFilms(ten);

        Film[] expected = {ten, nine, eight, seven, sixth};
        Film[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void filmFindLastSix() {
        Manager film = new Manager(6);
        film.addFilms(first);
        film.addFilms(second);
        film.addFilms(third);
        film.addFilms(fourth);
        film.addFilms(fifth);


        Film[] expected = {fifth, fourth, third, second, first};
        Film[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
