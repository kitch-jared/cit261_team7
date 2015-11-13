/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Deliveries;
import model.Item;
import model.Player;
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
     * *********************************************************
     * Test Case #1
     **********************************************************
     */
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

    /**
     * *********************************************************
     * Test Case #2
     **********************************************************
     */
    @Test
    public void testcalcAddMoneyEarned() {
        System.out.println("calcAddMoneyEarned");

        System.out.println("Test Case #2");

        Player p = new Player();
        Deliveries d = new Deliveries();

        p.setMoney(25.00);
        d.setDeliveryMoney(5.00);
     
        InventoryControl instance = new InventoryControl();
        
        double expResult = 30.00;
        double result = instance.calcAddMoneyEarned(p, d);
        
        System.out.println(result);
        
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * *********************************************************
     * Test Case #3
     **********************************************************
     */
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

    /**
     * *********************************************************
     * Test Case #4
     **********************************************************
     */
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

//    @Test
//    public void testPurchaseItems() {
//        System.out.println("TESTING PURCHASE ITEMS");
//
//        Player p = new Player();
//        Item i = new Item();
//
//        i.setName("Gum");
//        i.setItemCost(1.25);
//
//        InventoryControl ic = new InventoryControl();
//
//        boolean result = ic.purchaseItems(p, i, 1);
//        assertFalse(result);
//        assertEquals(false, result);
//
//        p.setMoney(1.25);
//        result = ic.purchaseItems(p, i, 1);
//        assertTrue(result);
//        assertEquals(0, p.getMoney(), 0);
//
//        p = new Player();
//        p.setMoney(10);
//
//        result = ic.purchaseItems(p, i, 2);
//        assertTrue(result);
//        assertEquals(7.50, p.getMoney(), 0);
//        assertEquals(2, p.getInventory().size());
//    }
//
//}
