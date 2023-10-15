package DAY1;

public class TypeCast {

	public static void main(String[] args) {

		int m=70;
		
		byte n=(byte)m;//narrowing
		
		//widening
		long l = m; // since integer is smaller no error will be there, this is automatic type conversion
		//implicit & explicit
		System.out.println(n);
		System.out.println(l);
	}

}
