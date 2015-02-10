package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.Arrays;
/**
 * Unit test for simple App.
 */
public class FileReaderTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FileReaderTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FileReaderTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testReadFile()
    {
        String content = FileReader.getFileContent("FileReaderContentTest.txt");
        System.out.println(content);
        assertTrue( content.equals("Hello World!\nFoo Bar") );
    }
}
