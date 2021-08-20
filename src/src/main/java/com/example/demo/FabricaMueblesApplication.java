package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import Interface.Imesa;
import Interface.Isilla;
import Interface.Isofa;
import Fabricas.Fabrica_de_muebles_ArtDeco;
import Fabricas.Fabrica_de_muebles_modernos;
import Fabricas.Fabrica_de_muebles_victoriano;

@SpringBootApplication
public class FabricaMueblesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FabricaMueblesApplication.class, args);
		
		Fabrica_de_muebles_ArtDeco Fabrica = new  Fabrica_de_muebles_ArtDeco();
		System.out.println();
		System.out.println(   "       ♛Bienvenido a la Fabrica de Muebles donde le vamos a presentar 3 areas con diferentes muebles ♛  ");
		System.out.println();
		Isilla Silla1 = Fabrica.getIsilla("Silla");
		System.out.println();
		System.out.println(   "    ♛ Te presentamos la Silla Estilo Art Deco ♛    ");
		System.out.println();
		Silla1.patas();
		System.out.println();
		Silla1.sentarse();
		System.out.println();
		Imesa Mesa1= Fabrica.getImesa("Mesa");

		System.out.println(    "   ♛   Te presentamos la Mesa Estilo Art Deco   ♛      ");

		System.out.println();
		Mesa1.ancha();
		System.out.println();
		Mesa1.Grande();
		System.out.println();
		Mesa1.patas();
		System.out.println(); 
		Isofa Sofa1= Fabrica.getIsofa("Sofa");
		
		System.out.println(    " ♛   Te presentamos el Sofa Estilo Art Deco   ♛        ");
		System.out.println();
		
		Sofa1.largo();
		System.out.println();
		Sofa1.patas();
		System.out.println();
		Sofa1.sentarse();
		System.out.println();
		
		Fabrica_de_muebles_modernos Fabrica1 = new Fabrica_de_muebles_modernos();
		Isilla Silla2 = Fabrica1.getIsilla("Silla");
		Silla2.patas();
		Silla2.sentarse();
		Imesa mesa2 = Fabrica1.getImesa("Mesa");
		System.out.println();
		mesa2.ancha();
		mesa2.patas();
		mesa2.ancha();
		Isofa sofa2 = Fabrica1.getIsofa("Sofa");
		sofa2.largo();
		sofa2.patas();
		sofa2.sentarse();
		
		
		Fabrica_de_muebles_victoriano Fabrica2 = new Fabrica_de_muebles_victoriano();
		
		Isilla silla3 = Fabrica2.getIsilla("Silla");
		silla3.sentarse();
		silla3.patas();
	
		Imesa mesa3 =Fabrica2.getImesa("Mesa");
		mesa3.ancha();
		mesa3.Grande();
		mesa3.patas();
		
		Isofa sofa3 = Fabrica2.getIsofa("Sofa");
		sofa3.largo();
		sofa3.patas();
		sofa3.sentarse();
		
		
		
	}

}





















