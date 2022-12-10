package Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Class<?> wildcardClass6 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) -1, (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 0, (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) -1, (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        fetchData.Pair pair2 = new fetchData.Pair(10, (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Class<?> wildcardClass6 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        fetchData.Pair pair2 = new fetchData.Pair((int) 'a', (java.lang.Double) (-1.0d));
        int int3 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Class<?> wildcardClass7 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 0, (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) -1, (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 1.0d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        fetchData.Pair pair2 = new fetchData.Pair((int) '4', (java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        java.lang.Double double7 = pair2.getValue();
        java.lang.Class<?> wildcardClass8 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 10.0d);
        int int3 = pair2.getKey();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        java.lang.Double double6 = pair2.getValue();
        int int7 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        fetchData.Pair pair2 = new fetchData.Pair(1, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 100, (java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        int int7 = pair2.getKey();
        java.lang.Class<?> wildcardClass8 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        fetchData.Pair pair2 = new fetchData.Pair((int) '#', (java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Double double7 = pair2.getValue();
        java.lang.Class<?> wildcardClass8 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 0, (java.lang.Double) 0.0d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) -1, (java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        java.lang.Class<?> wildcardClass7 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 1, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 0, (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 1, (java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Double double7 = pair2.getValue();
        int int8 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        fetchData.Pair pair2 = new fetchData.Pair(97, (java.lang.Double) 100.0d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        fetchData.Pair pair2 = new fetchData.Pair(97, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        fetchData.Pair pair2 = new fetchData.Pair((int) '#', (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) -1, (java.lang.Double) 100.0d);
        int int3 = pair2.getKey();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        fetchData.Pair pair2 = new fetchData.Pair((int) '#', (java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        java.lang.Double double7 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        fetchData.Pair pair2 = new fetchData.Pair((int) 'a', (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 100, (java.lang.Double) (-1.0d));
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4.equals((-1.0d)));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        fetchData.Pair pair2 = new fetchData.Pair((int) '4', (java.lang.Double) (-1.0d));
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        int int5 = pair2.getKey();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Class<?> wildcardClass7 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 10.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Class<?> wildcardClass6 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Double double7 = pair2.getValue();
        java.lang.Class<?> wildcardClass8 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) -1, (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        fetchData.Pair pair2 = new fetchData.Pair(1, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        fetchData.Pair pair2 = new fetchData.Pair((int) 'a', (java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        fetchData.Pair pair2 = new fetchData.Pair(97, (java.lang.Double) 10.0d);
        int int3 = pair2.getKey();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        fetchData.Pair pair2 = new fetchData.Pair((int) '#', (java.lang.Double) 0.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        fetchData.Pair pair2 = new fetchData.Pair(97, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3.equals((-1.0d)));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Class<?> wildcardClass7 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        fetchData.Pair pair2 = new fetchData.Pair(10, (java.lang.Double) 0.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 0, (java.lang.Double) (-1.0d));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        fetchData.Pair pair2 = new fetchData.Pair(52, (java.lang.Double) 10.0d);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        fetchData.Pair pair2 = new fetchData.Pair(1, (java.lang.Double) 100.0d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Double double7 = pair2.getValue();
        int int8 = pair2.getKey();
        java.lang.Class<?> wildcardClass9 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 100, (java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        fetchData.Pair pair2 = new fetchData.Pair((int) 'a', (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 1, (java.lang.Double) (-1.0d));
        int int3 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) -1, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        fetchData.Pair pair2 = new fetchData.Pair((int) ' ', (java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        fetchData.Pair pair2 = new fetchData.Pair(32, (java.lang.Double) 10.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 1, (java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        fetchData.Pair pair2 = new fetchData.Pair(97, (java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        fetchData.Pair pair2 = new fetchData.Pair(52, (java.lang.Double) (-1.0d));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 10, (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        fetchData.Pair pair2 = new fetchData.Pair((int) '4', (java.lang.Double) 10.0d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        int int7 = pair2.getKey();
        int int8 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) -1, (java.lang.Double) 100.0d);
        java.lang.Double double3 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        fetchData.Pair pair2 = new fetchData.Pair((int) '4', (java.lang.Double) 1.0d);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Class<?> wildcardClass7 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Double double6 = pair2.getValue();
        int int7 = pair2.getKey();
        int int8 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        fetchData.Pair pair2 = new fetchData.Pair((int) 'a', (java.lang.Double) 100.0d);
        int int3 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        fetchData.Pair pair2 = new fetchData.Pair((int) '4', (java.lang.Double) (-1.0d));
        int int3 = pair2.getKey();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        fetchData.Pair pair2 = new fetchData.Pair((int) ' ', (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        fetchData.Pair pair2 = new fetchData.Pair(100, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        fetchData.Pair pair2 = new fetchData.Pair(97, (java.lang.Double) 10.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 10, (java.lang.Double) 10.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 100, (java.lang.Double) 10.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        int int5 = pair2.getKey();
        java.lang.Class<?> wildcardClass6 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        fetchData.Pair pair2 = new fetchData.Pair((int) '4', (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Double double6 = pair2.getValue();
        int int7 = pair2.getKey();
        java.lang.Double double8 = pair2.getValue();
        java.lang.Class<?> wildcardClass9 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        fetchData.Pair pair2 = new fetchData.Pair(1, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) -1, (java.lang.Double) 0.0d);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 1, (java.lang.Double) 100.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        fetchData.Pair pair2 = new fetchData.Pair(100, (java.lang.Double) (-1.0d));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Double double6 = pair2.getValue();
        int int7 = pair2.getKey();
        java.lang.Class<?> wildcardClass8 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        fetchData.Pair pair2 = new fetchData.Pair(100, (java.lang.Double) 10.0d);
        int int3 = pair2.getKey();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        fetchData.Pair pair2 = new fetchData.Pair((int) 'a', (java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        fetchData.Pair pair2 = new fetchData.Pair(32, (java.lang.Double) 0.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        java.lang.Class<?> wildcardClass7 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        fetchData.Pair pair2 = new fetchData.Pair((int) 'a', (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        int int7 = pair2.getKey();
        java.lang.Double double8 = pair2.getValue();
        int int9 = pair2.getKey();
        java.lang.Double double10 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10.equals(0.0d));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Double double6 = pair2.getValue();
        int int7 = pair2.getKey();
        java.lang.Class<?> wildcardClass8 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) (-1.0d));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 100, (java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        java.lang.Class<?> wildcardClass7 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        fetchData.Pair pair2 = new fetchData.Pair(1, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) 100.0d);
        java.lang.Double double3 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 10, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        fetchData.Pair pair2 = new fetchData.Pair(10, (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) -1, (java.lang.Double) (-1.0d));
        int int3 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        int int7 = pair2.getKey();
        java.lang.Double double8 = pair2.getValue();
        int int9 = pair2.getKey();
        int int10 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 0, (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        int int5 = pair2.getKey();
        java.lang.Class<?> wildcardClass6 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        fetchData.Pair pair2 = new fetchData.Pair((int) ' ', (java.lang.Double) 100.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Class<?> wildcardClass6 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        java.lang.Class<?> wildcardClass7 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        fetchData.Pair pair2 = new fetchData.Pair(1, (java.lang.Double) 1.0d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        java.lang.Double double7 = pair2.getValue();
        java.lang.Double double8 = pair2.getValue();
        java.lang.Double double9 = pair2.getValue();
        java.lang.Double double10 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10.equals(1.0d));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 10, (java.lang.Double) (-1.0d));
        int int3 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        int int7 = pair2.getKey();
        java.lang.Double double8 = pair2.getValue();
        java.lang.Double double9 = pair2.getValue();
        java.lang.Class<?> wildcardClass10 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        fetchData.Pair pair2 = new fetchData.Pair((int) ' ', (java.lang.Double) 100.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        int int5 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 10, (java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        fetchData.Pair pair2 = new fetchData.Pair((int) ' ', (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) -1, (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 1, (java.lang.Double) 100.0d);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 100, (java.lang.Double) 0.0d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 0, (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        int int7 = pair2.getKey();
        java.lang.Double double8 = pair2.getValue();
        java.lang.Class<?> wildcardClass9 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 0, (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        int int7 = pair2.getKey();
        java.lang.Double double8 = pair2.getValue();
        java.lang.Double double9 = pair2.getValue();
        int int10 = pair2.getKey();
        java.lang.Class<?> wildcardClass11 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 10.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Double double6 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6.equals(10.0d));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        fetchData.Pair pair2 = new fetchData.Pair((int) 'a', (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        fetchData.Pair pair2 = new fetchData.Pair(97, (java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        fetchData.Pair pair2 = new fetchData.Pair((int) ' ', (java.lang.Double) (-1.0d));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 100, (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        fetchData.Pair pair2 = new fetchData.Pair((int) 'a', (java.lang.Double) (-1.0d));
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        fetchData.Pair pair2 = new fetchData.Pair(100, (java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) -1, (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        int int7 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 1, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 1, (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 100, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        int int7 = pair2.getKey();
        int int8 = pair2.getKey();
        java.lang.Class<?> wildcardClass9 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 0, (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        java.lang.Double double5 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 1, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 100, (java.lang.Double) (-1.0d));
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        fetchData.Pair pair2 = new fetchData.Pair((int) 'a', (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        java.lang.Double double7 = pair2.getValue();
        java.lang.Double double8 = pair2.getValue();
        java.lang.Double double9 = pair2.getValue();
        int int10 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Double double7 = pair2.getValue();
        int int8 = pair2.getKey();
        java.lang.Double double9 = pair2.getValue();
        java.lang.Class<?> wildcardClass10 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        fetchData.Pair pair2 = new fetchData.Pair(10, (java.lang.Double) (-1.0d));
        int int3 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 1, (java.lang.Double) 10.0d);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        fetchData.Pair pair2 = new fetchData.Pair(100, (java.lang.Double) 10.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        java.lang.Double double7 = pair2.getValue();
        java.lang.Class<?> wildcardClass8 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        fetchData.Pair pair2 = new fetchData.Pair((int) 'a', (java.lang.Double) 10.0d);
        java.lang.Double double3 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3.equals(10.0d));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        java.lang.Double double7 = pair2.getValue();
        java.lang.Double double8 = pair2.getValue();
        java.lang.Class<?> wildcardClass9 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3.equals((-1.0d)));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) -1, (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        fetchData.Pair pair2 = new fetchData.Pair(1, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 100, (java.lang.Double) (-1.0d));
        int int3 = pair2.getKey();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 0, (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Class<?> wildcardClass7 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        fetchData.Pair pair2 = new fetchData.Pair(1, (java.lang.Double) 10.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4.equals(10.0d));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        int int7 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 0, (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) -1, (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 10.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        java.lang.Double double7 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        fetchData.Pair pair2 = new fetchData.Pair(1, (java.lang.Double) (-1.0d));
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4.equals((-1.0d)));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 1, (java.lang.Double) 100.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        fetchData.Pair pair2 = new fetchData.Pair((int) 'a', (java.lang.Double) 10.0d);
        int int3 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) -1, (java.lang.Double) 100.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) -1, (java.lang.Double) 0.0d);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) -1, (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        fetchData.Pair pair2 = new fetchData.Pair((int) '#', (java.lang.Double) (-1.0d));
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        fetchData.Pair pair2 = new fetchData.Pair(35, (java.lang.Double) 10.0d);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        fetchData.Pair pair2 = new fetchData.Pair((int) ' ', (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        fetchData.Pair pair2 = new fetchData.Pair(97, (java.lang.Double) 10.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4.equals(10.0d));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        java.lang.Double double7 = pair2.getValue();
        int int8 = pair2.getKey();
        java.lang.Double double9 = pair2.getValue();
        int int10 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        fetchData.Pair pair2 = new fetchData.Pair((int) '4', (java.lang.Double) (-1.0d));
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        fetchData.Pair pair2 = new fetchData.Pair(1, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        int int5 = pair2.getKey();
        java.lang.Class<?> wildcardClass6 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 100, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        fetchData.Pair pair2 = new fetchData.Pair(1, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 100, (java.lang.Double) 0.0d);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        fetchData.Pair pair2 = new fetchData.Pair(10, (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        fetchData.Pair pair2 = new fetchData.Pair(100, (java.lang.Double) 1.0d);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 1, (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) -1, (java.lang.Double) 100.0d);
        int int3 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Class<?> wildcardClass6 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 100, (java.lang.Double) (-1.0d));
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        int int5 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        fetchData.Pair pair2 = new fetchData.Pair((int) 'a', (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 100, (java.lang.Double) 10.0d);
        java.lang.Double double3 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3.equals(10.0d));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) 10.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        int int7 = pair2.getKey();
        java.lang.Class<?> wildcardClass8 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Double double6 = pair2.getValue();
        int int7 = pair2.getKey();
        int int8 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 100, (java.lang.Double) 100.0d);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        fetchData.Pair pair2 = new fetchData.Pair(100, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        java.lang.Double double7 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) -1, (java.lang.Double) 100.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) -1, (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Class<?> wildcardClass7 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        fetchData.Pair pair2 = new fetchData.Pair(97, (java.lang.Double) (-1.0d));
        int int3 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) -1, (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        int int5 = pair2.getKey();
        java.lang.Class<?> wildcardClass6 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 100, (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        java.lang.Double double7 = pair2.getValue();
        java.lang.Double double8 = pair2.getValue();
        java.lang.Double double9 = pair2.getValue();
        java.lang.Class<?> wildcardClass10 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        fetchData.Pair pair2 = new fetchData.Pair(100, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        java.lang.Double double6 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        fetchData.Pair pair2 = new fetchData.Pair((int) '#', (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 0, (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        fetchData.Pair pair2 = new fetchData.Pair((int) '#', (java.lang.Double) 100.0d);
        int int3 = pair2.getKey();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Double double7 = pair2.getValue();
        java.lang.Double double8 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) -1, (java.lang.Double) 10.0d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        int int7 = pair2.getKey();
        java.lang.Double double8 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        fetchData.Pair pair2 = new fetchData.Pair(1, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        java.lang.Class<?> wildcardClass6 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 0, (java.lang.Double) 10.0d);
        java.lang.Double double3 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3.equals(10.0d));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        java.lang.Double double6 = pair2.getValue();
        int int7 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        fetchData.Pair pair2 = new fetchData.Pair((int) '4', (java.lang.Double) (-1.0d));
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5.equals((-1.0d)));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 0, (java.lang.Double) 10.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4.equals(10.0d));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 10, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Double double7 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 100, (java.lang.Double) (-1.0d));
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 100, (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        int int6 = pair2.getKey();
        int int7 = pair2.getKey();
        java.lang.Double double8 = pair2.getValue();
        java.lang.Double double9 = pair2.getValue();
        java.lang.Double double10 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10.equals(0.0d));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) -1, (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Double double7 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        fetchData.Pair pair2 = new fetchData.Pair((int) ' ', (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        fetchData.Pair pair2 = new fetchData.Pair((int) '4', (java.lang.Double) (-1.0d));
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        int int6 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 10.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Double double7 = pair2.getValue();
        int int8 = pair2.getKey();
        java.lang.Double double9 = pair2.getValue();
        java.lang.Double double10 = pair2.getValue();
        java.lang.Double double11 = pair2.getValue();
        int int12 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        int int5 = pair2.getKey();
        java.lang.Class<?> wildcardClass6 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 1, (java.lang.Double) 100.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4.equals(100.0d));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 1, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        fetchData.Pair pair2 = new fetchData.Pair((int) '4', (java.lang.Double) 100.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 10, (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Class<?> wildcardClass6 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        fetchData.Pair pair2 = new fetchData.Pair(52, (java.lang.Double) 100.0d);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        fetchData.Pair pair2 = new fetchData.Pair(1, (java.lang.Double) 10.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 100.0d);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        fetchData.Pair pair2 = new fetchData.Pair((int) (byte) 100, (java.lang.Double) 100.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Class<?> wildcardClass5 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        fetchData.Pair pair2 = new fetchData.Pair((int) '#', (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Class<?> wildcardClass4 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        fetchData.Pair pair2 = new fetchData.Pair((-1), (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Double double7 = pair2.getValue();
        java.lang.Double double8 = pair2.getValue();
        int int9 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 1, (java.lang.Double) 100.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        int int5 = pair2.getKey();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Double double7 = pair2.getValue();
        int int8 = pair2.getKey();
        int int9 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 0, (java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        fetchData.Pair pair2 = new fetchData.Pair((int) '4', (java.lang.Double) (-1.0d));
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5.equals((-1.0d)));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        fetchData.Pair pair2 = new fetchData.Pair(0, (java.lang.Double) 0.0d);
        java.lang.Double double3 = pair2.getValue();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Double double6 = pair2.getValue();
        java.lang.Double double7 = pair2.getValue();
        int int8 = pair2.getKey();
        int int9 = pair2.getKey();
        java.lang.Double double10 = pair2.getValue();
        java.lang.Class<?> wildcardClass11 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        fetchData.Pair pair2 = new fetchData.Pair((int) ' ', (java.lang.Double) 10.0d);
        int int3 = pair2.getKey();
        int int4 = pair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        fetchData.Pair pair2 = new fetchData.Pair(100, (java.lang.Double) 0.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        java.lang.Class<?> wildcardClass6 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        fetchData.Pair pair2 = new fetchData.Pair((int) 'a', (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        fetchData.Pair pair2 = new fetchData.Pair((int) '4', (java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        fetchData.Pair pair2 = new fetchData.Pair((int) 'a', (java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass3 = pair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        fetchData.Pair pair2 = new fetchData.Pair((int) (short) 0, (java.lang.Double) 1.0d);
        java.lang.Double double3 = pair2.getValue();
        int int4 = pair2.getKey();
        int int5 = pair2.getKey();
        java.lang.Double double6 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6.equals(1.0d));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        fetchData.Pair pair2 = new fetchData.Pair((int) '#', (java.lang.Double) 10.0d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        fetchData.Pair pair2 = new fetchData.Pair((int) 'a', (java.lang.Double) 1.0d);
        int int3 = pair2.getKey();
        java.lang.Double double4 = pair2.getValue();
        java.lang.Double double5 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        fetchData.Pair pair2 = new fetchData.Pair(100, (java.lang.Double) 100.0d);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        fetchData.Pair pair2 = new fetchData.Pair(35, (java.lang.Double) 100.0d);
        java.lang.Double double3 = pair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
    }
}

