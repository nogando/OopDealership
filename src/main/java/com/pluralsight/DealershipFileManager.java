package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {

    public Dealership getDealership(){
        Dealership dealership = null;
        try{
            FileReader fileReader = new FileReader("Inventory.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String dealerInfo = bufReader.readLine();


            String[] dealerInfoSplit = dealerInfo.split("\\|");

            String name = dealerInfoSplit[0];
            String address = dealerInfoSplit[1];
            String phone = dealerInfoSplit[2];

            dealership = new Dealership(name,address,phone);

            String input;

            while ((input = bufReader.readLine()) != null){
                String[] barSplit = input.split("\\|");

                int vin = Integer.parseInt(barSplit[0]);
                int year = Integer.parseInt(barSplit[1]);
                String make = barSplit[2];
                String model = barSplit[3];
                String vehicleType = barSplit[4];
                String color = barSplit[5];
                int odometer = Integer.parseInt(barSplit[6]);
                double price = Double.parseDouble(barSplit[7]);

                Vehicle vehicle = new Vehicle(vin,year,make,model,vehicleType,color,odometer,price);
                dealership.addVehicle(vehicle);

            }



        }catch (Exception e) {
            System.out.println("Error Occurred! " + e.getLocalizedMessage());

        }
        return dealership;
    }

    public Dealership saveDealership(){
        return null;
    }
}
