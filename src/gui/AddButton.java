package gui;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButton extends Subject {
    JButton addView = new JButton("+");

    private static AddButton instance;
	
	public static AddButton getInstance() {
		if (instance == null) {
			instance = new  AddButton();
		}
		return instance;
	}

    public void notifyObservers(){
        for (Observer observer : this.observers){
            observer.addUpdate(this);
        }
    }

    public AddButton(){
        addView.setFocusable(false);
        eventAdd eventAdd = new eventAdd();
        addView.addActionListener(eventAdd);
    }


    public class eventAdd implements ActionListener{
        public void actionPerformed(ActionEvent eAdd){
            System.out.println("Adding Chart");
            //TODO - Determine if chart is allowed based on analysis type
            
            System.out.println(MainWindow.getRequestedChartTypes().toString());

            String selectedChart = MainWindow.availableViews.getSelectedItem().toString();
            if ( !MainWindow.requestedChartTypes.contains(selectedChart)){ //Prevent duplicate
                MainWindow.requestedChartTypes.add(selectedChart);
            }

            System.out.println(MainWindow.getRequestedChartTypes().toString());

            notifyObservers();
        }
    }
}
