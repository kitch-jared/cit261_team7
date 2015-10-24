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
     * Test #1: calcNewTimeAfterDelivery method, of class DeliveryControl.
     */
    /*@Test
    public void testCalcNewTimeAfterDelivery() {
        System.out.println("calcNewTimeAfterDelivery");
        boolean makeDelivery = true;
        int timeRemaining = 72;
        DeliveryControl instance = new DeliveryControl();
        int expResult = 70;
        int result = instance.calcNewTimeAfterDelivery(makeDelivery, timeRemaining);
        assertEquals(expResult, result);
    }

    /* *
    * Test #2:checkDeliveries method
    */
    
    @Test
    public void testcheckDeliveries() {
        System.out.println("checkDeliveries");
        boolean makeDeliveries = true;
        int numberOfDeliveries = 10;
        DeliveryControl instance = new DeliveryControl();
        int expResult = 9;
        int result = instance.calcNewTimeAfterDelivery(makeDeliveries, numberOfDeliveries);
        assertEquals(expResult, result);
    }
}


