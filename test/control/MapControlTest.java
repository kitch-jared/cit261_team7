/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maxine
 */
public class MapControlTest {
    
    public MapControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calc method, of class MapControl.
     */
    @Test
    public void testCalc() {
        System.out.println("calc");
        int timeRemaining = 72;
        int timeToDeduct = 12;
        int deliveryTime = 30;
        MapControl instance = new MapControl();
        int expResult = 30;
        int result = instance.calc(timeRemaining, timeToDeduct, deliveryTime);
        assertEquals(expResult, result);
        
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
