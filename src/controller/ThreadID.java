package controller;

//extends Thread
//Par�metro p/construtor
//m�todo run()

public class ThreadID extends Thread{
	
	private int idThread;

	public ThreadID(int idThread) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
		// s� ser� executado tudo o que estiver dentro
		System.out.println(idThread);
	}
	
}
