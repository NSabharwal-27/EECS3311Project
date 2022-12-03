package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import fetchData.DataSet;
import fetchData.FetchData;
import fetchData.Pair;

class TestFetchData {

	/**
	 * Standard test for fetching data.
	 * E.g: Fetching forest area percentage for Canada (CAN)
	 * Expected: Returns HashMap with correct values
	 */
	@Test
	void testStandardFetch() {
		String country = "Canada";
		int year1 = 2000;
		int year2 = 2003;
		String indicator = "AG.LND.FRST.ZS";
		
		DataSet expected = new DataSet();
		expected.put(2000, 38.7929818338782);
		expected.put(2001, 38.7876307080739);
		expected.put(2002, 38.7822795822695);
		expected.put(2003, 38.7769284564652);
		
		DataSet actual = FetchData.fetchData(country, indicator, year1, year2);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test fetching data with an invalid Country Code
	 * Expected: API returns world info, with the country read in being Afghanistan
	 */
	@Test
	void testInvalidCountry() {
		String country = "Invalid";
		int year1 = 2000;
		int year2 = 2000;
		String indicator = "AG.LND.FRST.ZS";
		Double expected = 1.85278199408184;
		
		DataSet data = FetchData.fetchData(country, indicator, year1, year2);

		Double value = data.get(year1);
		
		assertEquals(expected, value);
	}
	
	/**
	 * Test fetching data using an invalid indicator
	 * Expected: Returns null without crashing
	 */
	@Test
	void testInvalidIndicator()
	{
		String country = "Canada";
		int year1 = 2000;
		int year2 = 2001;
		String indicator = "AG.LND.FRST.Z";
		
		DataSet actual = FetchData.fetchData(country, indicator, year1, year2);
		assertNull(actual);	
	}
	
	/**
	 * Test fetching data for a single year.
	 * E.g Range=2005:2005
	 * Expected: Returns HashMap of size 1 for the appropriate year.
	 */
	@Test
	void testSingleYear()
	{
		String country = "USA";
		int year1 = 2005;
		int year2 = 2005;
		String indicator = "EN.ATM.PM25.MC.M3";
		
		DataSet expected = new DataSet();
		expected.put(2005, 9.6098244651228);
		
		DataSet actual = FetchData.fetchData(country, indicator, year1, year2);
		assertTrue(actual.size() == 1);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test fetching data with the years in reversed order.
	 * Expected: Works as expected, returning HashMap with correctly fetched 
	 * values within proper year range.
	 */
	@Test
	void testFlippedYearRange()
	{
		String country = "Canada";
		int year1 = 2012;
		int year2 = 2010;
		String indicator = "EN.ATM.PM25.MC.M3";
		
		DataSet expected = new DataSet();
		expected.put(2010, 8.38445726234609);
		expected.put(2011, 8.62446106021405);
		expected.put(2012, 8.10741049508877);
		
		DataSet actual = FetchData.fetchData(country, indicator, year1, year2);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test fetching data for a year with an undefined value
	 * Expected: Returns HashMap with pair (year, Null)
	 */
	@Test
	void testUndefinedValue()
	{
		String country = "Canada";
		int year1 = 2020;
		int year2 = 2020;
		String indicator = "EN.ATM.PM25.MC.M3";
		
		DataSet expected = new DataSet();
		expected.put(2020, null);
		
		DataSet actual = FetchData.fetchData(country, indicator, year1, year2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDataSetObject()
	{
	    DataSet a = new DataSet();
	    DataSet b = new DataSet();
	    Object obj = new Object();
	    
	    //Test equals, against different DataSet, Object, Null
	    assertTrue(a.equals(b));
	    a.put(2000, 8.0);
	    assertFalse(a.equals(b));
	    assertFalse(b.equals(obj));
	    assertFalse(b.equals(null));
	    
	    //Test Positive Equals
	    b.putPair(new Pair(2000, 8.00));
	    assertTrue(a.equals(b));
	    
	    //Test toString
	    String aExpected = "2000 : 8.0\n"; //Single element
	    assertEquals(aExpected, a.toString());
	    
	    b.put(2001, 9.1234567); // Multiple Elements
	    String bExpected = "2000 : 8.0\n" + "2001 : 9.1234567\n";
	    assertEquals(bExpected, b.toString());

	    String bExpectedRounded = "2000 : 8.000000\n" + "2001 : 9.123457\n";
	    assertEquals(bExpectedRounded, b.toStringRounded());
	}
}