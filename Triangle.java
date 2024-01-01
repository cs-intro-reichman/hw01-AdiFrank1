/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		/*
  		#feedback:
    		seems like the value you print is the same of the if\else.
		Also, the whole text format is the same, maybe it's better to not use condition here, but boolean variable.

		*/
		boolean isTriangle = ((a+b > c) && (b+c >a) && (a+c > b));
		System.out.println(a + ", " + b + ", "+ c + ": "+ isTriangle);
	
	}
}
