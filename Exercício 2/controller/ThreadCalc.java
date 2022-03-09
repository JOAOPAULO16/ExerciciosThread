package controller;

import java.util.Random;

public class ThreadCalc extends Thread {

	private int a, b, res;
	private Random r = new Random();
	
	public ThreadCalc(int a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		calc();
	}

	private void calc() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(a*1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int j = 0; j < 5; j++) {
			b = r.nextInt(10);
			res += b;
			if (j==4) {
				System.out.println(" " + b);
			}else {
				System.out.println(" " + b + " + " );
			}
		}
	System.out.println("TID #" +getId() + " -> "+ a + " = " +res);
	}
}
