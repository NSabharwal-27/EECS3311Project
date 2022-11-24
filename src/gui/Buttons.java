package gui;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Buttons extends Subject {
    JButton addView = new JButton("+");
    JButton removeView = new JButton("-");
    JButton recalculate = new JButton("Recalculate");

    public Buttons(){
        addView.setFocusable(false);
        eventAdd eventAdd = new eventAdd();
        addView.addActionListener(eventAdd);

        removeView.setFocusable(false);
        eventRemove eventRemove = new eventRemove();
        removeView.addActionListener(eventRemove);
        
        recalculate.setFocusable(false);
        eventRecalc eventRecalc = new eventRecalc();
        recalculate.addActionListener(eventRecalc);

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
        }
    }

    public class eventRemove implements ActionListener{
        public void actionPerformed(ActionEvent eRemove){
            System.out.println("Removing Chart");
            System.out.println(MainWindow.getRequestedChartTypes().toString());

            String selectedChart = MainWindow.availableViews.getSelectedItem().toString();
            MainWindow.requestedChartTypes.remove(selectedChart);

            System.out.println(MainWindow.getRequestedChartTypes().toString());
            
        }
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
        }
    }
    
    


}
