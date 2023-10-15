package DAY2;

public class StringDemo {

	public static void main(String[] args) {
		String str="Nikhil";//string literal //inside scp
		String str1="Nikhil";//scp->>no duplicates so str1 and str will be mapped to same nikhil in the scp
		//if we cahange str1 then str will also get changed that is why string literal is immutable
		
		
		String strname=new String("Nikhil");//outside scp string constant pool
		char ch[]= {'n','i','k','h','i','l'};
		String strch=new String(ch);
		String str2="Glen";
		System.out.println(str.concat(str2));
		
		String temp= "Nikhil glen bihar";
		
		if(str==strname) {
			System.out.println("They are equal");
		}
		else {
			System.out.println("They are not equal");
		}//this wil give not equal
		
		
		 System.out.println(str.equalsIgnoreCase(strname));//this will give true since it matches only content
		
		 
		 if(str==str1) {
				System.out.println("They are equal");
			}
			else {
				System.out.println("They are not equal");
			}//this wil give equal since they are mapped to same object 
		
		 System.out.println(str.charAt(0));
		 System.out.println(str.compareTo(str1));
		 System.out.println(str.compareTo(str2));//it will give random number when not same
		 System.out.println(str.toUpperCase());
		 System.out.println(str.length());
		 System.out.println(temp.startsWith("Nikhil"));
		 
		 

	}

}
