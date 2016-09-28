public class SwapNumbersWithoutThirdVariable {

    // Swapping two ints without using a third variable
    public static void main(String[] args) {

        if (args.length != 2)
        {
            System.out.println("Please enter 2 number arguments");
            System.exit(0);
        }
        try
        {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            System.out.println("Before Swapping");
            System.out.println("Value of num1 is :" + num1);
            System.out.println("Value of num2 is :" +num2);

            //add both the numbers and assign it to first
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;

            System.out.println("Before Swapping");
            System.out.println("Value of num1 is :" + num1);
            System.out.println("Value of num2 is :" +num2);
        }
        catch( Exception ex )
        {
            System.out.println(ex);
            ex.printStackTrace();
        }
    }
}
