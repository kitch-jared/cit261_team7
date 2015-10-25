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

    /***********************************************************
     * Test Case #1
     ***********************************************************/
    
    @Test
    public void testCalcMoneySpent() {
        System.out.println("calcMoneySpent");
        
        System.out.println("Test Case #1");
        
        double budget = 150.0;
        double itemCost = 20.0;
        String name = "Tent";
        int quantity = 1;
        
        InventoryControl instance = new InventoryControl();
        
        double expResult = 130.0;
        double result = instance.calcMoneySpent(budget, itemCost, name, quantity);
        
        
        assertEquals(expResult, result, 0.0);
 
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    
      /***********************************************************
     * Test Case #2
     ***********************************************************/
    
    @Test
    public void testcalcAddMoneyEarned() {
        System.out.println("calcAddMoneyEarned");
        
        System.out.println("Test Case #2");
        
        double budget = 100.0;
        double deliveryMoney = 25.0;
        
        InventoryControl instance = new InventoryControl();
        
        double expResult = 125.0;
        double result = instance.calcAddMoneyEarned(budget, deliveryMoney);
        
        
        assertEquals(expResult, result, 0.0);
 
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
     /***********************************************************
     * Test Case #3
     ***********************************************************/
    
    @Test
    public void testcalcSurvivalPointsEarned() {
        System.out.println("calcSurvivalPointsEarned");
        
        System.out.println("Test Case #3");
                
        int survivalPoints = 5;
        int numberOfItems = 9;
        
        
        InventoryControl instance = new InventoryControl();
        
        int expResult = 50;
        int result = instance.calcSurvivalPointsEarned(survivalPoints);
        
        
        assertEquals(expResult, result, 0.0);
 
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
     /***********************************************************
     * Test Case #4
     ***********************************************************/
    
    @Test
    public void testcalcSurvivalPointsNeeded() {
        System.out.println("calcSurvivalPointsNeeded");
        
        System.out.println("Test Case #4");

        int currentSurvivalPoints = 350;
        int neededSurvivalPoints = 500;
        
        InventoryControl instance = new InventoryControl();
        
        int expResult = 150;
        int result = instance.calcSurvivalPointsNeeded(currentSurvivalPoints, neededSurvivalPoints);

        assertEquals(expResult, result, 0.0);
 
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
