/*
 Kevin Mattappally
 CPSC 224
 Converts from meters to kilometers, inches, or feet.
 */
// package conversionfrommeters;

import java.util.*;

public class ConversionFromMeters {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a distance in meters: ");
        double meters = scan.nextDouble();
        while (meters < 0) {
            System.out.println("\nPlease enter a positive number\n");
            System.out.print("Enter a distance in meters: ");
            meters = scan.nextDouble();
        }
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int userChoice = scan.nextInt();
            switch (userChoice) {
                case 1:
                    showKilometers(meters);
                    break;
                case 2:
                    showInches(meters);
                    break;
                case 3:
                    showFeet(meters);
                    break;
                case 4:
                    System.out.println("\nBye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nError: Invalid Number");
            }
        }
    }
    
    // takes a double meters and prints out the equivalent kilometers 
    public static void showKilometers(double meters) {
        System.out.println("\n" + meters + " meters is " + meters * 0.001 + " kilometers.\n");
    }
    
    // takes a double meters and prints out the equivalent inches 
    public static void showInches(double meters) {
        System.out.println("\n" + meters + " meters is " + meters * 39.37 + " inches.\n");
    }
    
    // takes a double meters and prints out the equivalent feet 
    public static void showFeet(double meters) {
        System.out.println("\n" + meters + " meters is " + meters * 3.281 + " feet.\n");
    }
    
    // displays the menu and gives the user options
    public static void displayMenu() {
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program\n");
    }
}
