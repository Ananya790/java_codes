
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StringGUI implements ActionListener {

    private JFrame frame;	
    private JTextField inputField, outputField;
    private JButton upperCaseButton, lowerCaseButton, reverseButton, trimButton, countWordsButton;

private JButton countVowelsButton, countLettersButton, frequencyButton, beginCapsButton, resetButton;

    public StringGUI() {
        createComponents();
        addComponentsToFrame();
        addListeners();
        frame.setVisible(true);
    }

    private void createComponents() {
        frame = new JFrame("String Operations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        inputField = new JTextField(20);
        outputField = new JTextField(20);
        outputField.setEditable(false);  // Make output field read-only

        upperCaseButton = new JButton("Upper Case");
        lowerCaseButton = new JButton("Lower Case");
        reverseButton = new JButton("Reverse");
        trimButton = new JButton("Trim");
        countWordsButton = new JButton("Count Words");
        countVowelsButton = new JButton("Count Vowels");
        countLettersButton = new JButton("Count Letters");
        frequencyButton = new JButton("Letter Frequency");
        beginCapsButton = new JButton("Begin Caps");
        resetButton = new JButton("Reset");
    }

private void addComponentsToFrame() {

 JPanel mainPanel = new JPanel(new GridLayout(2, 1)); // Main panel for input/output and buttons
    mainPanel.setBackground(new Color(255, 182, 193)); 

    frame.setLayout(new GridLayout(2, 1)); // 2 rows, 1 column
   frame.getContentPane().setBackground(new Color(255, 182, 193));
    JPanel inputOutputPanel = new JPanel(new GridLayout(2, 1)); // Panel for input and output

    JPanel inputPanel = new JPanel(new FlowLayout()); 
inputPanel.setBackground(new Color(255, 182, 193));     
inputPanel.add(new JLabel("Input:"));
    inputPanel.add(inputField);

    JPanel outputPanel = new JPanel(new FlowLayout());     
    outputPanel.setBackground(new Color(255, 182, 193));
    outputPanel.add(new JLabel("Output:"));
    outputPanel.add(outputField);

    inputOutputPanel.add(inputPanel);
    inputOutputPanel.add(outputPanel); 
    frame.add(inputOutputPanel); 

    JPanel buttonPanel = new JPanel(new FlowLayout());    
    buttonPanel.setBackground(new Color(255, 182, 193));
    buttonPanel.add(upperCaseButton);
    buttonPanel.add(lowerCaseButton);
    buttonPanel.add(reverseButton);
    buttonPanel.add(trimButton);
    buttonPanel.add(countWordsButton);
    buttonPanel.add(countVowelsButton);
    buttonPanel.add(countLettersButton);
    buttonPanel.add(frequencyButton);
    buttonPanel.add(beginCapsButton);
    buttonPanel.add(resetButton);

 
     mainPanel.add(buttonPanel);
     resetButton.setBackground(Color.BLUE);


 mainPanel.add(buttonPanel, BorderLayout.NORTH); 

        JPanel resetPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        resetPanel.setBackground(new Color(255, 182, 193)); 
        resetPanel.add(resetButton);

        mainPanel.add(resetPanel, BorderLayout.SOUTH); 



    frame.add(mainPanel); 
}


    private void addListeners() {
        upperCaseButton.addActionListener(this);
        lowerCaseButton.addActionListener(this);
        reverseButton.addActionListener(this);
        trimButton.addActionListener(this);
        countWordsButton.addActionListener(this);
	countVowelsButton.addActionListener(this);
        countLettersButton.addActionListener(this);
        frequencyButton.addActionListener(this);
        beginCapsButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inputString = inputField.getText();
        String result = "";

        if (e.getSource() == upperCaseButton) {
            result = inputString.toUpperCase();
        } else if (e.getSource() == lowerCaseButton) {
            result = inputString.toLowerCase();
        } else if (e.getSource() == reverseButton) {
            StringBuilder sb = new StringBuilder(inputString);
            result = sb.reverse().toString();
        } else if (e.getSource() == trimButton) {
            result = inputString.trim();
        } else if (e.getSource() == countWordsButton) {
            int wordCount = inputString.trim().split("\\s+").length;
            result = String.valueOf(wordCount);
        } else if (e.getSource() == countLettersButton) {
            int letterCount = inputString.replaceAll("\\s+", "").length();
            result = "Letter Count: " + letterCount;
        }        else if (e.getSource() == beginCapsButton) {
            result = convertFirstLetterToUpper(inputString);
        } else if (e.getSource() == resetButton) {
            inputField.setText("");
            outputField.setText("");
            return;
        }

        outputField.setText(result);
    }
 
 private int countVowels(String input) {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count++;
            }
        }
        return count;
    }

  
    private String convertFirstLetterToUpper(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        return result.toString().trim();
    }


    public static void main(String[] args) {
        new StringGUI();
    }
}
