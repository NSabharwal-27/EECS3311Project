package gui;

import java.util.ArrayList;

import analysis.AnalysisStrategy;

public interface Observer {
    //method to update the observer, used by subject
	public void recalcUpdate(RecalcButton sub);
    public void addUpdate(AddButton sub);
    public void remUpdate(RemoveButton sub);

    public AnalysisStrategy getAnalysisObj();
    public void getFeilds();
    public int start = MainWindow.getStartYear();
    public int end = MainWindow.getEndYear();
    public String country = MainWindow.getCountryCode();
    public String title = MainWindow.getAnalysisType();
    ArrayList<String> analysis = new ArrayList<>();

}
