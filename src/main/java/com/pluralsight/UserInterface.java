package com.pluralsight;

import java.util.Scanner;

public class UserInterface {

    Dealership dealership;

    private void init() {
        dealership = DealershipFileManager.getDealership();
    }


    public void display(){

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        String menu = """
                    =========== Menu ==========
                1 - Find vehicles within a price range
                2 - Find vehicles by make / model
                3 - Find vehicles by year range
                4 - Find vehicles by color
                5 - Find vehicles by mileage range
                6 - Find vehicles by type (car, truck, SUV, van)
                7 - List ALL vehicles
                8 - Add a vehicle
                9 - Remove a vehicle
                99 - Quit
                """;
        System.out.println(menu);


        while(running){

            int command = ConsoleHelper.promptForInt("Enter your command!");

            switch (command){
                case 1:
                    //todo 1 - Find vehicles within a price range
                    break;
                case 2:
                    //todo 2 - Find vehicles by make / model
                    break;
                case 3:
                    //todo 3 - Find vehicles by year range
                    break;
                case 4:
                    //todo 4 - Find vehicles by color
                    break;
                case 5:
                    //todo 5 - Find vehicles by mileage range
                    break;
                case 6:
                    //todo 6 - Find vehicles by type (car, truck, SUV, van)
                    break;
                case 7:
                    //todo 7 - List ALL vehicles
                    break;
                case 8:
                    //todo 8 - Add a vehicle
                    break;
                case 9:
                    //todo 9 - Remove a vehicle
                    break;
                case 99:
                    //todo 99 - Quit
                    break;
                default:
                    System.out.println("Wrong Entry...\n");
                    break;

            }



        }
    }

}
