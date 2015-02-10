package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.Arrays;
/**
 * Unit test for simple App.
 */
public class ArrayManipulatorTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ArrayManipulatorTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ArrayManipulatorTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testReverse()
    {
        int[] a = new int[]{5,7,2,7,37};
        int[] b = new int[]{1,3,6,-7,9,2};


        int[] res = ArrayManipulator.mergeAndSort(a, b);
        assertTrue( Arrays.equals(res, new int[]{-7,1,2,2,3,5,6,7,7,9,37}) );
    }
}
