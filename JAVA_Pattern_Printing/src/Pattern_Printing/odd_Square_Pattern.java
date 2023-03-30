package Pattern_Printing;

import java.util.Scanner;

public class odd_Square_Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = 1;
		int i = 1;
		while(i <= n) {
			int j = 1;
			k = i*2-1;
			while(j <= n - i + 1) {
				System.out.print(k);
				k += 2;
				j++;
			}
			int p = 1;
			int y = 1;
			while(p <= i-1) {
				System.out.print(y);
				y +=2;
				p++;
			}
			System.out.println();
			i++;
		}
	}
}


//		 n = 5
//		13579
//		35791
//		57913
//		79135
//		91357

