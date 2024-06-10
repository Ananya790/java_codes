import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Q2 
{
    public Q2() {
        JFrame frame = new JFrame("OOPJ SESSIONAL");
        frame.setSize(500, 500);
        JPanel iPanel, bPanel, oPanel;

        JLabel numb = new JLabel("Enter a number between 10 to 100");
        JTextField num = new JTextField();

        iPanel = new JPanel(new GridLayout(1,2));
        iPanel.add(numb);
        iPanel.add(num);

        JLabel rand = new JLabel("Randomly generated numbers are:-");
        JTextArea randNum = new JTextArea();
        randNum.setEditable(false);
        JLabel outLabel = new JLabel("Output");
        JTextField output = new JTextField();
        output.setEditable(false);

        oPanel = new JPanel(new GridLayout(2,2));
        oPanel.add(rand);
        oPanel.add(randNum);
        oPanel.add(outLabel);
        oPanel.add(output);

        JButton gen = new JButton("Generate");
        JButton sum = new JButton("Sum");
        JButton mult = new JButton("Multiply");
        JButton sort = new JButton("Sort");

        bPanel = new JPanel(new GridLayout(4,1));
        bPanel.add(gen);
        bPanel.add(sum);
        bPanel.add(mult);
        bPanel.add(sort);


        gen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(num.getText());
                int arr[] = new int[n];
                String str = "";
                for(int i=0; i<n; i++) {
                    arr[i] =  1 + (int) (Math.random()*1000);
                    str += Integer.toString(arr[i]) + " ";
                }
                randNum.setText(str);
            }
        });

        sum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(num.getText()), sum=0;

                Scanner sc = new Scanner(randNum.getText());
                for(int i=0; i<n; i++) {
                    sum += sc.nextInt(); 
                }
                output.setText(Integer.toString(sum));
            }
        });

        mult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(num.getText());
                long mult=1;

                Scanner sc = new Scanner(randNum.getText());
                for(int i=0; i<n; i++) {
                    mult *= sc.nextInt(); 
                }
                output.setText(Long.toString(mult));
                
            }
        });

        sort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(num.getText());
                int arr[] = new int[n];

                Scanner sc = new Scanner(randNum.getText());
                for(int i=0; i<n; i++) {
                    arr[i] = sc.nextInt();
                }
                Arrays.sort(arr);
                String str = "";
                for(int i=0; i<n; i++) {
                    str += Integer.toString(arr[i]) + " ";
                }

                output.setText(str);
                
            }
        });

        frame.add(iPanel);
        frame.add(oPanel);
        frame.add(bPanel);

        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Q2 obj=new Q2();
    }
}