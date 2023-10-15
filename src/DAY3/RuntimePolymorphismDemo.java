package DAY3;

class Shape{

	void design() {

		System.out.println("Shape..");

	}

}

 

class Circle extends Shape{

	void design() {

		System.out.println("Circle..");

	}

}

 

class Square extends Shape{

	void design() {

		System.out.println("Square..");

	}

}

 

 

public class RuntimePolymorphismDemo {

 

	public static void main(String[] args) {

		 Circle c = new Circle();

		 Square s = new Square();

		 c.design();

		 s.design();

		 //upcasting

		 Shape shape;

		 shape = new Circle();

		 shape.design();

		 shape = new Square();

		 shape.design();

		 //downcasting

 

	}

 

}
