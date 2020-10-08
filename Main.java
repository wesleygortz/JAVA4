package Eindopdracht;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class Main extends JPanel{
	public static void main(String[] args) {
//		List<Product> mogelijk = new ArrayList<Product>();
		Product Kaas = new Product();
		//Geef je product een naam//
		Kaas.setProductTitle("Geitenkaas");
		
		//Geef je product een prijs//
		Kaas.setPrijs(40.00);
		
		//Geef je product een omschrijving//
		Kaas.setOmschrijving("Deze kaas is een solide substantie van melk");
		
		//Geef de btw aan//
		Kaas.setBtw(9);

//		onbetaald.add(Kaas);
		
		Factuur Factuur1 = new Factuur();
		Factuur1.addProduct(14,onbetaald.get(0));
		
		
		//Geef aan hoeveel producten je verkoopt//
		//Factuur1.setFactuur(69, Kaas);
			
		//Run het programma//
		//System.out.println(Factuur1.getFactuur()); 
	}
}
