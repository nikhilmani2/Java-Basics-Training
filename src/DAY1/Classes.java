package DAY1;

public class Classes {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();//Permission line
		float area = r.length * r.breadth;
		System.out.println("Area of the Rectangle : "+ area);
		//length * breadth = area 2.5 * 3.5 = 8.75
		System.out.println(r.length+"*"+r.breadth +"="+area);
		
		//Addition of two numbers
		Addition a= new Addition();
		float sum = a.firstnum + a.secondnum;
		System.out.println("Adiition of two numbers : "+ sum);
	}

}

class Rectangle
{
	//Data members
	float length = 2.5f;
	float breadth = 3.5f;	
}

class Addition
{
	//Data members
	float firstnum=8.3f;
	float secondnum=1.7f;
}