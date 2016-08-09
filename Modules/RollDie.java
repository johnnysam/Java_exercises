// Simple Java to to show the likelihood of die throws
// using Random. By default does 6mln die throws.

import java.util.Random;

public class RollDie
{
    public static void main( String[] args)
    {
        Random randomNumbers = new Random();

        int[] freq = new int[6]; // by default initialized to 0
        
        int face;

        for (int roll = 1; roll <= 6000000; roll++)
        {
            face = 1 + randomNumbers.nextInt(6);

            switch (face)
            {
                case 1:
                    freq[0]++;
                    break;
                case 2:
                    freq[1]++;
                    break;
                case 3:
                    freq[2]++;
                    break;
                case 4:
                    freq[3]++;
                    break;
                case 5:
                    freq[4]++;
                    break;
                case 6:
                    freq[5]++;
                    break;
            }
        }
        System.out.println( "Face\tfrequency");
        for (int i = 0; i < 6; i++)
            System.out.printf("%d\t%d\n", i+1, freq[i]);
    }
}