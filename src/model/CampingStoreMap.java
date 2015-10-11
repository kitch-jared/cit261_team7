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
public class CampingStoreMap implements Serializable{
    
    //The number of rows and col may change
    private static final int numRows = 4;
    private static final int numColumns = 1;
    private Location[][] aisle;
    

    public CampingStoreMap(Location[][] aisle) {
        this.aisle = aisle;
    }

    public Location[][] getMatrix() {
        return aisle;
    }

    public void setMatrix(Location[][] aisle) {
        this.aisle = aisle;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Arrays.deepHashCode(this.aisle);
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
        final CampingStoreMap other = (CampingStoreMap) obj;
        if (!Arrays.deepEquals(this.aisle, other.aisle)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CampingStoreMap{" + "aisle=" + aisle + '}';
    }

    
    
    /////////////////////////////////////
    //METHODS
    /////////////////////////////////////

     public void intialize() {
              
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                Location newLocation = new Location();
                newLocation.setCol(col);
                newLocation.setRow(row);
            }
        }
         
    }
    
}
