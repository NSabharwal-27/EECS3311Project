package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

import analysis.Analysis_Type1;
import analysis.Analysis_Type2;
import analysis.Analysis_Type3;
import analysis.Analysis_Type4;
import analysis.Analysis_Type5;
import analysis.Analysis_Type6;
import analysis.Analysis_Type7;
import analysis.Analysis_Type8;
import analysis.CalculateRatio;
import analysis.Context;
import fetchData.DataSet;

public class TestSelectAnalysisType {

    @Test
    public void testAnalysisType1()
    {
        String[] expectedIdentifiers = { 
                "Annual Energy Percentage",
                "Annual Pollution Percentage",
                "C02 Annual emissions percentage"};
        
        Context context = new Context(new Analysis_Type1());
        HashMap<String, DataSet> actualData = context.callExecute(2001, 2001, "Canada");
        String[] actualIdentifiers = actualData.keySet().toArray(new String[3]);

        assertEquals(3, actualData.size()); // 3 Series
        assertEquals(1, actualData.get("Annual Energy Percentage").size()); //DataSet is of size 1 for single year
        assertArrayEquals(expectedIdentifiers, actualIdentifiers); //Identifiers match

        //Check value of specific DataSet
        DataSet dataSet = actualData.get("Annual Energy Percentage");
        assertEquals(-2.525450465, dataSet.get(2001).doubleValue(), 0.00000001);
       
    }
    
    @Test
    public void testAnalysisType2()
    {
        String[] expectedIdentifiers = { 
                "Annual Pollution Percentage",
                "Annual Forest Area Percentage"};
        
        Context context = new Context(new Analysis_Type2());
        HashMap<String, DataSet> actualData = context.callExecute(2001, 2001, "Canada");
        String[] actualIdentifiers = actualData.keySet().toArray(new String[2]);

        assertEquals(2, actualData.size()); // 2 Series
        assertEquals(1, actualData.get( "Annual Forest Area Percentage").size()); //DataSet is of size 1 for single year
        assertArrayEquals(expectedIdentifiers, actualIdentifiers); //Identifiers match

        //Check value of specific DataSet
        DataSet dataSet = actualData.get( "Annual Forest Area Percentage");
        assertEquals(-0.013794056428, dataSet.get(2001).doubleValue(), 0.00000001);
       
    }
    
    @Test
    public void testAnalysisType3()
    {
        String[] expectedIdentifiers = {"C02 to GDP Ratio"};
        
        Context context = new Context(new Analysis_Type3());
        HashMap<String, DataSet> actualData = context.callExecute(2001, 2001, "Canada");
        String[] actualIdentifiers = actualData.keySet().toArray(new String[1]);

        assertEquals(1, actualData.size()); // 1 Series
        assertEquals(1, actualData.get("C02 to GDP Ratio").size()); //DataSet is of size 1 for single year
        assertArrayEquals(expectedIdentifiers, actualIdentifiers); //Identifiers match

        //Check value of specific DataSet
        DataSet dataSet = actualData.get("C02 to GDP Ratio");
        assertEquals(1458.651, dataSet.get(2001).doubleValue(), 0.001);
        
    }
    
    @Test
    public void testAnalysisType4()
    {
        String[] expectedIdentifiers = {"Average Forest Area"};
        
        Context context = new Context(new Analysis_Type4());
        HashMap<String, DataSet> actualData = context.callExecute(2000, 2005, "Canada");
        String[] actualIdentifiers = actualData.keySet().toArray(new String[1]);

        assertEquals(1, actualData.size()); // 1 Series
        assertEquals(1, actualData.get(expectedIdentifiers[0]).size()); //DataSet is of size 1 for single average
        assertArrayEquals(expectedIdentifiers, actualIdentifiers); //Identifiers match

        //Check value of specific DataSet
        DataSet dataSet = actualData.get(expectedIdentifiers[0]);
        //Average special case, where year = 0 for single value
        assertEquals(38.779604, dataSet.get(0).doubleValue(), 0.000001);
    }
    
