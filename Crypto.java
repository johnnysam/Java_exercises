public class Crypto
{
	public int encode(int x)
	{
		int[] xDigits = new int[4];
		int i=0;
		int input = x;
		while (x!=0)
		{
			xDigits[i] = x%10;
			x /= 10;
			xDigits[i] = (xDigits[i] + 7)%10;
			i++;
		}

		int temp;
		temp = xDigits[0];
		xDigits[0] = xDigits[2];
		xDigits[2] = temp;

		temp = xDigits[1];
		xDigits[1] = xDigits[3];
		xDigits[3] = temp;

		String output = "" + xDigits[0] + xDigits[1] + xDigits[2] + xDigits[3];
		


		return Integer.parseInt(output);

	}

	public int decode(int x)
	{
		int[] xDigits = new int[4];
		int i=0;
		int input = x;
		while (x!=0)
		{
			xDigits[i] = x%10;
			x /= 10;
			xDigits[i] = (xDigits[i] + 3)%10;
			i++;
		}


		int temp;
		temp = xDigits[0];
		xDigits[0] = xDigits[2];
		xDigits[2] = temp;


		temp = xDigits[1];
		xDigits[1] = xDigits[3];
		xDigits[3] = temp;

		String output = "" + xDigits[0] + xDigits[1] + xDigits[2] + xDigits[3];
		


		return Integer.parseInt(output);

	}
}