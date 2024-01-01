/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
	double rand = Math.random();
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);

	int max = Math.max (a,b);
	int min = Math.min (a,b);

	int num1 = (int) ((Math.random () * (max-min))+min);
	int num2 = (int) ((Math.random () * (max-min))+min);
	int num3 = (int) ((Math.random () * (max-min))+min);

	/*
 	#Feedback:
  	You can use same min method twice instead of using condition for the second check.
   	Also, if you do use if\else condition, even when there's only one line of code inside, better to always use {}.
 	*/
	int minum = Math.min(num1,num2);
	minimum = Math.min(minimum,num3);

	System.out.println("The minimal generated number was: " +minum);

	}
}
