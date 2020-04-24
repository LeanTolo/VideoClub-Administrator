package com.company;

public class Client {

    private String name;
    private double phone;
    private String address;

    public Client(){}

    public Client(String name, double phone, String address){
        this.name = name;
        this.phone = phone;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public double getPhone() {
        return phone;
    }

}
