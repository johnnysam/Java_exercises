import java.util.Scanner;
import java.util.Random;

public class LearnToMultiply{

    private static final Random randomNumbers = new Random();
    private static boolean flag = false;

    public static void main ( String[] args ){

        Scanner input = new Scanner(System.in);
        int answer;
        int mode;
        int counter = 0;
        int correctCounter = 0;

        System.out.printf("Please choose mode:\nType 1 for practice\nType 2 for test\n");

        mode = input.nextInt();
        if (mode != 1 && mode != 2)
        System.out.println("Wrong choice. Exiting...");

        while ( (!flag && mode == 1) || (counter < 10 && mode == 2) )
        {
            int multiplier1 = randomNumbers.nextInt(10);
            int multiplier2 = randomNumbers.nextInt(10);

            if (mode == 1)
                System.out.printf("How much is %d times %d? (Type -1 to exit application)\n", multiplier1, multiplier2);
            else if (mode == 2)
                System.out.printf("How much is %d times %d?\n", multiplier1, multiplier2);

            answer = input.nextInt();
            if ( answer == -1 && mode == 1)
            {
                flag = true;
                System.out.println("Exiting...");
            }
            else
            {
                if (answer == multiplier1 * multiplier2)
                {
                    correctMessage();
                    correctCounter++;
                }
                else
                {
                    falseMessage();
                }
                counter++;
            }
        }

        if ( mode == 2 )
            System.out.printf("\n%.2f%% answer were correct!\n", ((float)correctCounter/counter)*100 );

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
