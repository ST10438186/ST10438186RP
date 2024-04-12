/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package bracketcheck;

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
public class BracketCheckTest {
    
    public BracketCheckTest() {
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
        System.out.println("main");                                 //commented out, as cannot run unit tests for Scanner.
        String[] args = null;
        BracketCheck.main(args);
        
    }*/

   
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        String s = "{}{)}";
        boolean expResult = false;
        boolean result = BracketCheck.isValid(s);
        assertEquals(expResult, result);
        System.out.println(s);
        System.out.println(result);
        
        s = "";
        expResult = false;
        result = BracketCheck.isValid(s);
        assertEquals(expResult, result);
        System.out.println(s);
        System.out.println(result);
        
        s = "{[}]";
        expResult = false;
        result = BracketCheck.isValid(s);
        assertEquals(expResult, result);
        System.out.println(s);
        System.out.println(result);
        
        s = "()";
        expResult = true;
        result = BracketCheck.isValid(s);
        assertEquals(expResult, result);
        System.out.println(s);
        System.out.println(result);
        
        s = "({[]})";
        expResult = true;
        result = BracketCheck.isValid(s);
        assertEquals(expResult, result);
        System.out.println(s);
        System.out.println(result);
        
    }
    
}
