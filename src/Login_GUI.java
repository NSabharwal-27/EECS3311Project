import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login_GUI implements ActionListener{
	
	private static JLabel usernameLabel;
	private static JTextField usernameText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton submitButton;
	private static JLabel success;
	

	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		
		frame.setSize(350, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		usernameLabel = new JLabel("Username:");
		usernameLabel.setBounds(10, 20, 80, 25);
		panel.add(usernameLabel);
		
		usernameText = new JTextField(20);
		usernameText.setBounds(100, 20, 200, 25);
		panel.add(usernameText);
		
		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 200, 25);
		panel.add(passwordText);
		
		submitButton = new JButton("Submit!");
		submitButton.setBounds(150, 80, 100, 25);
		submitButton.addActionListener(new Login_GUI());
		panel.add(submitButton);
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String username = usernameText.getText();
//		String password = passwordText.getText()
		String password = String.valueOf(passwordText.getPassword());
		
		System.out.println(username + ", " + password);
		
		// TODO: event listener logic
		
	}

}
