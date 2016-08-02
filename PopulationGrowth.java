import java.util.Calendar;

public class PopulationGrowth
{
	public void growthCalculator(long population, double growth, int years)
	{
		if (population <= 0 || years <= 0)
		{
			System.out.println("Wrong input given.");
			return;
		}

		long populationPrediction = population;
		int doublingYear = -1;

		System.out.println("Year: Predicted population");

		int curYear = Calendar.getInstance().get(Calendar.YEAR);
		for (int i = curYear+1; i <= (curYear + years); i++)
		{
			populationPrediction += (int)(population * growth);
			if (populationPrediction > population*2 && doublingYear == -1)
				doublingYear = i;
			System.out.printf("%d: \t\t%d mln\n", i, populationPrediction);
		}

		if (doublingYear != -1)
			System.out.printf("Population is predicted to have doubled by year: %d\n",
				doublingYear);
	}
}