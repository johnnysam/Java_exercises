import javax.swing.JOptionPane;

public class Addition
{
	public static void main(String[] args)
	{
		int number1 = Integer.parseInt
		(JOptionPane.showInputDialog("Give first number to add:\n"));

		int number2 = Integer.parseInt
		(JOptionPane.showInputDialog("Give second number to add:\n"));

		int sum = number1 + number2;

		String message = String.format("Result is %d\n", sum);

		JOptionPane.showMessageDialog(null, message);

	}
}