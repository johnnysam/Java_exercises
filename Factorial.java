import java.util.Scanner;

public class Factorial
{

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to calculate factorial: ");
        long num = input.nextInt();
        System.out.printf("Factorial of %d is %d\n", num, calculate(num));

    }
    public static long calculate(long n)
    {
        //System.out.printf("Calculating factorial of %d...\n", n);
        if ( n == 0 )
            return 1;
        else
            return calculate( n-1 ) * n;
    }
}
