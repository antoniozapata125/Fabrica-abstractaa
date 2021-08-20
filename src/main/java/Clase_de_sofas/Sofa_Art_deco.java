package Clase_de_sofas;

import Interface.Isofa;

public class Sofa_Art_deco implements Isofa {

	@Override
	public void patas() {
		System.out.println("El sofa Art deco tiene 4 patas de madera");
		
	}

	@Override
	public void largo() {
		System.out.println("El sofa Art deco tiene como 5 metros de largo");
	}

	@Override
	public void sentarse() {
		System.out.println("El sofa Art deco tiene por todos lados plumas de ganso");
	}

}
