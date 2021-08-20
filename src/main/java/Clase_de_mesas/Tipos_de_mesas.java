package Clase_de_mesas;

import Interface.Imesa;

public class Tipos_de_mesas implements Imesa {

	@Override
	public void patas() {
		System.out.println("Insectaron el tipo de patas de la mesa:: patas() method.");
		
	}

	@Override
	public void Grande() {
		System.out.println("Insectaron el tipo de grande es la mesa:: Grande() method.");
		
	}

	@Override
	public void ancha() {
		System.out.println("Insectaron el tipo de ancho de la mesa::ancha() method. ");
		
	}

}
