package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.PosterManager;

public class PostManagerTest {


    @Test
    public void shouldAdd0Poster() {
        PosterManager manager = new PosterManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdd1Poster() {
        PosterManager manager = new PosterManager();
        manager.savePoster("Poster1");

        String[] expected = {"Poster1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdd5Poster() {
        PosterManager manager = new PosterManager();
        manager.savePoster("Poster1");
        manager.savePoster("Poster2");
        manager.savePoster("Poster3");
        manager.savePoster("Poster4");
        manager.savePoster("Poster5");

        String[] expected = {"Poster1", "Poster2", "Poster3", "Poster4", "Poster5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRevers5Poster() {
        PosterManager manager = new PosterManager();
        manager.savePoster("Poster1");
        manager.savePoster("Poster2");
        manager.savePoster("Poster3");
        manager.savePoster("Poster4");
        manager.savePoster("Poster5");

        String[] expected = {"Poster5", "Poster4", "Poster3", "Poster2", "Poster1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRevers3Poster() {
        PosterManager manager = new PosterManager();
        manager.savePoster("Poster1");
        manager.savePoster("Poster2");
        manager.savePoster("Poster3");


        String[] expected = {"Poster3", "Poster2", "Poster1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRevers1Poster() {
        PosterManager manager = new PosterManager();
        manager.savePoster("Poster1");


        String[] expected = {"Poster1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRevers7PosterIfLimit7() {
        PosterManager manager = new PosterManager(7);

        manager.savePoster("Poster1");
        manager.savePoster("Poster2");
        manager.savePoster("Poster3");
        manager.savePoster("Poster4");
        manager.savePoster("Poster5");
        manager.savePoster("Poster6");
        manager.savePoster("Poster7");

        String[] expected = {"Poster7", "Poster6", "Poster5", "Poster4", "Poster3", "Poster2", "Poster1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRevers3PosterifLimit5() {
        PosterManager manager = new PosterManager(5);

        manager.savePoster("Poster1");
        manager.savePoster("Poster2");
        manager.savePoster("Poster3");


        String[] expected = {"Poster3", "Poster2", "Poster1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReversLastPosterIfLimit5() {
        PosterManager manager = new PosterManager(5);

        manager.savePoster("Poster1");
        manager.savePoster("Poster2");
        manager.savePoster("Poster3");
        manager.savePoster("Poster4");
        manager.savePoster("Poster5");
        manager.savePoster("Poster6");
        manager.savePoster("Poster7");

        String[] expected = {"Poster7", "Poster6", "Poster5", "Poster4", "Poster3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
