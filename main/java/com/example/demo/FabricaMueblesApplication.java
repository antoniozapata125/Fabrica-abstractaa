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
		System.out.println(   "       ♛Bienvenido a la Fabrica de Muebles donde le vamos a presentar El Area Art Deco ♛  ");
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
		
		System.out.println(   "       (❍ᴥ❍ʋ) Bienvenido a la Fabrica de Muebles donde le vamos a presentar El Area Moderna (❍ᴥ❍ʋ)  ");
		System.out.println();
		
		System.out.println(    " (❍ᴥ❍ʋ)  Te presentamos La Silla Estilo Moderna   (❍ᴥ❍ʋ)       ");
		
		Isilla Silla2 = Fabrica1.getIsilla("Silla");
		System.out.println();
		Silla2.patas();
		System.out.println();
		Silla2.sentarse();
		System.out.println();
		
		Imesa Mesa2 = Fabrica1.getImesa("Mesa");
		
		System.out.println( "  (❍ᴥ❍ʋ) Te presentamos La Mesa Estilo Moderna (❍ᴥ❍ʋ) ");
		System.out.println();
		Mesa2.ancha();
		System.out.println();
		Mesa2.patas();
		System.out.println();
		Mesa2.Grande();
		System.out.println();
		
		Isofa sofa2 = Fabrica1.getIsofa("Sofa");
		
		System.out.println( "  (❍ᴥ❍ʋ) Te presentamos El sofa Estilo Moderno (❍ᴥ❍ʋ) ");
		System.out.println();
		sofa2.largo();
		System.out.println();
		sofa2.patas();
		System.out.println();
		sofa2.sentarse();
		System.out.println();
		
		Fabrica_de_muebles_victoriano Fabrica2 = new Fabrica_de_muebles_victoriano();
		System.out.println(             "   (▀̿Ĺ̯▀̿ ̿) Bienvenido Te presentamos  a la Fabrica de Muebles donde le vamos a presentar El Area Victoriana  (▀̿Ĺ̯▀̿ ̿) ");
		Isilla silla3 = Fabrica2.getIsilla("Silla");
		System.out.println();
		System.out.println("   (▀̿Ĺ̯▀̿ ̿)  Te presentamos la Silla Victoriana  (▀̿Ĺ̯▀̿ ̿) ");
		System.out.println();
		silla3.sentarse();
		System.out.println();
		silla3.patas();
		System.out.println();
	
		Imesa mesa3 =Fabrica2.getImesa("Mesa");
		System.out.println("   (▀̿Ĺ̯▀̿ ̿) Te presentamos La Mesa Victoriana   (▀̿Ĺ̯▀̿ ̿)  ");
		System.out.println();
		mesa3.ancha();
		System.out.println();
		mesa3.Grande();
		System.out.println();
		mesa3.patas();
		System.out.println();
		
		Isofa Sofa3 = Fabrica2.getIsofa("Sofa");
		System.out.println(" Gracias por la visita de Fabrica de Muebles (▀̿Ĺ̯▀̿ ̿)   ");
		Sofa3.largo();
		Sofa3.patas();
		Sofa3.sentarse();
		
		
		
		
		
	}
}






















