import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculatorgui implements ActionListener {
private JFrame frame;
private JPanel panel;
private JLabel jLabel;
private JTextField textField;
private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8,
button9;
private JButton buttonAdd, buttonSub, buttonMul, buttonDiv, buttonMod, buttonEqual, buttonClear;
private double firstOperand;
private char operator;


public Calculatorgui() {
  prepareGUI();	
  createButtons();
  addComponents();
  addActionListeners();
}
private void prepareGUI() {
  frame = new JFrame(" Calculator");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(400, 600);
  frame.setLayout(new GridLayout(6, 4));
  frame.getContentPane().setBackground(Color.CYAN); 

}
private void createButtons() {
  textField = new JTextField(20);
  textField.setEditable(false);
  button0 = new JButton("0");
  button1 = new JButton("1");
  button2 = new JButton("2");
  button3 = new JButton("3");
  button4 = new JButton("4");
  button5 = new JButton("5");
  button6 = new JButton("6");
  button7 = new JButton("7");
  button8 = new JButton("8");
  button9 = new JButton("9");
  buttonAdd = new JButton("+");
  buttonSub = new JButton("-");
  buttonMul = new JButton("*");
  buttonDiv = new JButton("/");
  buttonMod = new JButton("%");
  buttonEqual = new JButton("=");
  buttonClear = new JButton("off");
}
private void addComponents() {
jLabel = new JLabel("CALCULATOR ");
jLabel.setForeground(Color.BLUE);
jLabel.setOpaque(true);
jLabel.setBackground(Color.CYAN);
frame.add(jLabel);

jLabel = new JLabel("  ");
jLabel.setOpaque(true);
jLabel.setBackground(Color.CYAN);
frame.add(jLabel);

frame.add(textField);
frame.add(new JLabel(" "));
frame.add(button1);
frame.add(button2);
frame.add(button3);
frame.add(buttonAdd);
frame.add(button4);
frame.add(button5);
frame.add(button6);
frame.add(buttonSub);
frame.add(button7);
frame.add(button8);
frame.add(button9);
frame.add(buttonMul);
frame.add(buttonDiv);
frame.add(button0);
frame.add(buttonMod);
frame.add(buttonEqual);
frame.add(new JLabel(" "));
frame.add(buttonClear  );




}


private void addActionListeners() {
button0.addActionListener(this);
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
button5.addActionListener(this);
button6.addActionListener(this);
button7.addActionListener(this);
button8.addActionListener(this);
button9.addActionListener(this);
buttonAdd.addActionListener(this);
buttonSub.addActionListener(this);
buttonMul.addActionListener(this);
buttonDiv.addActionListener(this);
buttonMod.addActionListener(this);
buttonEqual.addActionListener(this);
buttonClear.addActionListener(this);
}
 public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (Character.isDigit(command.charAt(0))) {
            textField.setText(textField.getText() + command);
        } else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/") || command.equals("%")) {
            

            firstOperand = Double.parseDouble(textField.getText());
            operator = command.charAt(0);
            textField.setText(""); // Clear the text field for entering the second operand
        } else if (command.equals("=")) {
            

            double secondOperand = Double.parseDouble(textField.getText());
            double result = calculate(firstOperand, operator, secondOperand);
            textField.setText(String.valueOf(result));
        } else if (command.equals("C")) {
            

            textField.setText("");
        }
    }

    private double calculate(double firstOperand, char operator, double secondOperand) {
        double result = 0;
        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                } else {
                    JOptionPane.showMessageDialog(frame, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case '%':
                result = firstOperand % secondOperand;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Calculatorgui calculator = new Calculatorgui();
        calculator.frame.setVisible(true);
    }
}