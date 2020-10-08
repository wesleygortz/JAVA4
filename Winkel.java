package Eindopdracht;

import java.util.ArrayList;
import java.util.List;

public class Winkel {
 
    public List<String> onbetaald = new ArrayList<String>();
    public List<Double> prijs = new ArrayList<Double>();
 
    public Winkel() {
        onbetaald.add("Kaas"); //0
        onbetaald.add("Jam");    //1
        onbetaald.add("Hagelslag"); //2
        onbetaald.add("Pindakaas"); //3
        onbetaald.add("Boter"); //4
        onbetaald.add("Azijn"); //5
        onbetaald.add("Yoghurt"); //6
        onbetaald.add("Batterijen"); //7
        onbetaald.add("Banaan"); //8
        onbetaald.add("Aardappel"); //9
 
        prijs.add(0.75);//0
        prijs.add(2.80);
        prijs.add(0.75);
        prijs.add(9.50);
        prijs.add(0.75);
        prijs.add(0.75);
        prijs.add(0.75);
        prijs.add(3.95);
        prijs.add(0.75);
        prijs.add(0.75);
 
 
//        System.out.println(onbetaald);
    }
}
	 
