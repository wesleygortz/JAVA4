package Eindopdracht;

public class Product {
	//variables//
	public String productTitle;
	public String Omschrijving;
	public double Prijs;
	public double Btw; 
	public double PrijsIncBtw;
	
	
	//GetProductTitle//
	public String getProductTitle(){
		return productTitle;		
	}
	
	//SetProductTitle//
	public String setProductTitle(String Title) {
		return this.productTitle = Title;
	}
	
	//GetOmschrijving//
	public String getOmschrijving() {
		return Omschrijving;
	}
	
	//setOmschrijving//
	public String setOmschrijving(String omschrijving) {
		return this.Omschrijving = omschrijving;
	}
	
	
	//GetPrijs//
	public double getPrijs() {
		return Prijs;
	}
	
	//setPrijs//
	public double setPrijs(double prijs) {
		return this.Prijs = prijs;
	}
	
	
	//GetBtw//
	public double getBtw() {
		return Btw;
	}
	
	public double setBtw(double btw) {
		return this.Btw = btw;
	}
	
	
	//getPrijsIncBtw//
	public double getPrijsIncBtw() {
		if (Prijs != 0 && Btw != 0) {
			double PrijsinclBtw = Prijs * (Btw/100 +1);
			return PrijsinclBtw;
		} 
		
		else {
			return 0;
		}
	}
}
