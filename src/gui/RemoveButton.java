package gui;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveButton extends Subject{
    JButton removeView = new JButton("-");

    private static RemoveButton instance;
	
	public static RemoveButton getInstance() {
		if (instance == null) {
			instance = new  RemoveButton();
		}
		return instance;
	}

    public void notifyObservers(){
        for (Observer observer : this.observers){
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
            
            String selectedChart = MainWindow.availableViews.getSelectedItem().toString();
            MainWindow.requestedChartTypes.remove(selectedChart);

            System.out.println(MainWindow.getRequestedChartTypes().toString());

            updateChartList();
            notifyObservers();
        }
    }
}
