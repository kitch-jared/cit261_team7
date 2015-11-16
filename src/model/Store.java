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

public class Store implements Serializable {
    
    private int row;
    private int column;
    private int aisles;
    private Location[][] matrix;

    public Store() {
    }
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getAisles() {
        return aisles;
    }

    public void setAisles(int aisles) {
        this.aisles = aisles;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.row;
        hash = 71 * hash + this.column;
        hash = 71 * hash + Objects.hashCode(this.aisles);
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
        final Store other = (Store) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (!Objects.equals(this.aisles, other.aisles)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MegaStore{" + "row=" + row + ", column=" + column + ", aisles=" + aisles + '}';
    }
    
    /////////////////////////////////////////
    // METHOD
    ////////////////////////////////////////
    
    public void initialization() {
        row = 1;
        column = 5;
        
        for (int rw = 0; rw < row; rw++) {
            for (int col = 0; col < column; col++); 
            Location aisle = new Location();
            aisle.setCol(column);
            aisle.setRow(row);
        }
    }

}
