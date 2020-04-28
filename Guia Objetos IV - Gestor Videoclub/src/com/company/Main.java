package com.company;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        ///CREATING VIDEO MANAGEMENT

        VideoClub management = new VideoClub();

        ///CREATING MOVIES

        Movie hardToKill = new Movie("Action", "Hard to Kill", "August 20, 2001", 85, "ATP", "IT", "Nice film, too much guns piupiupiu", 3, 1);
        Movie indianaJones = new Movie("Adventure", "Indiana Jones", "April 10, 1865", 42, "R", "AR", "Indiana jones it's an adventurer and has a whip ", 3, 0);
        Movie click = new Movie("Comedy", "Click", "April 10, 1965", 420, "PG", "AR", "A remote control with strange powers", 3, 4);
        Movie elProfesor = new Movie("Drama", "El Profesor", "April 10, 1322", 412, "R", "AR", "The life of the professor", 3, 8);
        Movie harryPotter = new Movie("Adventure", "Harry Potter", "June 15, 1930", 452, "PG", "AR", "Magicians and sorcery", 3, 16);
        Movie jackSparrow = new Movie("Action", "Jack Sparrow", "May 12, 1999", 482, "PG", "AR", "A pirate that explores the sea", 3, 3);
        Movie mirthaLegrand = new Movie("Horror", "Mirtha Legrand", "October 2, 1930", 942, "R", "AR", "The professor Gonzalo having lunch with Markitos and other professors", 3, 44);
        Movie gonzalosLife = new Movie("Documentary", "Gonzalo's Life", "January 11, 2020", 1242, "R", "AR", "The life of the professor Gonzalo", 3, 33);

        ///ADDING MOVIES TO MANAGEMENT ARRAY LIST

        management.addMovie(hardToKill);
        management.addMovie(indianaJones);
        management.addMovie(click);
        management.addMovie(elProfesor);
        management.addMovie(harryPotter);
        management.addMovie(jackSparrow);
        management.addMovie(mirthaLegrand);
        management.addMovie(gonzalosLife);

        ///CREATING CLIENTS

        Client gonza = new Client("Gonzalo", 22361231, "neuquen 1111");
        Client pedro = new Client("Peter", 22361232, "fake street 1111");
        Client carlos = new Client("Carl", 22361222, "new york 1111");
        Client uriel = new Client("Uriel", 22354231, "quintana 1111");

        ///ADDING CLIENTS TO MANAGEMENT ARRAY LIST

        management.addClient(gonza);
        management.addClient(pedro);
        management.addClient(carlos);
        management.addClient(uriel);

        ///SHOW CATALOGUE WITH ALL MOVIES

        System.out.println("CATALOGUE:\n");
        management.showMovies();
        System.out.println("\n\n\n");

        ///TEST RENT FUNCTION
        //FAKE MOVIE
        System.out.println("---------------------------------------------------------");
        management.rentMovie("Ghost Hunters","gonza",123456);
        //FAKE CLIENT
        System.out.println("---------------------------------------------------------");
        management.rentMovie("Hard to Kill","Gonza",22361231);
        //REAL MOVIE
        System.out.println("---------------------------------------------------------");
        management.rentMovie("Hard to Kill","Gonzalo",22361231);
        System.out.println("---------------------------------------------------------");
        management.rentMovie("Indiana Jones","Gonzalo",22361231);
        System.out.println("---------------------------------------------------------");
        management.rentMovie("Mirtha Legrand","Gonzalo",22361231);
        //SHOW MOVIE TO SEE STOCK --
       // management.showOneMovie("Hard to Kill");

        //MOST RENTED ON TOP, DECLINING
        System.out.println("---------------------------------------------------------");
        management.getSortedByTimesRented();
        management.moviesByGenre("Action");

        //RETURN MOVIE

        management.returnMovie("Mirtha Legrand","Gonzalo");

        //SHOW LAST RENTS FOR SPECIFIC CLIENT
        //System.out.println("\n\nLAST RENTS OF *CLIENT*: ");
        //management.showLastRentsForClient("Gonzalo");

        //SHOW ALL RENTS
        management.showRent();

        //SHOW 2 MOST RENTED MOVIES
        //management.showMostRented();

    }

}