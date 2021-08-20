package Clase_de_mesas;

import Interface.Imesa;

public class Mesa_Art_deco implements Imesa {

	@Override
	public void patas() {
		System.out.println("La mesa art deco es de patas delgadas y bajo perfil");
		
	}

	@Override
	public void Grande() {
		System.out.println("La mesa art deco es mas que todo para centro de sala ");
		
	}

	@Override
	public void ancha() {
		System.out.println("La mesa art deco es un poco ancha para poner unas flores o para poner unos platos y una coca cola para cuando hay una conviviencia de un partido");
	}

	
}
