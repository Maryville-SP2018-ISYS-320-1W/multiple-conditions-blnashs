/*
	ISYS 320
	Name(s): Nash
	Date: 4/8/18
*/

public class P5_ShapeChooser {

	public static void main(String[] args) {
		System.out.println("Please choose tri to print a triangle or box to print a box");

	}
	
	private static void drawBox() {
		for( int row = 1; row <=5; row++ ) {
			for( int col = 1; col <=9; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void drawTri() {
		for( int row = 1; row <=5; row++ ) {
			for( int col = 1; col <= 5 - row; col++) {
				System.out.print(" ");
			}
			
			for( int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
