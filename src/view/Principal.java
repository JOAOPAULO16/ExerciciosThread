package view;

import controller.ThreadCalc;

public class Principal {

	public static void main (String[] args) {
		
		for (int a = 0 ; a < 4 ; a++) {
			Thread tCalc = new ThreadCalc(a);
			tCalc.start();
		
		}
		
	}
	
}
