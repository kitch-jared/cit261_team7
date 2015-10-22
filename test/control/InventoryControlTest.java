/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maloriegomm
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcAddMoneyEarned method, of class InventoryControl.
     */
    @Test
    public void testCalcAddMoneyEarned() {
        System.out.println("calcAddMoneyEarned");
        
        /**************************
         * Test Case #1
         **************************/
        System.out.println("/tTest Case #1");
        
        //input values for test case #1
        double budget = 100.0;
        double deliveryMoney = 25.0;
        
        double expResult = 125.0; // expected output returned

        
        // create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        // call function of InventoryControl class
        double result = instance.calcAddMoneyEarned(budget, deliveryMoney);

        // campare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
