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
public class CampingAisles implements Serializable{
    
    //I feel like I should be able to grab the aisle location based on the CampingStoreMap
    private CampingStoreMap aisle;
        
    //I think we want to pull out items from the Item class.
    private Item items;
    private Item itemCosts;
  
    public CampingAisles() {
    }

    public Item getItems() {
        return items;
    }

    public void setItems(Item items) {
        this.items = items;
    }

    public Item getItemCosts() {
        return itemCosts;
    }

    public void setItemCosts(Item itemCosts) {
        this.itemCosts = itemCosts;
    }

    public CampingStoreMap getAisle() {
        return aisle;
    }

    public void setAisle(CampingStoreMap aisle) {
        this.aisle = aisle;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.aisle);
        hash = 97 * hash + Objects.hashCode(this.items);
        hash = 97 * hash + Objects.hashCode(this.itemCosts);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CampingAisles other = (CampingAisles) obj;
        if (!Objects.equals(this.aisle, other.aisle)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        if (!Objects.equals(this.itemCosts, other.itemCosts)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CampingAisles{" + "aisle=" + aisle + ", items=" + items + ", itemCosts=" + itemCosts + '}';
    }

    /////////////////////////////////////
    //METHODS
    /////////////////////////////////////

     
}
