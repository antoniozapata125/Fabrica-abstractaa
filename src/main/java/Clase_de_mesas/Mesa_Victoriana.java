package Clase_de_mesas;

import Interface.Imesa;

public class Mesa_Victoriana implements Imesa {

	@Override
	public void patas() {
		System.out.println("La mesa victoriana, tiene patas victoriana");
	}

	@Override
	public void Grande() {
		System.out.println("La mesa victoriana es rectangular ");
	}

	@Override
	public void ancha() {
		System.out.println("La mesa victoriana tiene espacio para 9 sillas");
		
	}


}
