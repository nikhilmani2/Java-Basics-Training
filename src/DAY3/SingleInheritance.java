package DAY3;

class Vehicle//Parent class or super class or base class
{
	int model;
	String name;
	
	Vehicle(){
		System.out.println("Default constructor");
	}
	
	void getData() {
		
	}
	void display() {
		System.out.println(model + " " + name);
	}
}

class Car extends Vehicle //child of vehicle class
{
	void putData() {
		System.out.println("Car can have its own properties");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Car c =new Car();
		c.model=2012;
		c.name="VW POLO";
		c.display();
		c.putData();
	}

}
