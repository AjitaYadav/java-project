import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OnlineTenderManagementSystemGUI extends JFrame implements ActionListener {
    
    private JLabel titleLabel, descriptionLabel;
    private JTextField titleField;
    private JTextArea descriptionArea;
    private JButton submitButton;
    
    public OnlineTenderManagementSystemGUI() {
        setTitle("Online Tender Management System");
        setLayout(new GridLayout(3, 2));
        
        titleLabel = new JLabel("Title:");
        titleField = new JTextField();
        descriptionLabel = new JLabel("Description:");
        descriptionArea = new JTextArea();
        submitButton = new JButton("Submit");
        
        add(titleLabel);
        add(titleField);
        add(descriptionLabel);
        add(descriptionArea);
        add(new JLabel());
        add(submitButton);
        
        submitButton.addActionListener(this);
        
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event) {
        
    }
    
    public static void main(String[] args) {
        new OnlineTenderManagementSystemGUI();
    }
}
