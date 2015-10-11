/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author maloriegomm
 */
public class HouseMap implements Serializable{
    private static final int numRows = 2;
    private static final int numColumns = 3;
    private Location[][] rooms;

    public HouseMap(Location[][] rooms) {
        this.rooms = rooms;
    }

    public Location[][] getRooms() {
        return rooms;
    }

    public void setRooms(Location[][] rooms) {
        this.rooms = rooms;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Arrays.deepHashCode(this.rooms);
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
        final HouseMap other = (HouseMap) obj;
        if (!Arrays.deepEquals(this.rooms, other.rooms)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HouseMap{" + "rooms=" + rooms + '}';
    }
    
    
    ////////////////////////////////
    //METHODS
    ///////////////////////////////
    
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
