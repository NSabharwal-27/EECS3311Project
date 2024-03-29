package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AddButton extends Subject {
    public JButton addView = new JButton("+");

    private static AddButton instance;
	
	public static AddButton getInstance() {
		if (instance == null) {
			instance = new AddButton();
		}
		return instance;
	}

    public void notifyObservers(){
        for (Observer observer : Subject.observers){
            observer.addUpdate(this);
        }
    }

    public AddButton(){
        addView.setFocusable(false);
        EventAdd eventAdd = new EventAdd();
        addView.addActionListener(eventAdd);
    }


    public class EventAdd implements ActionListener{
        public void actionPerformed(ActionEvent eAdd){
            System.out.println("Adding Chart");
            //TODO - Determine if chart is allowed based on analysis type
            
            System.out.println(MainWindow.getRequestedChartTypes().toString());

            String selectedChart = MainWindow.getCurrentChart();
            if ( !MainWindow.requestedChartTypes.contains(selectedChart)){ //Prevent duplicate
                MainWindow.requestedChartTypes.add(selectedChart);
                updateChartList();
                notifyObservers();
            }
        }
    }
}
