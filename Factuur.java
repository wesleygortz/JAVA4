package Eindopdracht;
import Eindopdracht.Winkelmandje;

public class Factuur{
	public double Btw = 9; 
	
//    public Winkelmandje mand = new Winkelmandje();
    
	public double getPrijs() {
		return 0;
	}
					
//	 public double getPrijsinclBtw() {		
//			double PrijsinclBtw = mand.prijzen+ (Btw/100 +1);
//			return PrijsinclBtw;	
//	 }
	 
	 public double getPrijsinclBtw() {
		 double PrijsinclBtw = Winkelmandje.prijzen.get(0) + (Btw/100 +1);
		 return PrijsinclBtw;	
		
	 }
}
