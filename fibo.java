/**
 * fibo.java
 * @author: Herb Wolfe Jr <hwolfe71@gmail.com>
 *
 * Simple program to display a sequence of Fibonnaci numbers.
 */

import static java.lang.System.*;
import java.util.*;

public class fibo {
	public static void main(String[] argv) throws Exception {
		int f1, f2, f3, count = 0, max = 50;
		boolean badVal;
		String tmp;

		if (argv.length == 0) {
			badVal = true;
		} else {
			badVal = false;
			try {
				count = Integer.parseInt(argv[0]);
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
		out.print(f1);
		out.print(" ");
		out.print(f2);
		out.print(" ");
		for (int i = 3; i <= count; i++) {
			f3 = f1+f2;
			out.print(f3);
			out.print(" ");
			f1 = f2;
			f2 = f3;
		}
		out.println();
	}
}
