package Clase_de_sofas;

import Interface.Isofa;

public class Sofa_moderno implements Isofa {

	@Override
	public void patas() {
		System.out.println("El sillon moderno tiene su patas estilo metal pero se tiene una forma rectangulo");
	}

	@Override
	public void largo() {
		System.out.println("El sillon moderno se abarca como 10 metros");
	}

	@Override
	public void sentarse() {
		System.out.println("El sillon moderno se basa de algodon o un relleno en todas partes de respaldo donde sentarte y en el apoya brazos");
	}

}
