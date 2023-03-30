package Pattern_Printing;

import java.util.Scanner;

public class Diamond_Star_Pattern1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int n1 = (n/2) + 1;
		int n2 = n/2;
		
		
		//Upper Part
		//   *
		//  ***
		// *****
		//*******
		
		int i = 1;
		while(i <= n1) {
			int spaces = 1;
			while(spaces <= n1-i) {
				System.out.print(" ");
				spaces++;
			}
			int j = 1;
			while(j <= i*2-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		//Lower part
		
		// *****
		//  ***
		//   *

		
		int k = n2;
		while(k >= 1) {
			int space = 1;
			while(space <= n2-k+1) {
				System.out.print(" ");
				space++;
			}
			int dec = 1;
			while(dec<= k*2-1) {
				System.out.print("*");
				dec++;
			}
			System.out.println();
			k--;
		}
		
		

	}

}



//  n = 7;
//   *
//  ***
// *****
//*******
// *****
//  ***
//   *
