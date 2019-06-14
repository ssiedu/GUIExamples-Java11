//Working without LayoutManager
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class SecondGUI {
public static void main(String[] args) {
        //Create a container
        //By Default Frame is having BorderLayout
        Frame f=new Frame();
        f.setVisible(true);
        f.setSize(400, 400);  
        
        //Create the components
        Label l1=new Label("Name");
        Label l2=new Label("Age");
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        Button b1=new Button("Save");
        
        //setting default layout manager off.
        f.setLayout(null);
        
        l1.setSize(60, 30);
        l1.setLocation(50,50);
        
        t1.setSize(100,30);
        t1.setLocation(130,50);
        
        //l2.setSize(60,30);
        //l2.setLocation(50, 100);
        l2.setBounds(50,100, 60, 30);//x,y,w,h
        t2.setBounds(130,100,100,30);
        
        
        
        f.add(l1);      f.add(t1);
        f.add(l2);      f.add(t2);
        f.add(b1);
                
        
        
        
        
        
        
        
        
        
        
        
        
        
    }    
}
