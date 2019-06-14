//working with Multiple LayoutManagers
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class ThirdGUI {
public static void main(String[] args) {
        //Create a container
        //By Default Frame is having BorderLayout
        Frame f=new Frame();
        f.setVisible(true);
        f.setSize(300, 300);  
        
        //Create the components
        Label l1=new Label("Name");
        Label l2=new Label("Age");
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        Button b1=new Button("Save");
        Button b2=new Button("Cancel");
        Button b3=new Button("Exit");
        
        //setting default layout manager off.
        
        Panel p1=new Panel();
        GridLayout gL=new GridLayout(2,2);
        p1.setLayout(gL);
        p1.add(l1); p1.add(t1); p1.add(l2); p1.add(t2);
        
        
        Panel p2=new Panel();
        FlowLayout fL=new FlowLayout();
        p2.setLayout(fL);
        p2.add(b1); p2.add(b2); p2.add(b3);
        
        f.add("North",p1);
        f.add("South",p2);
        
        
        
        
        
        
        
        
        
        
        
        
    }        
}
