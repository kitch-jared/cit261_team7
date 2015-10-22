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
public class DeliveryControlTest {
    
    public DeliveryControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcNewTimeAfterDelivery method, of class DeliveryControl.
     */
    @Test
    public void testCalcNewTimeAfterDelivery() {
        System.out.println("calcNewTimeAfterDelivery");
        boolean makeDelivery = true;
        int timeRemaining = 72;
        DeliveryControl instance = new DeliveryControl();
        int expResult = 70;
        int result = instance.calcNewTimeAfterDelivery(makeDelivery, timeRemaining);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
