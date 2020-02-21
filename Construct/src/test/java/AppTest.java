Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@pranavreddy38 
ARUKONDARAMYA
/
task4
1
00
 Code Issues 0 Pull requests 0 Actions Projects 0 Wiki Security Insights
task4/Construct/src/test/java/pari/com/Construct/AppTest.java
 Manisha1 commited
26f30ec 5 days ago
38 lines (34 sloc)  646 Bytes
  
package pari.com.Construct;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}