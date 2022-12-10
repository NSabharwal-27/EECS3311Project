package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class RemoveButton extends Subject{
    public JButton removeView = new JButton("-");

    private static RemoveButton instance;
	
	public static RemoveButton getInstance() {
		if (instance == null) {
			instance = new  RemoveButton();
		}
		return instance;
	}

    public void notifyObservers(){
        for (Observer observer : Subject.observers){
            observer.remUpdate(this);
        }
    }

    public RemoveButton(){
        removeView.setFocusable(false);
        eventRemove eventRemove = new eventRemove();
        removeView.addActionListener(eventRemove);

    }

    public class eventRemove implements ActionListener{
        public void actionPerformed(ActionEvent eRemove){
            System.out.println("Removing Chart");
            System.out.println(MainWindow.getRequestedChartTypes().toString());
            
            String selectedChart = MainWindow.getCurrentChart();
            MainWindow.requestedChartTypes.remove(selectedChart);

            System.out.println(MainWindow.getRequestedChartTypes().toString());

            notifyObservers();
        }
    }
}
