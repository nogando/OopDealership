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

    public ArrayList<Vehicle> getVehicleByMakeModel(String make, String model){
        return null;
    }

    public ArrayList<Vehicle> getVehicleByYear(int min , int max){
        return null;

    }

    public ArrayList<Vehicle> getVehicleByColor(String color){
        return null;
    }

    public ArrayList<Vehicle> getVehicleByMileage(int min , int max){
        return null;
    }

    public ArrayList<Vehicle> getVehicleByType(String vehicleType){
        return null;
    }

    public ArrayList<Vehicle> getAllVehicles(){
        return this.inventory;
    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){

    }

}
