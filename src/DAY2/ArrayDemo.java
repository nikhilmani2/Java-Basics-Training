package DAY2;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int age[]= {20,19,21,22,23,20};
		System.out.println(age[3]);
		System.out.println("#####################");
		int num[]=age;
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("For each loop");
		for(int number:age) {
			System.out.println(number);
		}
		int peopleAge[]= new int[]{12,32,45,46};
		String name[]=new String[5];
		name[0]="Ani";
		name[1]="Ann";
		name[2]="Ami";
		name[3]="Ash";
		name[4]="Any";
		for(String copyName:name) {
			System.out.println(copyName);
		}
		Arrays.sort(age);
		Arrays.parallelSort(age);
		System.out.println(Arrays.toString(Arrays.copyOfRange(peopleAge, 0, 3)));
		System.out.println(Arrays.equals(age, num));
		
	}

}
