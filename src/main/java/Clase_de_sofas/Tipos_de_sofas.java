package Clase_de_sofas;

import Interface.Isofa;

public class Tipos_de_sofas implements Isofa {

	@Override
	public void patas() {
		System.out.println("Insectaron el tipo de patas de sofa:: patas() method.");
		
	}

	@Override
	public void largo() {
		System.out.println("Insectaron el tipo de largo de sofa:: largo() method.");
	}

	@Override
	public void sentarse() {
		System.out.println("Insectaron el tipo de sentarse en el sofa:: sentarse() method.");
	}

	
}
