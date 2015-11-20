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
public enum StoreCamping implements Serializable {
    
    T("Tents and Canopies"),
    L("Lighting"),
    CS("Cooking Supplies"),
    X("Return to Game Menu");

    private final String aisleDescription;

    StoreCamping(String aisles) {
        this.aisleDescription = aisles;
    }

    public String getAisleDescription() {
        return this.aisleDescription;
    }
    
}
