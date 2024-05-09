package com.test.junit;

import com.test.junit.model.PromoCodes;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
    extends TestCase
{
    PromoCodes promoCodes;
    public AppTest( String testName )
    {
        super( testName );
       promoCodes = new PromoCodes(); 
    }

    
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

   
    public void testApp()
    {
        assertTrue( true );
    }
    public void testAppAgain() {
    	int expectedCabFare = 500;
    	int actualCabFare = 500;
    	assertEquals(expectedCabFare, actualCabFare);
    }
    
    public void testPromoCode() {
    	assertEquals(true, promoCodes.checkPromoCodes("BINGO"));
    }
}