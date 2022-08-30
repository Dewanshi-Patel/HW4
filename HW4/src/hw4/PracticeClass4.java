package hw4;

import java.util.Scanner;

public class PracticeClass4 {

	public static void main(String[] args) {
		Scanner ui = new Scanner (System.in);
		int n = ui.nextInt();
				
		if (n<=0) {
			
		}
		
		else if (n>0 && n<4) {
			System.out.println(1);
		}
		else {
			System.out.println(1);
			for(int i=4; 1<=n; i=i+4) {
				System.out.println(","+i);
		}
	}
	
	}
}
