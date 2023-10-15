package DAY3;

class Rectangler
{
	int length,breadth;
	float l,b;

	Rectangler() {

		System.out.println("Default Constructor");
	}

	

	Rectangler(int length,int breadth){

		this();

		this.length = length;

		this.breadth = breadth;

	}

	

	Rectangler(float l,float b){

		this(20,50);

		this.l = l;

		this.b = b;

	}

	

	/*

	 * void getData(int l,int b) { length = l; breadth = b; }

	 */

	

	int calculateArea() {

		int area = length * breadth;
		return area;

	}

	

	void calculateFloat() {

		System.out.println(l*b);

	}

}

public class ConstructorOverloading {

 

	public static void main(String[] args) {

		//Rectangle r1 = new Rectangle();

		Rectangler r = new Rectangler(12.5f,30.6f);

		

		r.calculateFloat();

		//r.length = 20;
		//r.breadth = 30;
		//r.getData(12, 30);

		int area = r.calculateArea();

		System.out.println(area);

 

	}

 

}
