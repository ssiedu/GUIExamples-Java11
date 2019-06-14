
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;


public class FirstGUI {
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
        //Adding the components on container
        //changing the Layout Manager to Flow
        //FlowLayout fL=new FlowLayout();
        //f.setLayout(fL);
        
        GridLayout gL=new GridLayout(3,2);
        f.setLayout(gL);
        
        f.add(l1);      f.add(t1);
        f.add(l2);      f.add(t2);
        f.add(b1);
                
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
/*
    Three Basic Steps for Designing GUI

    1) Create a container (Frame,Panel,Dialog, Applet)
    2) Create the components (Button,Checkbox,Choice...)
    3) Add your components on container


*/
