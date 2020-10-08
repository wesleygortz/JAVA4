import eindoef.Winkelmandje;
import java.util.*;
import javax.swing.*;
public class TableExample {
    JFrame f;
    TableExample(){
        f=new JFrame();
//        String data[][]={
//                {"mand[1]","prijs[1]","prijs[1]"},
//                {"mand[2]","prijs[2]","prijs[1] + prijs[2]"},
//                {"mand[3]","prijs[3]","prijs[1] + prijs[2] + prijs[3]"}};
        Winkelmandje winkelmandje = new Winkelmandje();
        String column[]={"Product","Prijs","Totaalbedrag"};
        JTable jt=new JTable(winkelmandje.getProduct(),column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new TableExample();
    }
}