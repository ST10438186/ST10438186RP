/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package OddSquareSum;

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
public class OddSquareSumTest {
    
    public OddSquareSumTest() {
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

    /*
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;                                   //commented out, as cannot run unit tests for Scanner.
        OddSquareSum.main(args);
       
    }*/

   
    @Test
    public void testOdd_squares_sum() {
        System.out.println("odd_squares_sum");
        int limit = 20;
        double expResult = 10660;
        double result = OddSquareSum.odd_squares_sum(limit);
        assertEquals(expResult, result, 0);
        System.out.println("Expected Result " + expResult);
        System.out.println("Result " + result);
        
    }
    
}
