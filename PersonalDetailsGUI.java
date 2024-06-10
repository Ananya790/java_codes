import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;


public class PersonalDetailsGUI extends JFrame {
    // Components
    private JTextField hometownField, passionField, hobbiesField, fieldOfInterestField,
            fatherNameField, fatherOccupationField, fatherIncomeField,
            motherNameField, motherOccupationField, motherIncomeField;
    private JButton submitButton;

    public PersonalDetailsGUI() {
        // Setting up the JFrame
        setTitle("PERSONAL DETAILS");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    	

	ImageIcon image = new ImageIcon("C:\\Users\\KIIT\\Downloads\\userimage.jpeg");
        setIconImage(image.getImage());
       
        // Creating components
        JLabel hometownLabel = new JLabel("Hometown:");
        JLabel passionLabel = new JLabel("Passion:");
        JLabel hobbiesLabel = new JLabel("Hobbies:");
        JLabel fieldOfInterestLabel = new JLabel("Field of Interest:");
        JLabel fatherNameLabel = new JLabel("Father's Name:");
        JLabel fatherOccupationLabel = new JLabel("Father's Occupation:");
        JLabel fatherIncomeLabel = new JLabel("Father's Annual Income:");
        JLabel motherNameLabel = new JLabel("Mother's Name:");
        JLabel motherOccupationLabel = new JLabel("Mother's Occupation:");
        JLabel motherIncomeLabel = new JLabel("Mother's Annual Income:");

        hometownField = new JTextField(20);
        passionField = new JTextField(20);
        hobbiesField = new JTextField(20);
        fieldOfInterestField = new JTextField(20);
        fatherNameField = new JTextField(20);
        fatherOccupationField = new JTextField(20);
        fatherIncomeField = new JTextField(20);
        motherNameField = new JTextField(20);
        motherOccupationField = new JTextField(20);
        motherIncomeField = new JTextField(20);

        submitButton = new JButton("SUBMIT");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // You can handle the submit action here, for simplicity, just printing the details
                System.out.println("Hometown: " + hometownField.getText());
                System.out.println("Passion: " + passionField.getText());
                System.out.println("Hobbies: " + hobbiesField.getText());
                System.out.println("Field of Interest: " + fieldOfInterestField.getText());
                System.out.println("Father's Name: " + fatherNameField.getText());
                System.out.println("Father's Occupation: " + fatherOccupationField.getText());
                System.out.println("Father's Annual Income: " + fatherIncomeField.getText());
                System.out.println("Mother's Name: " + motherNameField.getText());
                System.out.println("Mother's Occupation: " + motherOccupationField.getText());
                System.out.println("Mother's Annual Income: " + motherIncomeField.getText());
            }
        });

        // Panel for organizing components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(11, 2));
        panel.add(hometownLabel);
        panel.add(hometownField);
        panel.add(passionLabel);
        panel.add(passionField);
        panel.add(hobbiesLabel);
        panel.add(hobbiesField);
        panel.add(fieldOfInterestLabel);
        panel.add(fieldOfInterestField);
        panel.add(fatherNameLabel);
        panel.add(fatherNameField);
        panel.add(fatherOccupationLabel);
        panel.add(fatherOccupationField);
        panel.add(fatherIncomeLabel);
        panel.add(fatherIncomeField);
        panel.add(motherNameLabel);
        panel.add(motherNameField);
        panel.add(motherOccupationLabel);
        panel.add(motherOccupationField);
        panel.add(motherIncomeLabel);
        panel.add(motherIncomeField);
        panel.add(submitButton);
        panel.setBackground(new Color(201, 246, 246));

        // Adding panel to the frame
        add(panel);

        // Display the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create and display the GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PersonalDetailsGUI();
            }
        });
    }
}
