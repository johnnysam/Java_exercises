import java.util.Scanner;

public class GradeBookTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		GradeBook myGradeBook = new GradeBook("Java 101");

/*		System.out.println("Please enter course name: ");
		String nameOfCourse = input.nextLine();
		myGradeBook.setCourseName(nameOfCourse);
		System.out.println();
*/
		myGradeBook.displayMessage();
		myGradeBook.determineClassAverage();
	}
}