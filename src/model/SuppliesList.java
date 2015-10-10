/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author maloriegomm
 */
public class SuppliesList implements Serializable{
    
    private String items;
    private int itemSurvivalPoints;
    private int itemCost;

    public SuppliesList() {
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public int getItemSurvivalPoints() {
        return itemSurvivalPoints;
    }

    public void setItemSurvivalPoints(int itemSurvivalPoints) {
        this.itemSurvivalPoints = itemSurvivalPoints;
    }

    public int getItemCost() {
        return itemCost;
    }

    public void setItemCost(int itemCost) {
        this.itemCost = itemCost;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.items);
        hash = 89 * hash + this.itemSurvivalPoints;
        hash = 89 * hash + this.itemCost;
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
        final SuppliesList other = (SuppliesList) obj;
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        if (this.itemSurvivalPoints != other.itemSurvivalPoints) {
            return false;
        }
        if (this.itemCost != other.itemCost) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SuppliesList{" + "items=" + items + ", itemSurvivalPoints=" + itemSurvivalPoints + ", itemCost=" + itemCost + '}';
    }
    
    ///////////////////////////////
    //METHODS
    //////////////////////////////
}
