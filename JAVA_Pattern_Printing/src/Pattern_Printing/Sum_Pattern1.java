package Pattern_Printing;

import java.util.Scanner;

public class Sum_Pattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while(i <= n) {
			int j = 1;
			int sum = 0;
			while(j <= i) {
				sum = sum + j;
				System.out.print(j);
				if(j < i) {
					System.out.print("+");
				}
				j++;
			}
			System.out.println("="+sum);
			i++;
		}
	}
}


//		n = 6
//		1=1
//		1+2=3
//		1+2+3=6
//		1+2+3+4=10
//		1+2+3+4+5=15
//		1+2+3+4+5+6=21