    @Test
    public void testAnalysisType5()
    {
        String[] expectedIdentifiers = {"Government Expenditure"};
        
        Context context = new Context(new Analysis_Type5());
        HashMap<String, DataSet> actualData = context.callExecute(2000, 2005, "Canada");
        String[] actualIdentifiers = actualData.keySet().toArray(new String[1]);

        assertEquals(1, actualData.size()); // 1 Series
        assertEquals(1, actualData.get(expectedIdentifiers[0]).size()); //DataSet is of size 1 for single average
        assertArrayEquals(expectedIdentifiers, actualIdentifiers); //Identifiers match

        //Check value of specific DataSet
        DataSet dataSet = actualData.get(expectedIdentifiers[0]);
        //Average special case, where year = 0 for single value
        assertEquals(5.0338, dataSet.get(0).doubleValue(), 0.0001);
    }
    
    @Test
    public void testAnalysisType6()
    {
        //TODO Not working - Number way too small
        String[] expectedIdentifiers = {"Ratio of Health Expenditure to Hospital Beds"};
        
        Context context = new Context(new Analysis_Type6());
        HashMap<String, DataSet> actualData = context.callExecute(2000, 2005, "Canada");
        String[] actualIdentifiers = actualData.keySet().toArray(new String[1]);

        assertEquals(1, actualData.size()); // 1 Series
        assertEquals(6, actualData.get(expectedIdentifiers[0]).size()); //DataSet is of size 6 for 6 years
        assertArrayEquals(expectedIdentifiers, actualIdentifiers); //Identifiers match

        //Check value of specific DataSet
        DataSet dataSet = actualData.get(expectedIdentifiers[0]);
        assertEquals(57.61557, dataSet.get(2000).doubleValue(), 0.00001);
    }
    
    @Test
    public void testAnalysisType7()
    {
        String[] expectedIdentifiers = 
            {"Problems Accessing Healthcare", "Infant Mortality Rate"};
      
      Context context = new Context(new Analysis_Type7());
      HashMap<String, DataSet> actualData = context.callExecute(2015, 2015, "Canada");
      String[] actualIdentifiers = actualData.keySet().toArray(new String[1]);
      
      assertEquals(2, actualData.size());
      assertEquals(1, actualData.get(expectedIdentifiers[0]).size()); //DataSet is of size 1 for 1 year
      assertArrayEquals(expectedIdentifiers, actualIdentifiers); //Identifiers match
      
      //Check value of specific DataSet
      DataSet dataSet = actualData.get(expectedIdentifiers[1]);
      assertEquals(4.7, dataSet.get(2015).doubleValue(), 0.1);
    } 
    
    @Test
    public void testAnalysisType8()
    {
        String[] expectedIdentifiers = 
            {"Government Health Expenditure", "Government Education Expenditure"};
      
      Context context = new Context(new Analysis_Type8());
      HashMap<String, DataSet> actualData = context.callExecute(2010, 2010, "Canada");
      String[] actualIdentifiers = actualData.keySet().toArray(new String[1]);
      
      assertEquals(2, actualData.size()); // 1 Series
      assertEquals(1, actualData.get(expectedIdentifiers[0]).size()); //DataSet is of size 1 for 1 year
      assertArrayEquals(expectedIdentifiers, actualIdentifiers); //Identifiers match
      
      //Check value of specific DataSet
      DataSet dataSet = actualData.get(expectedIdentifiers[1]);
      assertEquals(5.35637, dataSet.get(2010).doubleValue(), 0.0001);
    } 
    
    @Test
    public void testCalculateRatio()
    {
        DataSet a = new DataSet();
        DataSet b = new DataSet();
        a.put(2000,10.0);
        b.put(2000, 20.0);
        
        assertEquals(0.5, CalculateRatio.calculate(a, b).get(2000), 0.1);
        assertEquals(2.0, CalculateRatio.calculate(b, a).get(2000), 0.1);
        
        a.put(2000, null);
        assertNull(CalculateRatio.calculate(a, b).get(2000));
    }
    
}
