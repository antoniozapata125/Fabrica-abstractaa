package Clases_de_Sillas;

import Interface.Isilla;

public class Silla_Art_deco implements Isilla {

	@Override
	public void sentarse() {
		System.out.println("La silla Art Deco es completamente de madera y tiene para apoya brazos ");
		
	}

	@Override
	public void patas() {
		System.out.println("La silla Art Deco tiene 4 patas estilo Cabriolé");
		
	}

}
