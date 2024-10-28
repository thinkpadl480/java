import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookInfoForm extends JFrame {
    private JTextField titleField;
    private JTextField authorField;

    public BookInfoForm() {
        // Set up the frame
        setTitle("Book Information");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add padding

        // Create labels and text fields
        JLabel titleLabel = new JLabel("Book Title:");
        titleField = new JTextField(15); // Set column width

        JLabel authorLabel = new JLabel("Author Name:");
        authorField = new JTextField(15); // Set column width

        JButton submitButton = new JButton("Submit");

        // Add components to the frame
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(titleLabel, gbc);

        gbc.gridx = 1;
        add(titleField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(authorLabel, gbc);

        gbc.gridx = 1;
        add(authorField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // Span the button across two columns
        gbc.anchor = GridBagConstraints.CENTER;
        add(submitButton, gbc);

        // Add action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String author = authorField.getText();
                JOptionPane.showMessageDialog(null, "Book Title: " + title + "\nAuthor: " + author);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BookInfoForm form = new BookInfoForm();
            form.setVisible(true);
        });
    }
}
