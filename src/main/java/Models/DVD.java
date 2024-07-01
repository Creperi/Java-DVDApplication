package Models;


import javax.xml.bind.annotation.XmlRootElement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elias
 */

@XmlRootElement (name="DVD")
public class DVD{
    private String title;
    private String actors;
    private String director;
    private int duration;
    private String dub_languages;
    private String sub_languages;
    private String genre;
    private double price = 0.0f;
    private int copies = 0;
    private String ISBN;
    void setPrice(double price){
        this.price = price;
    }
    double getPrice() { return price; }
    void setCopies(int copies){
        this.copies = copies;
    }
    int getCopies() { return copies; }
    DVD(String title, String actors, String director, int duration, String dub_languages, String sub_languages, String genre, String ISBN){
        this.title = title;
        this.actors = actors;
        this.director = director;
        this.duration = duration;
        this.dub_languages = dub_languages;
        this.sub_languages = sub_languages;
        this.genre = genre;
        this.ISBN = ISBN;
    }
    String Display_product_info(){
        return "Title: " + title + "\nactors: " + actors + "\ndirector: " + director +
                "\nduration: " + Integer.toString(duration) + "\ndub_languages: " + dub_languages + 
                "\nsub_languages: " + sub_languages + "\ngenre: " + genre + "\nISBN: " + ISBN;
    }
}
