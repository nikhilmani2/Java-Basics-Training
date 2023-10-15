package DAY4;

public class ExceptionHandlingAssig {

	public static void main(String[] args) {
		
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException npe){
			System.out.println("Null Pointer Exception");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		finally {
			System.out.println("Exception is Handled");
		}
		
	}

}
