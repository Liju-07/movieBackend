package com.nestdigital.Moviebackendapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "movies")
@Entity

public class MovieModel {
    @Id
    @GeneratedValue

    public int id;
    public String movieName;
    public String releaseYear;
    public String language;

    public MovieModel(int id, String movieName, String releaseYear, String language) {
        this.id = id;
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.language = language;
    }

    public MovieModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
