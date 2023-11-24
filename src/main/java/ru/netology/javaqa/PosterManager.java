package ru.netology.javaqa;

public class PosterManager {
    private String[] posters = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 5;

    }

    public PosterManager(int limit) {
        this.limit = limit;

    }

    public void savePoster(String poster) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;

    }

    public String[] findAll() {
        return posters;
    }

    public String[] findLast() {
        int resultAllLength;
        if (posters.length < limit) {
            resultAllLength = posters.length;
        } else {
            resultAllLength = limit;
        }

        String[] tmp = new String[resultAllLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = posters[posters.length - 1 - i];
        }
        return tmp;
    }
}


