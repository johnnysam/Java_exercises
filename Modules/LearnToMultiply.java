import java.util.Scanner;
import java.util.Random;

public class LearnToMultiply{

    private static final Random randomNumbers = new Random();
    private static boolean correct = false;

    public static void main ( String[] args ){

        Scanner input = new Scanner(System.in);
        int answer;

        while (!correct)
        {
            int multiplier1 = randomNumbers.nextInt(10);
            int multiplier2 = randomNumbers.nextInt(10);

            System.out.printf("How much is %d times %d?\n", multiplier1, multiplier2);

            answer = input.nextInt();

            if (answer == multiplier1 * multiplier2)
            {
                correct = true;
                correctMessage();
            }
            else
                falseMessage();


        }
    }


    public static void correctMessage()
    {
        int choice = randomNumbers.nextInt(4);
        String message = new String();

        switch (choice)
        {
            case 0:
                message = "Very good!";
                break;
            case 1:
                message = "Excellent!";
                break;
            case 2:
                message = "Nice work!";
                break;
            case 3:
                message = "Keep up the good work!";
                break;
        }

        System.out.printf("%s\n", message);
    }

    public static void falseMessage()
    {
        int choice = randomNumbers.nextInt(4);
        String message = new String();

        switch (choice)
        {
            case 0:
                message = "No. Please try again.";
                break;
            case 1:
                message = "Wrong. Try once more.";
                break;
            case 2:
                message = "Don't give up!";
                break;
            case 3:
                message = "No. Keep trying.";
                break;
        }
        System.out.printf("%s\n", message);
    }
}
