package Pattern_Printing;

import java.util.Scanner;

public class Number_Pattern3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i <= n) {
			int j = i;
			while(j >= 1) {
				System.out.print(j+" ");
				j--;
			}
			System.out.println();
			i++;
		}

	}

}



//1 
//2 1 
//3 2 1 
//4 3 2 1 
