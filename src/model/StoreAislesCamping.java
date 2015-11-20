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

    Tent(50),
    Canopy(30),
    Flashlight(10),
    Lantern(15),
    Candles(5),
    Matches(1),
    Batteries(8),
    Stove(25),
    Grill(20),
    Propane(10),
    Charcoal(10);
    
    private final int costOfItem;
    
    StoreAislesCamping(int cost) {
        this.costOfItem = cost;
    }
    
    public int getCostOfItem() {
        return this.costOfItem;
    }
}    
