package controller;

//extends Thread
//Parâmetro p/construtor
//método run()

public class ThreadID extends Thread{
	
	private int idThread;

	public ThreadID(int idThread) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
		// só será executado tudo o que estiver dentro
		System.out.println(idThread);
	}
	
}
