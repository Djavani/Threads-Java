package br.com.djavani.runnable;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 300);
		
		/*Posso instanciar aqui ou no constructor da classe MinhaThread..*/		
		//Thread t1 = new Thread(thread1); 
		//t1.start();

		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 600);
		
		
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 900);
		
	}

}
