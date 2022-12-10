package test.java.Randoop;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        analysis.CalculateAnnualPercentageChange calculateAnnualPercentageChange0 = new analysis.CalculateAnnualPercentageChange();
        java.lang.Class<?> wildcardClass1 = calculateAnnualPercentageChange0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        analysis.Analysis_Type4 analysis_Type4_0 = new analysis.Analysis_Type4();
        java.lang.Class<?> wildcardClass1 = analysis_Type4_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        fetchData.DataSet dataSet0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = analysis.CalculateAverage.calculate(dataSet0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"fetchData.DataSet.getIterator()\" because \"rawData\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        fetchData.DataSet dataSet0 = null;
        // The following exception was thrown during execution in test generation
        try {
            fetchData.DataSet dataSet1 = analysis.CalculateAnnualPercentageChange.calculate(dataSet0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"countryCode\" because \"rawData\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        fetchData.DataSet dataSet0 = null;
        fetchData.DataSet dataSet1 = null;
        // The following exception was thrown during execution in test generation
        try {
            fetchData.DataSet dataSet2 = analysis.CalculateRatio.calculate(dataSet0, dataSet1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"fetchData.DataSet.getIterator()\" because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        analysis.Analysis_Type5 analysis_Type5_0 = new analysis.Analysis_Type5();
        java.lang.Class<?> wildcardClass1 = analysis_Type5_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        analysis.Analysis_Type8 analysis_Type8_0 = new analysis.Analysis_Type8();
        java.lang.Class<?> wildcardClass1 = analysis_Type8_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        analysis.Analysis_Type3 analysis_Type3_0 = new analysis.Analysis_Type3();
        java.lang.Class<?> wildcardClass1 = analysis_Type3_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        analysis.Analysis_Type1 analysis_Type1_0 = new analysis.Analysis_Type1();
        java.lang.Class<?> wildcardClass1 = analysis_Type1_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        analysis.CalculateAverage calculateAverage0 = new analysis.CalculateAverage();
        java.lang.Class<?> wildcardClass1 = calculateAverage0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        analysis.Analysis_Type7 analysis_Type7_0 = new analysis.Analysis_Type7();
        java.lang.Class<?> wildcardClass1 = analysis_Type7_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        analysis.CalculateRatio calculateRatio0 = new analysis.CalculateRatio();
        java.lang.Class<?> wildcardClass1 = calculateRatio0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        analysis.Analysis_Type6 analysis_Type6_0 = new analysis.Analysis_Type6();
        java.lang.Class<?> wildcardClass1 = analysis_Type6_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        analysis.Analysis_Type2 analysis_Type2_0 = new analysis.Analysis_Type2();
        java.lang.Class<?> wildcardClass1 = analysis_Type2_0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

