/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
//import java.util.Objects;

/**
 *
 * @author Maxine
 */
public enum StoreAislesCamping implements Serializable {

    TENT("Tent", 50), // capitalize everything in enum list
    CANOPY("Canopy", 30),
    FLASHLIGHT("Flashlight", 10),
    LANTERN("Lantern", 15),
    CANDLES("Candles", 5),
    MATCHES("Matches", 1),
    BATTERIES("Batteries", 8),
    STOVE("Stove", 25),
    GRILL("Grill", 20),
    PROPANE("Propane", 10),
    CHARCOAL("Charcoal", 10);
    
    private final int costOfItem;
    private final String item;
    
    StoreAislesCamping(String name, int cost) {
        this.costOfItem = cost;
        this.item = name;
    }
    
    public int getcostOfItem() {
        return costOfItem;
    }
    
    public String getItem() {
        return item;
    }
    
    public void printItemList() {
        
        StoreAislesCamping[] items = StoreAislesCamping.values();
        
        int total = 0;
        
        for (int q = 1; q <= 3; q++) {
            int quantity = 0 + q++;
            
            for (StoreAislesCamping item : items) {
                
                total = item.getCostOfItem() * q;
                
                System.out.println(total);
                
            }
        }
    }
    
    
    public int getCostOfItem() {
        return this.costOfItem;
    }
}    
