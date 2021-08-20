package Clases_de_Sillas;

import Interface.Isilla;

public class Silla_victoriana implements Isilla {

	@Override
	public void sentarse() {
		System.out.println("La silla victoriana tiene un cojin");
		
	}

	@Override
	public void patas() {
		System.out.println("La silla victoriana tiene 4 patas gruesas de madera ");
	}

}
