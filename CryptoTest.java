import java.util.Scanner;


public class CryptoTest
{
	public static void main (String[] args)
	{
		Crypto mCrypto = new Crypto();
		System.out.print("Please enter number to encode: ");

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		int output = mCrypto.encode(input);

		System.out.printf("Encoded %d to %d\n", input, output);

		int decode = mCrypto.decode(output);

		System.out.printf("Decoded %d to %d\n", output, decode);

	}
}