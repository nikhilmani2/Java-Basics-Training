package DAY2;

public class RightHandTriangle {

	public static void main(String[] args) {
		for(int k=0;k<5;k++) {
			for(int l=4;l>k;l--) {
				System.out.print("   ");
			}
			for(int x=0;x<=k;x++) {
			System.out.print(" * ");
			}
			System.out.println();

		}
	}

}
