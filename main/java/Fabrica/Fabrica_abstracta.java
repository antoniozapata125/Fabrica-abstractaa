package Fabrica;

import Interface.Imesa;
import Interface.Isilla;
import Interface.Isofa;


public abstract class Fabrica_abstracta {
     public abstract Isilla getIsilla (String tipo_de_sillas); 
     public abstract Isofa getIsofa (String tipo_de_sofas);
     public abstract Imesa getImesa (String tipo_de_mesa);
}
