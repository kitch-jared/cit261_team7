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
     * Test 1: calcTimeRemaing(timeRemaining, timeToDeduct, deliveryTime) method
     */
    @Test
    public void testCalcTimeRemaining() {
        System.out.println("calc");
        int timeRemaining = 72;
        int timeToDeduct = 12;
        int deliveryTime = 30;
        MapControl instance = new MapControl();
        int expResult = 30;
        int result = instance.calcTimeRemaining(timeRemaining, timeToDeduct, deliveryTime);
        assertEquals(expResult, result);
        
        System.out.println(result);
        }
    /**
     * Test 2: calcTimeToDeduct() method
     */
    @Test
    public void testCalcTimeToDeduct() {
        System.out.println("calc");
        int timeRemaining = 50;
        int timeToDeduct = 1;
        MapControl instance = new MapControl();
        int expResult = 49;
        int result = instance.calcTimeToDeduct(timeRemaining);
        assertEquals(expResult, result);
        
        System.out.println(result);
        }    
}
