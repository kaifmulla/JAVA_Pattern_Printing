package Pattern_Printing;

import java.util.Scanner;

public class Number_Pattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while(j <= i) {
				System.out.print(i+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}



//1 
//2 2 
//3 3 3 
//4 4 4 4 
