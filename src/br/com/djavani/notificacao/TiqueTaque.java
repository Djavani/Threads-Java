package br.com.djavani.notificacao;

public class TiqueTaque {

	boolean tique;
	boolean taque;

	public synchronized void tique(boolean estaExecutando) {
		if (!estaExecutando) {
			tique = true;
			notify();
			return;
		}

		System.out.print("Tique ");

		tique = true;

		notify();

		try {
			while (tique) {				
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void taque(boolean estaExecutando) {
		if (!estaExecutando) {
			tique = false;
			notify();
			return;
		}

		System.out.println("Taque ");

		tique = false;

		notify();

		try {
			while (!tique) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
