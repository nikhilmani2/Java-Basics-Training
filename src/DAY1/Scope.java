package DAY1;

public class Scope {
	//instance variable
	int a =10;
	int b =20;
	public static void main(String[] args) {
		//local variable
		//since i made the local variable a constant variable using the access 
		//modifier final so i can not change it
		final String name ="Scope of a variable";
		System.out.println(name);
		//name ="Variable"; it can't be done
		
		//reference variable
		Square s =new Square();
		System.out.println("Area of the square : "+ s.side * s.side);
	}
	void add() {
		System.out.println(a+b);


	}
	void sub() {
		System.out.println(a-b);
	}

}
class Square{
	float side=3.0f;
}
