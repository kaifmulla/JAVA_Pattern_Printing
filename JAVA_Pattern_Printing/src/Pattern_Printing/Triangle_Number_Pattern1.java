package Pattern_Printing;

import java.util.Scanner;

public class Triangle_Number_Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i <= n) {
			int spaces = 1;
			while(spaces <= n-i) {
				System.out.print(" ");
				spaces++;
			}
			int j = 1;
			int k = i;
			while(j <= i) {
				System.out.print(k);
				k++;
				j++;
			}
			
			int dec = i-1;
			while(dec >= 1 )
			{
				System.out.print(k-2);
				k--;
				dec--;
			}
			
			System.out.println();
			i++;
		}

	}

}
