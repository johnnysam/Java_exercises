import java.util.Scanner;

// Method and test to find if a number is Armstrong
public class PrimeTest
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to check if it is a prime: ");
        int number = input.nextInt();

        System.out.printf("Number %d is%s a Prime number",
        number, isPrime(number) ? "" : " not");
    }

    public static boolean isPrime(int number)
    {
        //check if n is a multiple of 2
        if (number%2 == 0) return false;
        /*if not, then just check the odds.
          you really only have to go up to the square root of n,
          because if you list out all of the factors of a number,
          the square root will always be in the middle
        */
        for(int i=3;i*i<=number;i+=2) {
            if(number%i==0)
            return false;
        }
        return true;
    }
}
