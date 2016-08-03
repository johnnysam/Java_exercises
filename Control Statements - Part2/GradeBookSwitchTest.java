// To test GradeBookSwitch


public class GradeBookSwitchTest
{
	public static void main(String[] args)
	{
		GradeBookSwitch gradeBook = new GradeBookSwitch("Java 101");

		gradeBook.displayMessage();

		gradeBook.inputGrades();

		gradeBook.displayGradeReport();
	}
}