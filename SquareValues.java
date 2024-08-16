package assignment27;

import java.util.HashMap;

public class SquareValues {
    public static void main(String[] args) {
        // Create the HashMap
        HashMap<Integer, Integer> my_data = new HashMap<>();

        for (int i = 1; i <= 15; i++) {
            my_data.put(i, i * i);
        }

        // Print the HashMap
        for (int key : my_data.keySet()) {
            System.out.println("Key: " + key + ", Value (Square): " + my_data.get(key));
        }
    }
}
