import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class question1 extends JFrame implements ActionListener {
    private JTextField inputField, outputField;
    private JButton resultButton;

    public question1() {
        setTitle("Factorial Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        inputField = new JTextField(10);
        outputField = new JTextField(10);
        outputField.setEditable(false);
        resultButton = new JButton("Result");
       resultButton.addActionListener(this);

        panel.add(new JLabel("Enter a number:"));
        panel.add(inputField);
        panel.add(resultButton);
        panel.add(new JLabel("Factorial Result:"));
        panel.add(outputField);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resultButton) {
            try {
                int number = Integer.parseInt(inputField.getText());
                long factorial = calculateFactorial(number);
                outputField.setText(Long.toString(factorial));
            } catch (NumberFormatException ex) {
                            }
        }
    }

    private long calculateFactorial(int n) {
        if (n < 0)
            return -1; // Factorial of negative numbers is undefined
        else if (n == 0 || n == 1)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
       /* SwingUtilities.invokeLater(() -> {*/
            question1 value = new question1();
            value.setVisible(true);
       
}
    }

