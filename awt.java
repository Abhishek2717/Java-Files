import java.awt.*;
import java.applet.*;
public class awt 
{
    public static void main(String args[])
    {
        Frame f=new Frame("Itz Abhii's Registaration Form:");
        Label l=new Label("Name:");
        Label l1=new Label(" ");
        TextField tf=new TextField(12);
        TextField af=new TextField(12);
        Label k=new Label("Sec:");
        Label l2=new Label(" ");
        Button c=new Button("SUBMIT");
        Label l3=new Label(" ");
        Button d=new Button("RE-ENTER");
        

        f.add(l);
        f.add(tf);
        l.setBounds(20,45,70,20);
        k.setBounds(20,45,70,20);
        f.setBackground(Color.red);
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.setVisible(true);
        f.add(k);
        f.add(af);
        f.add(tf);
        f.add(tf);
        f.add(c);
        f.add(d);
        

    }
    
}
