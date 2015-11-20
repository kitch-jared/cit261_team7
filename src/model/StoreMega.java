/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Maxine
 */
public enum StoreMega implements Serializable {
    
    P("Protein"),
    SS("Sweets and Sugars"),
    C("Carbohydrates"),
    T("Toiletries"),
    FA("First aid and Medicines"),
    A("Apparel"),
    B("Blankets"),
    W("Water"),
    X("Return to Game Menu");
    
    private final String aisleName;
    
    StoreMega(String aisle) {
        this.aisleName = aisle;
    }
    
    public String getAisleName() {
        return this.aisleName;
    }
}
