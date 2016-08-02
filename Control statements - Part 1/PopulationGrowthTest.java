import java.util.Scanner;

public class PopulationGrowthTest
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter current population(in millions): ");
		long pop = scan.nextLong();

		System.out.printf("\nPlease enter growth rate:");
		float growth = scan.nextFloat();

		System.out.printf("\nPlease enter amount of years to predict:");
		int years = scan.nextInt();

		PopulationGrowth populationGrowth = new PopulationGrowth();
		populationGrowth.growthCalculator(pop, growth, years);
	}
}