/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.CampingAisles;
import model.Deliveries;
import model.Game;
import model.InventoryList;
import model.MegaAisles;

/**
 *
 * @author maloriegomm
 */
public class InventoryControl {
    
    // function for money earned
    public double calcAddMoneyEarned(double budget, double deliveryMoney){
    
            if (budget < 0){
                return -1;
            }
            if (deliveryMoney < 0){
                return -1;
            }
            
            budget = budget + deliveryMoney;
                return budget;
        }
    
    
    //function to calculate money spent
    public double calcMoneySpent(double budget, double itemCost, String name, int quantity){
        
        if (budget <= 0 && budget < itemCost){
            return -1;
        }
        if (quantity <0 || quantity > 5){
            return -1;
        }
        
        double totalItemCost = itemCost * quantity;
        budget = budget - totalItemCost;
        
        return budget;       
    }
    
    
    public int calcSurvivalPointsEarned(int survivalPoints){
            
        // We will need to add  String itemsCurrent, String name to perameters once I figure out how to use them
        // I need to make it so that the program runs through the itemsCurrent array and gets the
        // survival points assiciated with each of the items in the itemsCurrent array 
            
        
        int numberOfItems = 9;
        int i;
        
        for (i = 0; i <= numberOfItems; i = i+1){
            // figure out the survival points based on the name of the item
            if (i <= 0){
                survivalPoints = 5; 
            } else{
                 survivalPoints += 5; 
            } 
        }
        
        //Just checking 
        System.out.println(survivalPoints);

        int currentSurvivalPoints = survivalPoints;
        
        //Just checking 
        System.out.println(currentSurvivalPoints);
        
        return currentSurvivalPoints;
    }
    
    
    // Calculate how many survival point the player still needs to collect
    public int calcSurvivalPointsNeeded(int currentSurvivalPoints, int neededSurvivalPoints){
        
        int remainingSurvivalPoints = neededSurvivalPoints - currentSurvivalPoints;
        return remainingSurvivalPoints;
    }
    
    

    // Function to add item to inventory
    
    /**
     *
     * @param item
     * @param itemsCurrent
     * @param quantity
     * @param quantity
     * @return
     */
        
    public String addItem(String item, InventoryList itemsCurrent, int quantity){
    
          // some how we've got get the different corrdinant locations and assign 
//        //them names to display 
//        
//        // For now I am just hard coding megaStore in
//        location = "megaStore";
//        
//        // check if they are in the house or store
//        if ("house".equals(location)){
//            // check which room they are in
//            if ("bedroom".equals(location)){
//                //get items from that room
//                item = "clothes";
//                int quantity = 2; 
//            }            
//        } else {
//            //
//            
//        }
        
        // add item to inventory list
//        itemsCurrent = itemsCurrent + item; 
        
        return null; 
    }
}
