package br.com.djavani.thread1;

public class MinhaThread extends Thread {

	private String nome;
	private int tempo;

	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}

	public void run() {
		System.out.println("Executando a Thread");
		System.out.println("--------------------");

		try {
			for (int i=0; i<=10; i++) {
				System.out.println(nome + " contador " + i);
				//intervalo de execução dentor da thread
				Thread.sleep(tempo);
			} 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("--------------------");
		System.out.println(nome + " Terminou a execução.");
	}
}