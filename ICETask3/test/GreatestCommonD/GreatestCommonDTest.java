/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package GreatestCommonD;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stardust
 */
public class GreatestCommonDTest {
    
    public GreatestCommonDTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
   /* @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;                           //commented out, as cannot run unit tests for Scanner.
        GreatestCommonD.main(args);
      
    }*/

    
    @Test
    public void testCommonDivisor() {
        System.out.println("CommonDivisor");
        int a = 6;
        int b = 8;
        int expResult = 2;
        int result = GreatestCommonD.CommonDivisor(a, b);
        assertEquals(expResult, result);
        System.out.println("Expected Result " + expResult);
        System.out.println("Result " + result);
       
    }
    
}
