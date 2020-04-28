package com.company;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class VideoClub {

    private ArrayList<Movie> movies;
    private ArrayList<Client> clients;
    private ArrayList<Rentals> rentals;

    public VideoClub(){
       this.movies = new ArrayList<>();
       this.clients = new ArrayList<>();
       this.rentals = new ArrayList<>();
    }

    public void addMovie(Movie movie){
        this.movies.add(movie);
    }

    public void addClient (Client client){
        this.clients.add(client);
    }

    public void addRentals(Rentals rent){
        this.rentals.add(rent);
    }

    public void showOneMovie(String userTitle){
        System.out.println(this.movies.get(searchMovie(userTitle)).toString());
    }

    public void showMovies(){
        for (int i = 0; i< this.movies.size();i++){
            System.out.println(this.movies.get(i).toString());
        }
    }

    public void rentMovie (String userTitle,String clientName,double phone){
        if (searchMovie(userTitle)!=-1){
            if (availableCopy(searchMovie(userTitle)) == 0){
                System.out.println("There isn't stock from the movie selected");
            }else{
                if (searchClient(clientName,phone) != -1) {
                    System.out.println("\nSaving on system......");
                    this.movies.get(searchMovie(userTitle)).setStock(this.movies.get(searchMovie(userTitle)).getStock() - 1);
                    this.movies.get(searchMovie(userTitle)).setTimesRented(this.movies.get(searchMovie(userTitle)).getTimesRented() + 1);
                    Rentals rent = new Rentals(clientName, userTitle);
                    this.rentals.add(rent);
                    System.out.println("\nTICKET");
                    System.out.println(rent.toString());
                }else{
                    System.out.println("\nCurrent client doesn't exist");
                }
            }
        }
        else{
            System.out.println("The movie doesn't exist or it's not on our catalogue");
        }
    }

    public void returnMovie(String userTitle,String clientName){
        this.movies.get(searchMovie(userTitle)).setStock(this.movies.get(searchMovie(userTitle)).getStock() + 1);
        this.rentals.remove(searchRent(userTitle,clientName));
    }

    public int searchRent(String userTitle,String clientName){
        int pos=-1;
        for (int i=0;i<this.rentals.size();i++){
            if ((this.rentals.get(i).getTitle() == userTitle) && (this.rentals.get(i).getClientName() == clientName)){
                pos = i;
            }
        }
        return pos;
    }

    public void showLastRentsForClient (String clientName){
        for (int i = 0; i< this.rentals.size();i++) {
            if (this.rentals.get(i).getClientName() == clientName) {
                System.out.println(this.rentals.get(i).toString());
            }
        }
    }

    public void showRent() {
        for (int i = 0; i< this.rentals.size();i++) {
            System.out.println("\n");
            System.out.println(this.rentals.get(i).toString());
        }
    }

    public int availableCopy(int position){
        int result = 0;
        if (this.movies.get(position).getStock()>0){
            result = 1;
        }
        return result;
    }

    public int searchMovie(String userTitle){
        int pos=-1;
        for (int i=0;i<this.movies.size();i++){
            if (this.movies.get(i).getTitle() == userTitle){
                pos = i;
            }
        }
        return pos;
    }

    public int searchClient(String name,double phone){
        int i=0;
        while ((name != this.clients.get(i).getName()) && (phone != this.clients.get(i).getPhone()) && (i< this.movies.size())){
            i++;
        }
        if ((name != this.clients.get(i).getName()) || (phone != this.clients.get(i).getPhone())){
            i=-1;
        }
        return i;
    }

    public void showMostRented(){
        Movie memory1 = new Movie();
        Movie memory2 = new Movie();
        for (int i = 0; i < movies.size();i++){
            if ((memory2.getTimesRented() < movies.get(i).getTimesRented()) && (memory2.getTimesRented()<memory1.getTimesRented())){
                memory2 = movies.get(i);
            }else{
                memory1 = movies.get(i);
            }
        }
        System.out.println("\n\nMost rented Movies: \n");
        System.out.println(memory1.toString());
        System.out.println("\n");
        System.out.println(memory2.toString());
    }

    public void moviesByGenre(String genre){
        System.out.println("Movies by Genre: "+genre);
        for (int i=0; i < this.movies.size();i++){
            if(this.movies.get(i).getGenre()==genre){
                System.out.println(this.movies.get(i).toString());
            }
        }
    }

    public void getSortedByTimesRented() {
        Collections.sort(movies, new Comparator<Movie>() {

            @Override
            public int compare(Movie p1, Movie p2) {
                return new Integer(p2.getTimesRented()).compareTo(new Integer(p1.getTimesRented()));
            }
        });
    }


}
