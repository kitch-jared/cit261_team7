/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Deliveries;
import model.Game;

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
    
    
    public int calcSurvivalPointsEarned(int currentSurvivalPoints, int survivalPoints, Game itemsCurrent, String name){
    
        
       // I need to wirte an if statement to check if the name is in the itemsCurrent array
        if (survivalPoints <= 0){
            return -1;
        }
        
        int quantity = 1;
        
        survivalPoints = 5;
        int totalItemsPoints = quantity * survivalPoints; 

        currentSurvivalPoints = currentSurvivalPoints + totalItemsPoints;
        
        return currentSurvivalPoints;
    }
}
