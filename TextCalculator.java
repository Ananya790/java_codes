import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TextCalculator implements ActionListener {
private JFrame frame;
private JTextField textField;
private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8,
button9, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEqual, buttonClear;
public TextCalculator() {
prepareGUI();
createButtons();
addComponents();
addActionListeners();
}
private void prepareGUI() {
frame = new JFrame("Text Calculator");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300, 400);
frame.setLayout(new GridLayout(6, 4));
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
buttonEqual = new JButton("=");
buttonClear = new JButton("C");
}
private void addComponents() {
frame.add(textField);
frame.add(buttonClear);
frame.add(buttonDiv);
frame.add(buttonMul);
frame.add(button7);
frame.add(button8);
frame.add(button9);
frame.add(buttonSub);
frame.add(button4);
frame.add(button5);
frame.add(button6);
frame.add(buttonAdd);
frame.add(button1);
frame.add(button2);
frame.add(button3);
frame.add(buttonEqual);
frame.add(new JLabel(" "));
frame.add(button0);
frame.add(new JLabel(" "));
frame.add(new JLabel(" "));
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
buttonEqual.addActionListener(this);
buttonClear.addActionListener(this);
}

public void actionPerformed(ActionEvent e) {
String command = e.getActionCommand();
if (Character.isDigit(command.charAt(0))) {
textField.setText(textField.getText() + command);
} else if (command.equals("+") || command.equals("-") || command.equals("*") ||
command.equals("/")) {
// Store first number and operator
} else if (command.equals("=")) {
// Perform calculation and display result
} else if (command.equals("C")) {
textField.setText("");
}
}

public static void main(String[] args) {
TextCalculator calculator = new TextCalculator();
calculator.frame.setVisible(true);
}
}