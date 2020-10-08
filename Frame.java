package Eindopdracht;
import Eindopdracht.Winkelmandje;
import javax.swing.JFrame;
import javax.swing.*;
public class Frame {
	
    JFrame f;
    
    Frame(){
        f=new JFrame();
//        String data[][]={
//                {"mand[1]","prijs[1]","prijs[1]"},
//                {"mand[2]","prijs[2]","prijs[1] + prijs[2]"},
//                {"mand[3]","prijs[3]","prijs[1] + prijs[2] + prijs[3]"}};
        
        Winkelmandje winkelmandje = new Winkelmandje();
        String column[]={"Product","Prijs","Incl BTW"};
        
        JTable jt=new JTable(winkelmandje.getProduct(),column);
        
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new Frame();
    }
}

