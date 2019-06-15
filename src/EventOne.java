import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class EventOne extends Frame implements ActionListener, TextListener, FocusListener, ItemListener{

    TextField t1,t2;
    Button b1, b2, b3;
    Choice ch;

    public EventOne(){
        initComponents();
    }
            
    
    public void initComponents(){
        setLayout(new FlowLayout());
        ch=new Choice();
        ch.add("MP");
        ch.add("MH");
        ch.add("RJ");
        add(ch);
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("Copy");
        b2=new Button("Clear");
        b3=new Button("Close"); b3.setEnabled(false);
        add(t1); add(t2); add(b1); add(b2); add(b3);
        //registering the component b1 with ActionListener
        b1.addActionListener(this);
        //registering the component b2 also with ActionListener
        b2.addActionListener(this);
        b3.addActionListener(this);
        t1.addTextListener(this);
        t2.addFocusListener(this);
        ch.addItemListener(this);
    }
    
    
    
    public static void main(String args[]){
        
        EventOne ob=new EventOne();
        ob.setSize(500,400);
        ob.setVisible(true);
    }

    //will be called when actionevent occurs
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b1){
           String s=t1.getText();
           t2.setText(s);
       }else if(e.getSource()==b2){
           t1.setText("");
           t2.setText("");
       }else if(e.getSource()==b3){
           System.exit(0);
       }
       
    }

    @Override
    public void textValueChanged(TextEvent e) {

        String s1=t1.getText();
        t2.setText(s1);
        
    }

    @Override
    public void focusGained(FocusEvent e) {
        b3.setEnabled(true);
    }

    @Override
    public void focusLost(FocusEvent e) {
        b3.setEnabled(false);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        String s=ch.getSelectedItem();
        String capital="";
        switch(s){
                case "MP":
                    capital="BHOPAL";
                break;
                case "MH":
                    capital="MUMBAI";
                break;
                case "RJ":
                    capital="JAIPUR";
                break;
        }
        setTitle(capital);
    }
}
