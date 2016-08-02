import java.util.Scanner;


public class CryptoTest
{
	public static void main (String[] args)
	{
		Crypto mCrypto = new Crypto();
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter number to encode or -1 to quit: ");
		int input = scan.nextInt();

		while (input != -1)
		{
			int output = mCrypto.encode(input);

			System.out.printf("Encoded %d to %d\n", input, output);

			int decode = mCrypto.decode(output);

			System.out.printf("Decoded %d to %d\n", output, decode);

			System.out.print("Please enter number to encode or -1 to quit: ");
			input = scan.nextInt();
		}
	}
}