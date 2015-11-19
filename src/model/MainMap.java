/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Maxine
 */
public class MainMap implements Serializable {
    
    private static final int NUM_ROWS = 3;
    private static final int NUM_COLS = 4;
    private Location[][] matrix;

    public MainMap() {
        matrix = new Location[NUM_ROWS][NUM_COLS];
    }

    public MainMap(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Location[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Location[][] matrix) {
        this.matrix = matrix;
    }

    ////////////////////////////////////////
    // METHODS
    ///////////////////////////////////////
    
//    public String toString() {
//        String rtn = "";
//        
//        for(int row = 0; row < NUM_ROWS; row++) {
//           for(int col = 0; col < NUM_COLS; col++) {
//               if (matrix[row][col] == null) {
//                   System.out.println("x ");
//               }
//           }
//        }
//        return null;
//    }
    
    
    //this is just me trying to get something to show up it's just 12 "x " when you run the 
    //Hurricane_game file
    public String toString() {
        String rtn = "";
        
        for(int row = 0; row < NUM_ROWS; row++) {
            for(int col = 0; col < NUM_COLS; col++) {
                if(matrix[row][col] == null) {
                    rtn += "x  ";
                }
                else{
                   rtn += "x  "; 
                }
            }
            rtn += "\n";
        }
        return rtn + "this worked";
    }
    
    
    public void initialize() {
      
        for(int row = 0; row < NUM_ROWS; row++) {
            for(int col = 0; col < NUM_COLS; col++) {
                Location location = new Location();
                location.setCol(col);
                location.setRow(row);
                
                matrix[row][col] = location;
            }
        }
        
    }
    
}