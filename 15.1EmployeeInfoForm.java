import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeInfoForm extends JFrame {
    private JTextField nameField;
    private JTextField departmentField;
    private JLabel resultLabel;

    public EmployeeInfoForm() {
        // Set up the frame
        setTitle("Employee Information");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add padding

        // Create labels and text fields
        JLabel nameLabel = new JLabel("Employee Name:");
        nameField = new JTextField(15); // Set column width

        JLabel departmentLabel = new JLabel("Department:");
        departmentField = new JTextField(15); // Set column width

        JButton submitButton = new JButton("Submit");
        resultLabel = new JLabel(""); // For displaying results

        // Add components to the frame
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(nameLabel, gbc);

        gbc.gridx = 1;
        add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(departmentLabel, gbc);

        gbc.gridx = 1;
        add(departmentField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // Span the button across two columns
        gbc.anchor = GridBagConstraints.CENTER;
        add(submitButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2; // Span the label across two columns
        add(resultLabel, gbc);

        // Add action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String department = departmentField.getText();
                resultLabel.setText("Name: " + name + ", Department: " + department);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EmployeeInfoForm form = new EmployeeInfoForm();
            form.setVisible(true);
        });
    }
}
