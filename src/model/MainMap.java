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
public class MainMap implements Serializable{
    
    private int numRows;
    private int numColumns;
    private Location[][] matrix;

    public MainMap() {
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumColumns() {
        return numColumns;
    }

    public void setNumColumns(int numColumns) {
        this.numColumns = numColumns;
    }

    public Location[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Location[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.numRows;
        hash = 29 * hash + this.numColumns;
        hash = 29 * hash + Arrays.deepHashCode(this.matrix);
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
        final MainMap other = (MainMap) obj;
        if (this.numRows != other.numRows) {
            return false;
        }
        if (this.numColumns != other.numColumns) {
            return false;
        }
        if (!Arrays.deepEquals(this.matrix, other.matrix)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MainMap{" + "numRows=" + numRows + ", numColumns=" + numColumns + ", matrix=" + matrix + '}';
    }
    
    
    ////////////////////////////////////////////
    // METHOD
    ///////////////////////////////////////////
    
    public void intialize() {
        numRows = 3;
        numColumns = 4;
        
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                Location newLocation = Location();
                newLocation.setCol(col);
                newLocation.setRow(row);
            }
        }
         
    }
  
}

