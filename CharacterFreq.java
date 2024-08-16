package assignment27;

public class CharacterFreq
{
    public static void main(String[] args) 
    {
        String str = "abhishek";     //  Define the input string

        int[] freq = new int[128]; // Array to store frequency of characters

        for (char c : str.toCharArray())         //  iterate through each character in the string

        {
            freq[c]++;            //  increment the corresponding index in the frequency array

        }

        for (int i = 0; i < 128; i++)         //  Iterate through the frequency array to print the character frequencies

        {
            if (freq[i] > 0)// check the charectors is non zero
            {
                System.out.println((char) i + ": " + freq[i]);// print the frequency
            }
        }
    }
}
