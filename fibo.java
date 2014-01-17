/**
 * fibo.java
 * @author: Herb Wolfe Jr <hwolfe71@gmail.com>
 *
 * Simple program to display a sequence of Fibonnaci numbers.
 *
 * Notes: The 46th number is the largest in the sequence that can be stored
 * in an int. The 92nd number is the largest that can be stored in a long
 */

import static java.lang.System.*;
import java.util.*;

public class fibo {
	public static void main(String[] argv) throws Exception {
		long f1, f2, f3;
		int count = 0, max = 92;
		boolean badVal;
		String tmp;

		if (argv.length == 0) {
			badVal = true;
		} else {
			badVal = false;
			try {
				count = Integer.parseInt(argv[0]);
				if ((count > max) || (count < 3)) {
					badVal = true;
				}
			} catch (NumberFormatException ex) {
				// parameter isn't an integer
				badVal = true;
			}
		}

		while (badVal) {
			out.print("Enter how many Fibonacci numbers to print: ");

			Scanner in = new Scanner(System.in);
			tmp = in.next();

			count = Integer.parseInt(tmp);
			if ((count > max) || (count < 3)) {
				out.println("Try a number between 3 and " + max);
			} else {
				badVal = false;
			}
		} // end while (badVal)	

		f1 = f2 = 1;
		out.println("Fibonacci #1 is: " + f1);
		out.println("Fibonacci #2 is: " + f2);
		for (int i = 3; i <= count; i++) {
			f3 = f1+f2;
			out.println("Fibonacci #" + i + " is: " + f3);
			f1 = f2;
			f2 = f3;
		}
		out.println();
	}
}
