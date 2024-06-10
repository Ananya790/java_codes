import javax.swing.*;
import java.awt.*;
class first{
public static void main (String[] args){
JFrame f = new JFrame("h");
f.setVisible(true);
f.setSize(500, 500);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel l=new JLabel("hello");

f.setLayout(new BorderLayout());
JButton b1 = new JButton("BUTTON");
f.add(b1, BorderLayout.NORTH);
f.add(l);

}}