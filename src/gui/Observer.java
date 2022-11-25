package gui;

import java.util.ArrayList;

public interface Observer {
    //method to update the observer, used by subject
	public void recalcUpdate(RecalcButton sub);
    public void addUpdate(AddButton sub);
    public void remUpdate(RemoveButton sub);
    MainWindow window = MainWindow.getInstance();

    public int start = window.getStartYear();
    public int end = window.getEndYear();
    public String country = window.getCountryCode();
    public String title = window.getTitle();
    ArrayList<String> analysis = new ArrayList<>();

}
