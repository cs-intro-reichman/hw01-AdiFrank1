/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);
		int quarter = num / 25;
		int cent = num % 25 ; 

		System.out.println("use " + quarter + " quarters and " + cent + " cents");
	}
}  
	