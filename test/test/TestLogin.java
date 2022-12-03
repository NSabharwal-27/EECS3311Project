package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Component;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.junit.jupiter.api.Test;

import login.ErrorLogin;
import login.LoginUI;

public class TestLogin {
	
	/**
	 * Asserts a correct user name as a string, and correct password as a string with valid characters
	 * Expected: True
	 * 
	 * @throws IOException 
	 */
	@Test
	void testCorrectUsernameAndPassword() throws IOException {
		String username1 = "Erika";
		String password1 = "Password1";
		
		String username2 = "Nagham";
		String password2 = "Password2";
		
		String username3 = "Nikhil";
		String password3 = "Password3";
		
		String username4 = "Steeve";
		String password4 = "Password4";
		
		LoginUI loginFrame = LoginUI.getInstance();
		
		LoginUI.getUsernameText().setText(username1);
		LoginUI.getPasswordText().setToolTipText(password1);
		assertTrue(loginFrame.checkUsenameAndPassword(username1, password1), "The user logs in");
		
		LoginUI.getUsernameText().setText(username2);
		LoginUI.getPasswordText().setToolTipText(password2);
		assertTrue(loginFrame.checkUsenameAndPassword(username2, password2), "The user logs in");
		
		LoginUI.getUsernameText().setText(username3);
		LoginUI.getPasswordText().setToolTipText(password3);
		assertTrue(loginFrame.checkUsenameAndPassword(username3, password3), "The user logs in");
		
		LoginUI.getUsernameText().setText(username4);
		LoginUI.getPasswordText().setToolTipText(password4);
		assertTrue(loginFrame.checkUsenameAndPassword(username4, password4), "The user logs in");
	}
	
	/**
	 * Asserts an incorrect user name as a string, and correct password as a string with valid characters
	 * Expected: False
	 * 
	 * @throws IOException 
	 */
	@Test
	void testIncorrectUsermameCorrectPassword() throws IOException {
		String username1 = "Erica";
		String password1 = "Password1";
		
		String username2 = "Naggam";
		String password2 = "Password2";
		
		String username3 = "Nikkil";
		String password3 = "Password3";
		
		String username4 = "Steve";
		String password4 = "Password4";
		
		LoginUI loginFrame = LoginUI.getInstance();
		
		LoginUI.getUsernameText().setText(username1);
		LoginUI.getPasswordText().setToolTipText(password1);
		assertFalse(loginFrame.checkUsenameAndPassword(username1, password1), "The user does not login");
		
		LoginUI.getUsernameText().setText(username2);
		LoginUI.getPasswordText().setToolTipText(password2);
		assertFalse(loginFrame.checkUsenameAndPassword(username2, password2), "The user does not login");
		
		LoginUI.getUsernameText().setText(username3);
		LoginUI.getPasswordText().setToolTipText(password3);
		assertFalse(loginFrame.checkUsenameAndPassword(username3, password3), "The user does not login");
		
		LoginUI.getUsernameText().setText(username4);
		LoginUI.getPasswordText().setToolTipText(password4);
		assertFalse(loginFrame.checkUsenameAndPassword(username4, password4), "The user does not login");
	}
	
	/**
	 * Asserts an empty user name, a password among the valid ones
	 * Expected: False
	 * 
	 * @throws IOException 
	 */
	@Test
	void testEmptyUsername() throws IOException {
		String username = "";
		
		String password1 = "Password1";
		String password2 = "Password2";
		String password3 = "Password3";
		String password4 = "Password4";
		
		LoginUI loginFrame = LoginUI.getInstance();
		
		LoginUI.getUsernameText().setText(username);
		LoginUI.getPasswordText().setToolTipText(password1);
		assertFalse(loginFrame.checkUsenameAndPassword(username, password1), "The user does not login");
		
		LoginUI.getUsernameText().setText(username);
		LoginUI.getPasswordText().setToolTipText(password2);
		assertFalse(loginFrame.checkUsenameAndPassword(username, password2), "The user does not login");
		
		LoginUI.getUsernameText().setText(username);
		LoginUI.getPasswordText().setToolTipText(password3);
		assertFalse(loginFrame.checkUsenameAndPassword(username, password3), "The user does not login");
		
		LoginUI.getUsernameText().setText(username);
		LoginUI.getPasswordText().setToolTipText(password4);
		assertFalse(loginFrame.checkUsenameAndPassword(username, password4), "The user does not login");
	}
	
	/**
	 * Asserts a correct user name as a string with an empty character at the end, and correct password as a string with valid characters
	 * Expected: False
	 * 
	 * @throws IOException 
	 */
	@Test
	void testCorrectUsernameWithEmptyCharAtEnd() throws IOException {
		String username1 = "Erika ";
		String password1 = "Password1";
		
		String username2 = "Nagham ";
		String password2 = "Password2";
		
		String username3 = "Nikhil ";
		String password3 = "Password3";
		
		String username4 = "Steeve ";
		String password4 = "Password4";
		
		LoginUI loginFrame = LoginUI.getInstance();
		
		LoginUI.getUsernameText().setText(username1);
		LoginUI.getPasswordText().setToolTipText(password1);
		assertFalse(loginFrame.checkUsenameAndPassword(username1, password1), "The user logs in");
		
		LoginUI.getUsernameText().setText(username2);
		LoginUI.getPasswordText().setToolTipText(password2);
		assertFalse(loginFrame.checkUsenameAndPassword(username2, password2), "The user logs in");
		
		LoginUI.getUsernameText().setText(username3);
		LoginUI.getPasswordText().setToolTipText(password3);
		assertFalse(loginFrame.checkUsenameAndPassword(username3, password3), "The user logs in");
		
		LoginUI.getUsernameText().setText(username4);
		LoginUI.getPasswordText().setToolTipText(password4);
		assertFalse(loginFrame.checkUsenameAndPassword(username4, password4), "The user logs in");
	}
	
	@Test
	public void testSetUsernamePassword()
	{
	    JTextField username = new JTextField("username");
	    LoginUI.setUsernameText(username);
	    assertEquals(username, LoginUI.getUsernameText());
	    
	    JPasswordField password = new JPasswordField("password");
        LoginUI.setPasswordText(password);
        assertEquals(password, LoginUI.getPasswordText());
	}
	
	@Test
	public void testModifySubmitButton()
	{
	    JButton submitButton = new JButton("Submit--");
        submitButton.setBounds(100, 80, 100, 25);
        LoginUI.setSubmitButton(submitButton);
        
        JButton actual = LoginUI.getSubmitButton();
        assertEquals(submitButton, actual);
        
	}
	@Test 
	public void testErrorLogin()
	{
	    ErrorLogin error = new ErrorLogin();
	    Component[] comp = error.getContentPane().getComponents();
	    JPanel panel = (JPanel) comp[0];
	    Component[] labels = panel.getComponents();
	    for(Component c:labels)
	    {
	        if (c.getClass().equals(JLabel.class))
	            assertEquals("The username or password you entered is incorrect. Please retry!", ((JLabel)(c)).getText());
	        else
	            assertEquals("Okay", ((JButton)(c)).getText());
	    }
	}

}
