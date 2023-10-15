package DAY4;

interface Vehicle_Demo{

	

	final static int modelNo = 2023;

	//abstract method

	void brake();

	//static method

	static void message() {

		System.out.println("Static method inside interface");

	}

	//default

	default void info() {

		System.out.println("default method inside interface.");

	}

	

}

 

class Implementation implements Vehicle_Demo {

 

	@Override

	public void brake() {

		System.out.println("Implementation is done here in class.");

		

	}

	

}

 

 

public class InterfaceDemo3 {

 

	public static void main(String[] args) {

		Implementation i = new Implementation();

		i.brake();

		i.info();

		System.out.println(i.modelNo);

		Vehicle_Demo.message();

	}

 

}