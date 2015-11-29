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
public class Location implements Serializable{
    
    private Item item;
    private int row;
    private int col;
    public boolean visited;
    private String nameOfLocation;
    
    public Location() {
        
    }

    public static enum LocationName {
        HOUSE("House"),
        MEGA_STORE("Mega Store"), 
        CAMPING_STORE("Camping Store"),
        DELIVERY_CENTER("Delivery Center"); 
        
        private final String positionName;
        private String getName;
        
        LocationName(String name) {
            this.positionName = name;
        }
        public String getName() {
        return this.positionName;
        }
        
        @Override
        public String toString() {
            return this.getName;
        }
    }
    
    

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    public String getNameOfLocation() {
        return nameOfLocation;
    }

    public void setNameOfLocation(String nameOfLocation) {
        this.nameOfLocation = nameOfLocation;
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.item);
        hash = 29 * hash + this.row;
        hash = 29 * hash + this.col;
        hash = 29 * hash + (this.visited ? 1 : 0);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        if (this.col != other.col) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "item=" + item + ", row=" + row + ", col=" + col + ", visited=" + visited + '}';
    }
    
    //////////////////////////////////////////
    //METHODS
    //////////////////////////////////////////
    
    
    public boolean HasVisited(){
        return visited != false;
    }
    
    // this will be used when player enters house rooms
     public boolean HasItem(){
        return item != null;
    } 

    public void visited(boolean b) {
        System.out.println();
        }
    public void setLocations(LocationName locationName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
