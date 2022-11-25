package gui;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// implements Singleton Design Pattern
public class RecalcButton extends Subject {
    JButton recalculate = new JButton("Recalculate");

    private static RecalcButton instance;
	
	public static RecalcButton getInstance() {
		if (instance == null) {
			instance = new  RecalcButton();
		}
		return instance;
	}

    public RecalcButton(){
        recalculate.setFocusable(false);
        eventRecalc eventRecalc = new eventRecalc();
        recalculate.addActionListener(eventRecalc);
    }

    public class eventRecalc implements ActionListener{
        public void actionPerformed(ActionEvent eRecalc){
           System.out.println("TODO - Recalculate");
           System.out.println(MainWindow.getCountryCode() + "\n"
                   + MainWindow.getStartYear() + "\n" 
                   + MainWindow.getEndYear() + "\n"
                   + MainWindow.getRequestedChartTypes().toString() + "\n"
                   + MainWindow.getAnalysisType() + "\n");
           
           //TODO send to backend (OBSERVER)
           notifyObservers();
        }
    }
}