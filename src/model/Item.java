/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author maloriegomm
 */

public enum Item implements Serializable{
    
    TUNA("Tuna", 1, 10,"Kitchen"),
    PROTEIN_BAR("Protein Bar", 1, 10, "Kitchen"),
    BEANS("Beans", 1, 10, "Kitchen"),
    CHOCOLATE("Chocolate", 2, 10, "Kitchen"),
    COOKIES("Cookies", 3, 10, "Kitchen"),
    CANDY("Candy", 1, 10, "Kitchen"),
    JACKET("Jacket", 20, 50, "Bedroom"),
    SWEATSHIRT("Sweatshirt", 25, 50, "Bedroom"),
    SHOES("Shoes", 20, 50, "Bedroom"),
    HYGIENE_KIT("Hygiene Kit", 10, 30,"Bathroom"),
    TOILET_PAPER("Toilet paper", 5, 20, "Bathroom"),
    MEDICINE("Medicine", 5, 30, "Bathroom"); 
    
    private final String itemDescription;
    private final int itemCost;        
    private final int survivalPoints;
    private final String categoryName;

    Item(String item, int cost, int points, String category) {
        this.itemDescription = item;
        this.itemCost = cost;
        this.survivalPoints = points;
        this.categoryName = category;
    }

    public String getItemDescription() {
        return itemDescription;
    }
    public int getItemCost() {
        return itemCost;
    }
    
    public int getSurvivalPoints() {
        return survivalPoints;
    }

    public String getCategoryName() {
        return categoryName;
    }

    ///////////////////////////////////
    //METHODS
    ///////////////////////////////////
    
    // We need to construct the item array with names, cost, associated survival
    //points and category
    
}
