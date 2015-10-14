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

//Should I list out all the items here???

class Item implements Serializable{
    
    private String name;
    private int survivalPoints;
    private String categoryName;

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSurvivalPoints() {
        return survivalPoints;
    }

    public void setSurvivalPoints(int survivalPoints) {
        this.survivalPoints = survivalPoints;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }  
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + this.survivalPoints;
        hash = 29 * hash + Objects.hashCode(this.categoryName);
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.survivalPoints != other.survivalPoints) {
            return false;
        }
        if (!Objects.equals(this.categoryName, other.categoryName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", survivalPoints=" + survivalPoints + ", categoryName=" + categoryName + '}';
    }
    
    ///////////////////////////////////
    //METHODS
    ///////////////////////////////////
    
       
    
}
