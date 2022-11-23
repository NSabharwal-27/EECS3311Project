package analysis;

import java.util.HashMap;
import fetchData.DataSet;

public interface AnalysisStrategy {
    public HashMap<String, DataSet> analysisExecute();
}
