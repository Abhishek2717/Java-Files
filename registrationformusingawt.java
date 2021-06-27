import java.awt.*;
import java.io.*;
public class registrationformusingawt 
{
    public static void main(String args[])
    {
        
        Frame f=new Frame("Itz Abhii's Registaration Form:");
        Label l1=new Label("\tName:\t");
        Label l2=new Label("\tSec:\t");
        Label l3=new Label("\tSection:");
        Label l4=new Label("\tSemester:\t\t");
        Label l5=new Label("                \t              ");
        Label l6=new Label("                 \t             ");
        Label l7=new Label("                 \t              ");
        Label l8=new Label("                 \t       ");
        Label l9=new Label("                 \t       ");
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        TextField t3=new TextField(10);
        TextField t4=new TextField(10);
        Button b1=new Button("SUBMIT");
        Button b2=new Button("RE-Enter");
        f.add(l1);
        f.add(t1);
        f.add(l5);
        f.add(l2);
        f.add(t2);
        f.add(l6);
        f.add(l3);
        f.add(t3);
        
        f.add(l7);
        f.add(l4);
        
        f.add(t4);
        f.add(l8);
        f.add(b1);
        f.add(l9);
        f.add(b2);
        
       
        f.setBackground(Color.red);
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.setVisible(true);

    }
    
}
