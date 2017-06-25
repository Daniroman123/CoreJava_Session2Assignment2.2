/*Write a program to print the following statement
  a  
 aba 
abcba
 aba 
  a  
 
 Formatting and indentation is done automatically by SaveActions setting in Eclipse */
public class ABCpattern {

	public static void main(String[] args) {
		for (int i = -2; i < 3; i++) { // Iterator for i going from -2 to 2
			for (int j = -2; j < 3; j++) { // Iterator for j going from -2 to 2
				if ((Math.abs(i) + Math.abs(j)) == 2) // equation of a diamond,
														// refer image
														// logic2_2.jpg
														// |i| + |j| = 2 Here 2
														// is distance from
														// centre of diamond to
														// one corner
					System.out.print("a"); // when above logic is satisfied
											// print a
				else if ((Math.abs(i) + Math.abs(j)) == 1) // equation of a
															// diamond
															// |i| + |j|
															// = 1 .Here 1 is
															// distance from
															// centre of diamond
															// to one corner
					System.out.print("b"); // when above logic is satisfied
											// print b
				else if ((Math.abs(i) + Math.abs(j)) == 0) // equation of a
															// diamond |i| + |j|
															// = 0 .Here 0 is
															// distance from
															// centre of diamond
															// to one corner
					System.out.print("c"); // when above logic is satisfied
											// print b
				else
					System.out.print(" "); // everywhere else print space
			}
			System.out.println(); // switch to next line when you reach end of
									// the j loop
		}

	}

}
