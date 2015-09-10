/*
 * Project: AdvancedCalculator.java
 * Description: A more advanced calculator that takes user input and has a switch structure
 * Name: Seunghoon Park
 * Date: 10 September 2015
 */
import java.util.Scanner;
public class AdvancedCalculator {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Make your arithmetic choice below:");
		System.out.println("A. Addition\tS. Subtraction\tM. Multiplication\tD. Division");
		// char = '' single quotes and NO double quotes
		// String = "" double quotes and NO single quotes
		// ch != choice, as you can't put String into char
		String choice;
		char ch;
		double d1, d2;
		choice = scan.nextLine();
		ch = choice.charAt(0);
		/*if (ch != 'a' || ch != 'A' || ch != 's' || ch != 'S' || ch != 'm' || ch != 'M' || ch != 'd' || ch != 'D') {
			System.out.println("ERROR EXCEPTION: char is not defined as choice.\n\nTROUBLESHOOT:\n\nPlease check whether you entered one of the options.");
		}*/
		/*else {*/
			System.out.println("Enter the first number: ");
			d1 = scan.nextDouble();
			System.out.println("Enter the second number: ");
			d2 = scan.nextDouble();
			// switch to choose which operand to use.
			switch(ch) {
				case 'A':
				case 'a':
					System.out.println(d1 + "+" + d2 + "=" + (d1+d2));
					break;
				case 'S':
				case 's':
					System.out.println(d1 + "-" + d2 + "=" + (d1-d2));
					break;
				case 'M':
				case 'm':
					System.out.println(d1 + "*" + d2 + "=" + (d1*d2));
					break;
				case 'D':
				case 'd':
					System.out.println(d1 + "/" + d2 + "=" + (d1/d2));
					break;
				default:
					System.out.println("ERROR EXCEPTION: char is not defined as choice.\n\nTROUBLESHOOT:\n\nPlease check whether you entered a, s, m, or d.");
		/*}*/
		}
	}
}