package Eindopdracht;
import Eindopdracht.Factuur;
import java.util.ArrayList;
import java.util.List;
import Eindopdracht.Winkel;

	public class Winkelmandje {
		public Winkel winkel = new Winkel();
	    public Factuur factuur = new Factuur();
	    
	    public List<String> mandje = new ArrayList<String>();
	    
	    public void Winkelmand(){
	    	mandje.add(winkel.onbetaald.get(0));
	    	mandje.add(winkel.onbetaald.get(6));
	    	mandje.add(winkel.onbetaald.get(4));
	    	mandje.add(winkel.onbetaald.get(8));
	    }
	    
	    public static List<Double> prijzen = new ArrayList<Double>();
	    
	    public void Prijzen(){
	    	prijzen.add(winkel.prijs.get(0));
	    	prijzen.add(winkel.prijs.get(6));
	    	prijzen.add(winkel.prijs.get(4));
	    	prijzen.add(winkel.prijs.get(8));
	    }
	    
	  //2 dimensionale array voor de Producten (STRING)//
	    Object[][] product = new Object[][] {
	        {mandje.get(0),prijzen.get(0),factuur.getPrijsinclBtw()},
	        {mandje.get(1),prijzen.get(1),factuur.getPrijsinclBtw()},
	        {mandje.get(2),prijzen.get(2),factuur.getPrijsinclBtw()},
	        {mandje.get(3),prijzen.get(3),factuur.getPrijsinclBtw()}};
	   
	    //2 dimensionale array voor de Producten (STRING)//
//	    Object[][] product = new Object[][] {
//	        {winkel.onbetaald.get(0),winkel.prijs.get(0),factuur.getPrijsinclBtw()},
//	        {winkel.onbetaald.get(6),winkel.prijs.get(6),factuur.getPrijsinclBtw()},
//	        {winkel.onbetaald.get(4),winkel.prijs.get(4),factuur.getPrijsinclBtw()},
//	        {winkel.onbetaald.get(8),winkel.prijs.get(8),factuur.getPrijsinclBtw() }};
//	   
	    
	    //Maak een getter voor de 2 dimensionale array Product//
	    public Object[][] getProduct(){
	        return product;
	    }    
}


