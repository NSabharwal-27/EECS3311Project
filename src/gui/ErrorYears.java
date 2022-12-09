package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ErrorYears extends JFrame implements ActionListener{
    private JLabel errorLabel;
	private JButton okButton;

    public ErrorYears(){
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(470, 100));
		this.getContentPane().add(panel);
		this.pack();
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
		this.add(panel);
		panel.setLayout(null);
        this.setVisible(true);

		errorLabel = new JLabel("The end year selected is before the start year. Please retry!");
		errorLabel.setBounds(20, 20, 430, 20);
		panel.add(errorLabel);

		okButton = new JButton("Okay");
		okButton.setBounds(180, 50, 100, 25);
		okButton.addActionListener(this);
		panel.add(okButton);
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
    }
}
