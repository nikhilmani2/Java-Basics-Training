package DAY2;

import java.util.Scanner;

public class SwitchcaseRange {

	public static void main(String[] args) {
		int avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your avg marks: ");
		avg= sc.nextInt();
		switch(avg) {
		case 90,91,92,93,94,95,96,97,98,99,100:
			System.out.println("A");
			break;
		case 89,88,87,86,85,84,83,82,81,80:
			System.out.println("B");
			break;
		case 79,78,77,76,75,74,73,72,71,70:
			System.out.println("C");
			break;
		case 69,68,67,66,65,64,63,62,61,60:
			System.out.println("D");
			break;
		case 59,58,57,56,55,54,53,52,51,50:
			System.out.println("E");
			break;
		default:
			System.out.println("Fail");
	}
	}

}
