package Clases_de_Sillas;

import Interface.Isilla;

public class Tipos_de_Sillas implements Isilla {

	@Override
	public void sentarse() {
		System.out.println("Insectaron el tipo de como sentarse en la silla:: sentarse() method.");
	}

	@Override
	public void patas() {
		System.out.println("Insectaron el tipo de clase de patas en silla:: patas () method. ");
	}
	

}
