package gui;

import java.util.ArrayList;

import analysis.AnalysisStrategy;

public interface Observer {
    //method to update the observer, used by subject
	public void recalcUpdate(RecalcButton sub);
    public void addUpdate(AddButton sub);
    public void remUpdate(RemoveButton sub);

    public AnalysisStrategy getAnalysisObj();
    public void getFields();
    ArrayList<String> analysis = new ArrayList<>();
    public String getReport();

}
