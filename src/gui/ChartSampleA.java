package gui;

public class ChartSampleA implements Observer{
    private RecalcButton subject = RecalcButton.getInstance();

    public ChartSampleA(){
        subject.register(this);
    }

    @Override
    public void update(Subject sub) {
        
        
    }
}
