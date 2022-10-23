package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.junit.jupiter.api.Test;

import login.LoginUI;

public class UC1_TestLogin {
	
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
		
		loginFrame.getUsernameText().setText(username1);
		loginFrame.getPasswordText().setToolTipText(password1);
		assertTrue(loginFrame.checkUsenameAndPassword(username1, password1), "The user logs in");
		
		loginFrame.getUsernameText().setText(username2);
		loginFrame.getPasswordText().setToolTipText(password2);
		assertTrue(loginFrame.checkUsenameAndPassword(username2, password2), "The user logs in");
		
		loginFrame.getUsernameText().setText(username3);
		loginFrame.getPasswordText().setToolTipText(password3);
		assertTrue(loginFrame.checkUsenameAndPassword(username3, password3), "The user logs in");
		
		loginFrame.getUsernameText().setText(username4);
		loginFrame.getPasswordText().setToolTipText(password4);
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
		
		loginFrame.getUsernameText().setText(username1);
		loginFrame.getPasswordText().setToolTipText(password1);
		assertFalse(loginFrame.checkUsenameAndPassword(username1, password1), "The user does not login");
		
		loginFrame.getUsernameText().setText(username2);
		loginFrame.getPasswordText().setToolTipText(password2);
		assertFalse(loginFrame.checkUsenameAndPassword(username2, password2), "The user does not login");
		
		loginFrame.getUsernameText().setText(username3);
		loginFrame.getPasswordText().setToolTipText(password3);
		assertFalse(loginFrame.checkUsenameAndPassword(username3, password3), "The user does not login");
		
		loginFrame.getUsernameText().setText(username4);
		loginFrame.getPasswordText().setToolTipText(password4);
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
		
		loginFrame.getUsernameText().setText(username);
		loginFrame.getPasswordText().setToolTipText(password1);
		assertFalse(loginFrame.checkUsenameAndPassword(username, password1), "The user does not login");
		
		loginFrame.getUsernameText().setText(username);
		loginFrame.getPasswordText().setToolTipText(password2);
		assertFalse(loginFrame.checkUsenameAndPassword(username, password2), "The user does not login");
		
		loginFrame.getUsernameText().setText(username);
		loginFrame.getPasswordText().setToolTipText(password3);
		assertFalse(loginFrame.checkUsenameAndPassword(username, password3), "The user does not login");
		
		loginFrame.getUsernameText().setText(username);
		loginFrame.getPasswordText().setToolTipText(password4);
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
		
		loginFrame.getUsernameText().setText(username1);
		loginFrame.getPasswordText().setToolTipText(password1);
		assertFalse(loginFrame.checkUsenameAndPassword(username1, password1), "The user logs in");
		
		loginFrame.getUsernameText().setText(username2);
		loginFrame.getPasswordText().setToolTipText(password2);
		assertFalse(loginFrame.checkUsenameAndPassword(username2, password2), "The user logs in");
		
		loginFrame.getUsernameText().setText(username3);
		loginFrame.getPasswordText().setToolTipText(password3);
		assertFalse(loginFrame.checkUsenameAndPassword(username3, password3), "The user logs in");
		
		loginFrame.getUsernameText().setText(username4);
		loginFrame.getPasswordText().setToolTipText(password4);
		assertFalse(loginFrame.checkUsenameAndPassword(username4, password4), "The user logs in");
	}

}
