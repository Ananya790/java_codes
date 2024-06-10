import javax.swing.*;
import java.awt.event.*;

class JavaMCQTest extends JFrame implements ActionListener {

    private JLabel questionLabel;
    private JRadioButton[] options;
    private JButton submitButton;
    private final String[] questions;
    private final String[][] choices;
    private final int[] correctAnswers;
    private int currentQuestion;
    private ButtonGroup group; // Declare ButtonGroup here

    JavaMCQTest() {
        super("Java MCQ Test");

        // Sample questions, choices, and correct answers (modify as needed)
        questions = new String[]{
                "Which keyword is used to declare a class in Java?",
                "What is the output of the following code: System.out.println(\"Hello, World!\");"
        };
        choices = new String[][]{
                {"class", "interface", "abstract", "void"},
                {"Hello, World!", "An empty line", "Compilation Error", "None of the above"}
        };
        correctAnswers = new int[]{0, 0}; // Index of the correct answer for each question

        currentQuestion = 0;

        questionLabel = new JLabel(questions[currentQuestion]);
        options = new JRadioButton[choices[currentQuestion].length];
        group = new ButtonGroup(); // Initialize ButtonGroup
        for (int i = 0; i < options.length; i++) {
            options[i] = new JRadioButton(choices[currentQuestion][i]);
            options[i].addActionListener(this);
            add(options[i]);
            group.add(options[i]);
            
        }

        submitButton = new JButton("Submit Answer");
        submitButton.addActionListener(this);
        add(submitButton);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(questionLabel);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Check selected option
            int selectedOption = -1;
            for (int i = 0; i < options.length; i++) {
                if (options[i].isSelected()) {
                    selectedOption = i;
                    break;
                }
            }

            if (selectedOption != -1) {
                String message;
                if (selectedOption == correctAnswers[currentQuestion]) {
                    message = "Correct!";
                } else {
                    message = "Incorrect. The correct answer is " + choices[currentQuestion][correctAnswers[currentQuestion]];
                }

                JOptionPane.showMessageDialog(this, message);

                // Move to next question (if any)
                currentQuestion++;
                if (currentQuestion < questions.length) {
                    questionLabel.setText(questions[currentQuestion]);
                    group.clearSelection();  // Now group is accessible
                    for (int i = 0; i < options.length; i++) {
                        options[i].setText(choices[currentQuestion][i]);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Test Completed!");
                    dispose(); // Close the window
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select an answer!");
            }
        }
    }

    public static void main(String args[]) {
        // Create an instance of JavaMCQTest and make it visible
        new JavaMCQTest();
    }
}