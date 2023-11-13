package org.lessons.java.shop;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		String[] prodottiDaCucina = {
	            "Coltello da chef",
	            "Padella antiaderente",
	            "Frullatore",
	            "Tagliere in legno",
	            "Teglia da forno",
	            "Mestolo",
	            "Set di pentole e padelle",
	            "Caffettiera",
	            "Spremiagrumi",
	            "Set di colini"
	        };
		
		String[] descrizioniProdotti = {
	            "Un coltello versatile per tagliare, affettare e tritare ingredienti.",
	            "Una padella con rivestimento antiaderente per cucinare senza attaccare gli alimenti.",
	            "Un apparecchio per frullare ingredienti e preparare smoothie.",
	            "Un tagliere robusto in legno per preparare gli ingredienti.",
	            "Una teglia per il forno per cuocere arrosti, torte e altro.",
	            "Uno strumento essenziale in cucina per mescolare e servire zuppe e salse.",
	            "Un set di pentole e padelle di diverse dimensioni per cucinare vari piatti.",
	            "Una caffettiera per preparare il tuo caffè preferito.",
	            "Uno strumento per estrarre il succo dagli agrumi.",
	            "Un set di colini di varie dimensioni per scolare e lavare gli ingredienti."
	        };
		
		Random rnd = new Random();
		
		for (int x=0; x<prodottiDaCucina.length; x++) {
			
			Prodotto p = new Prodotto(rnd.nextInt(10000000), prodottiDaCucina[x], descrizioniProdotti[x], rnd.nextFloat(0, 100), 21);
			System.out.println(p);
		}

	}

}
