package br.com.djavani.join;

public class Teste {

	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 700);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 900);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();
		
		/* Para garantir que a mensagem de programa terminado só rode ao final
		 * de todas as thread posso fazer de dois modos
		 */
		
		//Modo 1 > menos elegante : através de while com sleep
		/*
		while(t1.isAlive() || t2.isAlive() || t3.isAlive()) {
			try {
				//forcando um sleep na thread principal
				Thread.sleep(200);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		*/
		
		//Modo 2 > elegante : uso do Join
		
		// se eu quiser garantir rodar a thread1 primeiro antes das demais uso o join apenas nela
		/*
		try {
			t1.join();
		} catch (InterruptedException e1) {			
			e1.printStackTrace();
		}
		*/
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		// com o codigo acima garanto que este trecho so vai ser rodado ao final de todas a threads
		System.out.println("Programa finalizado");
	}

}
