package DAY2;

import java.util.Scanner;

public class ArrayQues {

	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter five values: ");
		for(int i=0;i<5;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Your array: ");
		for(int i :arr) {
			System.out.println(i);
		}
		sc.close();
	}

}
