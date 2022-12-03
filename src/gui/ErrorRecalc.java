package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ErrorRecalc extends JFrame implements ActionListener{
    private JLabel errorLabel;
	private JButton okButton;
	private static ErrorRecalc instance;
	
	public static ErrorRecalc getInstance()
	{
	    if (instance == null)
	        instance = new ErrorRecalc();
	    return instance;
	}

    public ErrorRecalc(){
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(490, 100));
		this.getContentPane().add(panel);
		this.pack();
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
		this.add(panel);
		panel.setLayout(null);
        this.setVisible(true);

		errorLabel = new JLabel("You can't start adding charts without pressing recalculate. Please retry!");
		errorLabel.setBounds(20, 20, 450, 20);
		panel.add(errorLabel);

		okButton = new JButton("Okay");
		okButton.setBounds(180, 50, 100, 25);
		okButton.addActionListener(this);
		panel.add(okButton);
		instance = this;
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
    }
    
    public static boolean isCreated()
    {
        return ErrorRecalc.instance != null;
    }
}
