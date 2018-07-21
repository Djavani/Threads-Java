package br.com.djavani.priority;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		/* Para definir a prioridade da execucao da thread - 
		 * mas nao é regra, depende de varios fatores do processamento	 
  			MIN_PRIORITY = 1;		 
		  	NORM_PRIORITY = 5;		  
		 	MAX_PRIORITY = 10;
		*/
			
		//pode ser usado de dois modos
		//t1.setPriority(10);
		//t1.setPriority(Thread.MAX_PRIORITY);
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
