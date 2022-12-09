package gui;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        EventRemove eventRemove = new EventRemove();
        removeView.addActionListener(eventRemove);

    }

    public class EventRemove implements ActionListener{
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
