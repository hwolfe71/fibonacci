/**
 * fibb.java
 * @author: Herb Wolfe Jr <hwolfe71@gmail.com>
 *
 * Simple program to display a sequence of fibonnaci numbers.
 *
 * TODO: allow user to pass count as command line parameter.
 */

import java.util.*;

public class fibb {
	public static void main(String[] argv) throws Exception {
		int f1, f2, f3, count, max = 50;
		Boolean badVal;
		String tmp;

		do {
			badVal = false;

			System.out.print("Enter how many fibbonacci numbers to print: ");

			Scanner in = new Scanner(System.in);
			tmp = in.next();

			count = Integer.parseInt(tmp);
			if ((count > max) || (count < 3)) {
				System.out.println("Try a number between 3 and " + max);
				badVal = true;
			} else {
				f1 = f2 = 1;
				System.out.print(f1);
				System.out.print(" ");
				System.out.print(f2);
				System.out.print(" ");
				for (int i=3; i<=count; i++) {
					f3 = f1+f2;
					System.out.print(f3);
					System.out.print(" ");
					f1 = f2;
					f2 = f3;
				}
				System.out.println();
			}
		} while(badVal);
	}
}
