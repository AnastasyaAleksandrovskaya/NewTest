/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asus
 */
public class CalculateTest {
    
    public CalculateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Hi");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Bye");
    }
    
    @Before
    public void setUp() {
        System.out.println("Start");
    }
    
    @After
    public void tearDown() {
        System.out.println("End");
    }

    /**
     * Test of getSum method, of class Calculate.
     */
    @Test
    public void testGetSum() {
        System.out.println("getSum");
        int x = 0;
        int y = 0;
        Calculate instance = new Calculate();
        int expResult = 0;
        int result = instance.getSum(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDivide method, of class Calculate.
     */
    @Test
    public void testGetDivide() {
        System.out.println("getDivide");
        int x = 0;
        int y = 0;
        Calculate instance = new Calculate();
        int expResult = 0;
        int result = instance.getDivide(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMultiple method, of class Calculate.
     */
    @Test
    public void testGetMultiple() {
        System.out.println("getMultiple");
        int x = 0;
        int y = 0;
        Calculate instance = new Calculate();
        int expResult = 0;
        int result = instance.getMultiple(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
