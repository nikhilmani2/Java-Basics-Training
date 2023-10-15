package DAY4;
//NOTE:we can not create an object of abstract class and interface

abstract class Vehicle {
	abstract void brake();
	void getDAta() {
		System.out.println("Non-abstract method inside Abstract class");
	}
	//static, final, default
}

class Car extends Vehicle{
	@Override
	void brake() {
		System.out.println("Manufacturing a brake for a car");
	}	
}


public class AbstractDemo {

	public static void main(String[] args) {
		Car c = new Car();
		c.brake();
		c.getDAta();
	}
}