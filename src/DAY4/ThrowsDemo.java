package DAY4;

import java.io.IOException;



public class ThrowsDemo {

	

	static void check(int age) throws ArithmeticException {

		

		if(age>=18) {

			System.out.println("You are eligible to vote");

		}

		else

		{

			throw new ArithmeticException("You are not eligible to vote");

		}

	}

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		try {

			check(5);

		}

		catch(ArithmeticException e) {

			System.out.println(e.getMessage());

		}

		

		

	}

 

}