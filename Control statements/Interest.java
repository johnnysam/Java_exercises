import java.util.Calendar;

public class Interest
{
	public static void main( String[] args)
	{
		double principal = 1000;
		double rate = 0.05;

		int year = Calendar.getInstance().get(Calendar.YEAR);

		System.out.printf("%s:%20s\n\n", "Year", "Amount on deposit");

		for ( int i = year; i <= year + 10; i++ )
		{
			principal += principal * rate;
			System.out.printf("%4d:%,20.2f\n", i, principal);
		}
	}
}