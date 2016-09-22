public class GenericMethodTest
{
    public static void main(String[] args)
    {
    Integer[] intArray = {1, 2, 3, 4, 5};
    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
    Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

    System.out.println("Array intArray contains: ");
    printArray( intArray );
    System.out.println("Array doubleArray contains: ");
    printArray( doubleArray );
    System.out.println("Array charArray contains: ");
    printArray( charArray );
    }

    // generic method printArray
    public static <T> void printArray( T[] inputArray )
    {
        //print array elements
        for( T element : inputArray )
        System.out.printf("%s ", element);

        System.out.println();
    }
}
