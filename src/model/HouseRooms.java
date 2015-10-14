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
 * @author Maxine
 */
public class HouseRooms implements Serializable {
    
    private ItemCategory survivalPoints;
    private Item item;
    private int numberOfItems;

    public HouseRooms() {
    }
    
    public ItemCategory getSurvivalPoints() {
        return survivalPoints;
    }

    public void setSurvivalPoints(ItemCategory survivalPoints) {
        this.survivalPoints = survivalPoints;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }
    
    
    @Override
    public String toString() {
        return "HouseRooms{" + "survivalPoints=" + survivalPoints + ", item=" + item + ", numberOfItems=" + numberOfItems + '}';
    }
    
    ///////////////////////////////////////
    // METHODS
    //////////////////////////////////////
    
    /* Use constant to set category points in each room, survival points, and number of
       items in each room. How is it set so that each room has a different set of points
       and items?
    */
   
    
}
