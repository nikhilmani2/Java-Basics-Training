package DAY2;


class Calculator
{
	int a,b;
	void add() {
		System.out.println(a+b);
	}
	void sub() {
		System.out.println(a-b);
	}
	void multiplication() {
		System.out.println(a*b);
	}
	void division() {
		System.out.println(a/b);
	}
	
}

public class ClassDemo {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.a=20;
		c.b=30;
		c.add();
		c.sub();
		c.division();
		c.multiplication();
		Calculator c1=new Calculator();
		c1.a=50;
		c1.b=70;
		c1.add();
	}

}
