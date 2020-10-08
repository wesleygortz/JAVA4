package Eindopdracht;

public class GekochtProduct {	
	int aantal;
	Product product;
	
	GekochtProduct(int aantal, Product product){
		this.aantal = aantal;
		this.product = product;
	}

	public double getPrijs() {
		// TODO Auto-generated method stub
		return aantal*product.Prijs;
	}

	public double getPrijsInclBtw() {
		// TODO Auto-generated method stub
		return aantal*product.getPrijsIncBtw();
	}

}
