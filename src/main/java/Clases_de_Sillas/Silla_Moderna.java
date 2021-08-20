package Clases_de_Sillas;

import Interface.Isilla;

public class Silla_Moderna implements Isilla {

	@Override
	public void sentarse() {
		System.out.println("La silla moderna ya viene completa de algodon de respaldo y de donde sentarse");
	}

	@Override
	public void patas() {
		System.out.println("La silla moderna solo tiene una base de pata y es giratoria");
		
	}

}
