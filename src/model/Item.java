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

//Should I list out all the items here???

public class Item implements Serializable{
    
    private String name [];
    private int survivalPoints [];
    private double itemCost [];
    private String categoryName;

    public Item() {
    }


    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int[] getSurvivalPoints() {
        return survivalPoints;
    }

    public void setSurvivalPoints(int[] survivalPoints) {
        this.survivalPoints = survivalPoints;
    }

    public double[] getItemCost() {
        return itemCost;
    }

    public void setItemCost(double[] itemCost) {
        this.itemCost = itemCost;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Arrays.deepHashCode(this.name);
        hash = 59 * hash + Arrays.hashCode(this.survivalPoints);
        hash = 59 * hash + Arrays.hashCode(this.itemCost);
        hash = 59 * hash + Objects.hashCode(this.categoryName);
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
        final Item other = (Item) obj;
        if (!Arrays.deepEquals(this.name, other.name)) {
            return false;
        }
        if (!Arrays.equals(this.survivalPoints, other.survivalPoints)) {
            return false;
        }
        if (!Arrays.equals(this.itemCost, other.itemCost)) {
            return false;
        }
        if (!Objects.equals(this.categoryName, other.categoryName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", survivalPoints=" + survivalPoints + ", itemCost=" + itemCost + ", categoryName=" + categoryName + '}';
    }
    
    ///////////////////////////////////
    //METHODS
    ///////////////////////////////////
    
    // We need to construct the item array with names, cost, associated survival
    //points and category
    
}
