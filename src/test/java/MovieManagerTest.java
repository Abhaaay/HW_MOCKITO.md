import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {

    @Test
    public void testFindAllEmpty() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAllWith1Movie() {
        MovieManager manager = new MovieManager();
        manager.addNewMovie("Movie A");

        String[] actual = manager.findAll();
        String[] expected = {"Movie A"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAllWith4Movie() {
        MovieManager manager = new MovieManager();
        manager.addNewMovie("Movie A");
        manager.addNewMovie("Movie B");
        manager.addNewMovie("Movie C");
        manager.addNewMovie("Movie D");

        String[] actual = manager.findAll();
        String[] expected = {"Movie A", "Movie B", "Movie C", "Movie D"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        MovieManager manager = new MovieManager();
        manager.addNewMovie("Movie A");
        manager.addNewMovie("Movie B");
        manager.addNewMovie("Movie C");
        manager.addNewMovie("Movie D");
        manager.addNewMovie("Movie E");


        String[] actual = manager.findLast();
        String[] expected = {"Movie E", "Movie D", "Movie C", "Movie B", "Movie A"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast4() {
        MovieManager manager = new MovieManager();
        manager.addNewMovie("Movie A");
        manager.addNewMovie("Movie B");
        manager.addNewMovie("Movie C");
        manager.addNewMovie("Movie D");

        String[] actual = manager.findLast();
        String[] expected = {"Movie D", "Movie C", "Movie B", "Movie A"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLim6() {
        MovieManager manager = new MovieManager(6);
        manager.addNewMovie("Movie A");
        manager.addNewMovie("Movie B");
        manager.addNewMovie("Movie C");
        manager.addNewMovie("Movie D");
        manager.addNewMovie("Movie E");


        String[] actual = manager.findLast();
        String[] expected = {"Movie E", "Movie D", "Movie C", "Movie B", "Movie A"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLim4() {
        MovieManager manager = new MovieManager(4);
        manager.addNewMovie("Movie A");
        manager.addNewMovie("Movie B");
        manager.addNewMovie("Movie C");
        manager.addNewMovie("Movie D");


        String[] actual = manager.findLast();
        String[] expected = {"Movie D", "Movie C", "Movie B", "Movie A"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast5() {
        MovieManager manager = new MovieManager();
        manager.addNewMovie("Movie A");
        manager.addNewMovie("Movie B");
        manager.addNewMovie("Movie C");
        manager.addNewMovie("Movie D");
        manager.addNewMovie("Movie E");
        manager.addNewMovie("Movie F");
        manager.addNewMovie("Movie G");
        manager.addNewMovie("Movie H");
        manager.addNewMovie("Movie I");
        manager.addNewMovie("Movie J");


        String[] actual = manager.findLast();
        String[] expected = {"Movie J", "Movie I", "Movie H", "Movie G", "Movie F"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast6() {
        MovieManager manager = new MovieManager(6);
        manager.addNewMovie("Movie A");
        manager.addNewMovie("Movie B");
        manager.addNewMovie("Movie C");
        manager.addNewMovie("Movie D");
        manager.addNewMovie("Movie E");
        manager.addNewMovie("Movie F");
        manager.addNewMovie("Movie G");
        manager.addNewMovie("Movie H");
        manager.addNewMovie("Movie I");
        manager.addNewMovie("Movie J");


        String[] actual = manager.findLast();
        String[] expected = {"Movie J", "Movie I", "Movie H", "Movie G", "Movie F", "Movie E"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast2() {
        MovieManager manager = new MovieManager(2);
        manager.addNewMovie("Movie A");
        manager.addNewMovie("Movie B");
        manager.addNewMovie("Movie C");
        manager.addNewMovie("Movie D");
        manager.addNewMovie("Movie E");
        manager.addNewMovie("Movie F");
        manager.addNewMovie("Movie G");
        manager.addNewMovie("Movie H");
        manager.addNewMovie("Movie I");
        manager.addNewMovie("Movie J");


        String[] actual = manager.findLast();
        String[] expected = {"Movie J", "Movie I"};

        assertArrayEquals(expected, actual);
    }
}