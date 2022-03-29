package com.jurnal06.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie(8.1, "How to Train Your Dragon", 2010));
        list.add(new Movie(8.3, "Avengers: Endgame", 2019));
        list.add(new Movie(8.3, "Your Name", 2016));
        list.add(new Movie(8.2, "Toy Story 3", 2010));
        list.add(new Movie(8.4, "Avengers: Infinity War", 2018));
        System.out.println("Movies before sorting : ");
        for (Movie movie : list) {
            System.out.println(movie.getName() + "-" +
                    movie.getRating() + "-" +
                    movie.getYear());
        }
        Collections.sort(list);
        System.out.println("\nMovies after sorting : ");
        for (Movie movie : list) {
            System.out.println(movie.getName() + "-" +
                    movie.getRating() + "-" +
                    movie.getYear());
        }
    }
}
