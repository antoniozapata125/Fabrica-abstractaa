package Fabricas;

import Clase_de_mesas.Mesa_Victoriana;
import Clase_de_sofas.Sofa_Victoriano;
import Clases_de_Sillas.Silla_victoriana;
import Fabrica.Fabrica_abstracta;
import Interface.Imesa;
import Interface.Isilla;
import Interface.Isofa;

public class Fabrica_de_muebles_victoriano extends Fabrica_abstracta {

	@Override
	public Isilla getIsilla(String tipo_de_sillas) {
		if (tipo_de_sillas.equalsIgnoreCase("Silla")) {
			return new Silla_victoriana();
		}
		return null;
	}

	public Isofa getIsofa(String tipo_de_sofas) {
		if (tipo_de_sofas.equalsIgnoreCase("Sofa")) {
			return new Sofa_Victoriano();
		}
		return null;
	}

	@Override
	public Imesa getImesa(String tipo_de_mesa) {
		if (tipo_de_mesa.equalsIgnoreCase("Mesa")) {
			return new Mesa_Victoriana();
		}
		return null;
	}

}
