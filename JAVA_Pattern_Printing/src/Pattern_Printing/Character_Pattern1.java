package Pattern_Printing;

import java.util.Scanner;

public class Character_Pattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		char c = 'A';
		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= i) {
				System.out.print(c);
				j++;
			}
			System.out.println();
			i++;
			c++;
			
		}
		

	}

}



//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
//GGGGGGG

