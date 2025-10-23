package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

    // Data or Class variables for object ----------
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;



    //Constructor method ----------
    public Dealership(String address, String name, String phone) {
        this.address = address;
        this.inventory = new ArrayList<>();
        this.name = name;
        this.phone = phone;
    }


    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max ){
       return null;
    }

    public ArrayList<Vehicle> getVehicle


}
