package Pattern_Printing;

import java.util.Scanner;

public class Character_Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		char c = 'A';
		
		int i = 1;
		while(i <= n) {
			int j = 1;
			char k = (char)(c + i -1);
//			System.out.println(k);
			while(j <= i) {
				System.out.print(k+" ");
				k++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}


//A 
//B C 
//C D E 
//D E F G 
