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
public class InventoryList implements Serializable{
    
    //this need to be an array!!
    private String itemsCurrent;
    private String itemsNeeded;
    private int currentSurvivalPoints;
    private int neededSurvivalPoints;

    public InventoryList() {
    }

    public String getItemsCurrent() {
        return itemsCurrent;
    }

    public void setItemsCurrent(String itemsCurrent) {
        this.itemsCurrent = itemsCurrent;
    }

    public String getItemsNeeded() {
        return itemsNeeded;
    }

    public void setItemsNeeded(String itemsNeeded) {
        this.itemsNeeded = itemsNeeded;
    }

    public int getCurrentSurvivalPoints() {
        return currentSurvivalPoints;
    }

    public void setCurrentSurvivalPoints(int currentSurvivalPoints) {
        this.currentSurvivalPoints = currentSurvivalPoints;
    }

    public int getNeededSurvivalPoints() {
        return neededSurvivalPoints;
    }

    public void setNeededSurvivalPoints(int neededSurvivalPoints) {
        this.neededSurvivalPoints = neededSurvivalPoints;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.itemsCurrent);
        hash = 17 * hash + Objects.hashCode(this.itemsNeeded);
        hash = 17 * hash + this.currentSurvivalPoints;
        hash = 17 * hash + this.neededSurvivalPoints;
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
        final InventoryList other = (InventoryList) obj;
        if (!Objects.equals(this.itemsCurrent, other.itemsCurrent)) {
            return false;
        }
        if (!Objects.equals(this.itemsNeeded, other.itemsNeeded)) {
            return false;
        }
        if (this.currentSurvivalPoints != other.currentSurvivalPoints) {
            return false;
        }
        if (this.neededSurvivalPoints != other.neededSurvivalPoints) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryList{" + "itemsCurrent=" + itemsCurrent + ", itemsNeeded=" + itemsNeeded + ", currentSurvivalPoints=" + currentSurvivalPoints + ", neededSurvivalPoints=" + neededSurvivalPoints + '}';
    }
    
    ////////////////////////////////////
    //METHODS
    ////////////////////////////////////
    
    
}
