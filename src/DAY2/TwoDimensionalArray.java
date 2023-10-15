package DAY2;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int multiplication[][]=new int [3][3];
		for(int i=0;i<multiplication.length;i++) {
			for(int j=0;j<multiplication.length;j++) {
				multiplication[i][j]=i+j;
			}
		}
		for(int i=0;i<multiplication.length;i++) {
			for(int j=0;j<multiplication.length;j++) {
				System.out.println(multiplication[i][j]);
			}
		}
	}

}
