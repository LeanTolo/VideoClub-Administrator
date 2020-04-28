package com.company;

import java.util.Objects;

public class Movie {

    private String genre;
    private String title;
    private String date;
    private double duration;
    private String classification;
    private String originCountry;
    private String description;
    private int stock;
    private int timesRented;


    public Movie(){}

    public Movie(String genre, String title, String date, double duration, String classification, String originCountry, String description, int stock, int timesRented){
        this.genre = genre;
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.classification = classification;
        this.originCountry = originCountry;
        this.description = description;
        this.stock = stock;
        this.timesRented = timesRented;
    }


    public double getDuration() {
        return duration;
    }

    public int getTimesRented() {
        return timesRented;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public String getClassification() {
        return classification;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setTimesRented(int timesRented) {
        this.timesRented = timesRented;
    }

    @Override
    public String toString(){
        return ("\nTitle: "+this.title+"\nGenre: "+this.genre+
                "\nDate: "+this.date+"\nDuration: "+this.duration+
                "\nClassification: "+this.classification+ "\nOrigin Country: "+this.originCountry+
                "\nDescription: "+this.description+"\nStock: "+this.stock+
                "\nTimes Rented: "+this.timesRented);

    }

    @Override
    public int hashCode() {
        return Objects.hash(genre, title, date, duration, classification, originCountry, description, stock, timesRented);
    }
}
