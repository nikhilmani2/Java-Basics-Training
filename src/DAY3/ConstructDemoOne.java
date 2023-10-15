package DAY3;

class Rectangle
{
	int length,breadth;
	
	public Rectangle() {
		System.out.println("Default constructor invoked");
	}
	
	Rectangle(int l,int b)
	{
		System.out.println("Parameterized Constructor invoked");
		length =l;
		breadth=b;
	}
	
	//void getData(int l,int b) {
		//length =l;
		//breadth=b;
	//}
	
	int calculateArea() {
		int area = length*breadth;
		return area;
	}
}

public class ConstructDemoOne {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Rectangle r =new Rectangle(12,30);
		
		//r.length=20;//one way to initialize data 
		//r.breadth=30;
		
		//r.getData(12, 30);//another way to initialize data
		int area=r.calculateArea();
		System.out.println(area);
	}

}
