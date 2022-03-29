package com.jurnal06.sorting;

import java.util.Comparator;

/**
 * Implementasi Comparable untuk Sorting
 * untuk data Movie. Diambil dari
 * https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
 * dengan sedikit perubahan
 */
public class Movie implements Comparable<Movie>{
    private double rating;
    private String name;
    private int year;

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie o) {
        return this.getYear() - o.getYear();
    }
}
