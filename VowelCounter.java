package assignment27;

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        countVowelsAndConsonants(input);
        
        scanner.close();
    }

    public static void countVowelsAndConsonants(String str) {
      
        str = str.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') { 
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}