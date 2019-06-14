
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

//using netbean's approach

public class FifthGUI extends Frame {

    TextField t1,t2;
    Button b1, b2;

    public FifthGUI(){
        initComponents();
    }
            
    
    public void initComponents(){
        setLayout(new FlowLayout());
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("Copy");
        b2=new Button("Clear");
        add(t1); add(t2); add(b1); add(b2);
        
    }
    
    
    
    public static void main(String args[]){
        
        FifthGUI ob=new FifthGUI();
        ob.setSize(400,400);
        ob.setVisible(true);
       
        
        
        
        
        
        
    }
}
/*
    1) inherits your class with Frame
    2) they declare every component inside the class
    3) they will write method initComponents to create GUI
    4) they write a constructor and call initComponents in it.

*/
