package assignment27;

public class StringReversal {
    public static void main(String[] args) {
        
        String original = "abhi";
        
        String reversed = reverseString(original);
        
        // Print the original string
        System.out.println("Original string: " + original);
        
        // Print the reversed string
        System.out.println("Reversed string: " + reversed);
    }

    // Method to reverse a given string
    public static String reverseString(String str) {
        
        StringBuilder sb = new StringBuilder(str);
        
        // Reverse the string and convert it back to a string
        return sb.reverse().toString();
    }
}