import java.util.Scanner;

/*
ISYS 320
Name(s):Barbara Nash
Date: 4/8/18
*/

/*  eliminated word scanner
 
  
 */

public class P1_FavoriteColor {

	private static Scanner console;

	public static void main(String[] args) {
		console = new Scanner(System.in);
		
		System.out.print("What is your favorite color? ");
		String name = console.next();
		
		if(name == "blue") {
			System.out.println("Mine too!");
		}

	}

}
