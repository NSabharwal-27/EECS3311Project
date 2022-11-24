package analysis;

import java.util.HashMap;
import fetchData.DataSet;

public class Context {
    private AnalysisStrategy strategy;
    
    public Context(AnalysisStrategy strategy) {
        this.strategy = strategy;
    }
    
    public HashMap<String, DataSet> callExecute(int start, int end, String country){
        return strategy.analysisExecute(start, end, country);
    }
}
