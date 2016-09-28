import java.util.Scanner;

// Method and test to find if a number is Armstrong
public class ArmstrongTest
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to check if it is Armstrong: ");
        int number = input.nextInt();

        System.out.printf("Number %d is%s an Armstrong number",
            number, isArmstrong(number) ? "" : " not");
    }

    public static boolean isArmstrong(int number)
    {
        int result = 0;
        int original = number;
        while(number!=0)
        {
            int remainder = number % 10;
            result += remainder*remainder*remainder;
            number /= 10;
        }

        if ( original == result )
            return true;
        else
            return false;
    }
}
