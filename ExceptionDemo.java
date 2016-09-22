public class ExceptionDemo
{
    public static void main(String[] args)
    {
        int x = 5 , y = 0;
        try
        {
            try
            {
                System.out.println(x);
                System.out.println(x/y);
                System.out.println(y);
            }
            catch (ArithmeticException ex)
            {
                System.out.println("Inner catch1");
                throw ex;
            }
            catch (RuntimeException ex)
            {
                System.out.println("Inner catch2");
                throw ex;
            }
            finally
            {
                System.out.println("Inner finally");
            }
        }
        catch (Exception ex)
        {
            System.out.println("Outer catch");
        }
    }
}
