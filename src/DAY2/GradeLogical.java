package DAY2;
import java.util.Scanner;

public class GradeLogical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		marks= sc.nextInt();
		if((marks>=90)&&(marks<=100))
		{
			System.out.println("A Grade");
		}
		else if((marks>=80)&&(marks<90))
		{
			System.out.println("B Grade");
		}
		else if((marks>=70)&&(marks<80))
		{
			System.out.println("C Grade");
		}
		else if((marks>=60)&&marks<70)
		{
			System.out.println("D Grade");
		}
		else if((marks>=50)&&(marks<60))
		{
			System.out.println("E Grade");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
