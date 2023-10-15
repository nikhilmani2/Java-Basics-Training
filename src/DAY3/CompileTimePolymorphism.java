package DAY3;

class Calculator{
	
	void add(int a,int b) {
		System.out.println(a+b);
		System.out.println("int,int");
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
		System.out.println("int,int,int");
	}
	
	void add(float a ,float b) {
		System.out.println(a+b);
		System.out.println("float,float");
	}
	
	void add(int a, float b){
		System.out.println(a+b);
		System.out.println("int,float");
	}
}

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(12,12);
		c.add(12.5f, 34.4f);
		c.add(12, 12,20);
		c.add(12,12.5f);
	}

}
