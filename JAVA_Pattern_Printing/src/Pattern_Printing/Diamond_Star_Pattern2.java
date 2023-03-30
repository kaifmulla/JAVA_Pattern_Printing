package Pattern_Printing;

import java.util.Scanner;

public class Diamond_Star_Pattern2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("*");
		int i = 1;
		while(i <= n) {
			System.out.print("*");
			int j = 1;
			while(j <= i) {
				System.out.print(j);
				j++;
			}
			int k = j-2;
			while(k >= 1) {
				System.out.print(k);
				k--;
			}
			System.out.println("*");
			i++;
		}
		int k = 1;
		int n2 = n-1;
		while(k <= n2) {
			System.out.print("*");
			int p = 1;
			while(p <= n2 - k + 1) {
				System.out.print(p);
				p++;
			}
			int x = p-2;
			while(x >= 1) {
				System.out.print(x);
				x--;
			}
			System.out.println("*");
			k++;
		}
		
		System.out.println("*");
		
		
		

	}
	
}

