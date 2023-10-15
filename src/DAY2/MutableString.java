package DAY2;

public class MutableString {

	public static void main(String[] args) {
		StringBuilder b =new StringBuilder("Nikhil");
		StringBuffer buff =new StringBuffer("Intern");
		System.out.println(b.append("Ishaan"));
		System.out.println(b);
		System.out.println(b.getClass());
		System.out.println(b.delete(0, 2));
		System.out.println(b.isEmpty());
		
	}

}
