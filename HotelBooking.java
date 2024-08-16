package assignment27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HotelBooking {

    // Define the room types and their prices per night
    static Map<String, Double> roomRates = new HashMap<>();

    static {
        roomRates.put("Single Bed Room", 500.00);
        roomRates.put("Double Bed Room", 800.00);
        roomRates.put("Family Room", 2000.00);
    }

    public static void displayRoomOptions() {
        System.out.println("Welcome to the Hotel! Here are our room options:");
        for (Map.Entry<String, Double> entry : roomRates.entrySet()) {
            System.out.println(entry.getKey() + ": " + String.format("%.2f", entry.getValue()) + " per night");
        }
    }

    public static String selectRoom() {
        Scanner scanner = new Scanner(System.in);
        String roomType = "";

        while (true) {
            System.out.print("Please select the room type you want to book: ");
            roomType = scanner.nextLine().trim();

            if (roomRates.containsKey(roomType)) {
                break;
            } else {
                System.out.println("Sorry, that room type is not available. Please choose again.");
            }
        }

        return roomType;
    }

    public static int getNumberOfNights() {
        Scanner scanner = new Scanner(System.in);
        int nights = 0;

        while (true) {
            System.out.print("How many nights would you like to stay? ");
            try {
                nights = Integer.parseInt(scanner.nextLine().trim());
                if (nights > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number of nights.");
            }
        }

        return nights;
    }

    public static double calculateTotalCost(String roomType, int nights) {
        return roomRates.get(roomType) * nights;
    }

    public static String getCustomerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        return scanner.nextLine().trim();
    }

    public static void main(String[] args) {
        String customerName = getCustomerName();
        displayRoomOptions();
        String roomType = selectRoom();
        int nights = getNumberOfNights();
        double totalCost = calculateTotalCost(roomType, nights);

        System.out.println("\nBooking Summary:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
        System.out.println("Total Cost: " + String.format("%.2f", totalCost));
    }
}
