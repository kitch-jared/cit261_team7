/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 * @author Maxine
 */
public class MainMap implements Serializable {
    
    private int NUM_ROWS = 3;
    private int NUM_COLS = 4;
    private Location[][] locations;

    public MainMap() {
//        locations = new Location[NUM_ROWS][NUM_COLS];
    }

    public MainMap(int NUM_ROWS, int NUM_COLS) {
        
        if (NUM_ROWS < 1 || NUM_COLS < 1) {
            System.out.println("The number of rows and columns must be greater than 0");
            return;
        }
     
        this.NUM_ROWS = NUM_ROWS;
        this.NUM_COLS = NUM_COLS;
        
        this.locations = new Location[NUM_ROWS][NUM_COLS];
        
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                Location location  = new Location();
                location.setCol(NUM_COLS);
                location.setRow(NUM_ROWS);
                location.setVisited(false);
                
                locations[NUM_ROWS][NUM_COLS] = location;
            }
        }
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    ////////////////////////////////////////
    // METHODS
    ///////////////////////////////////////
    
//    public String toString() {
//        String rtn = "";
//        
//        for(int row = 0; row < NUM_ROWS; row++) {
//           for(int col = 0; col < NUM_COLS; col++) {
//               if (locations[row][col] == null) {
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
                if(locations[row][col] == null) {
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
    
    
//    public void initialize() {
//      
//        for(int row = 0; row < NUM_ROWS; row++) {
//            for(int col = 0; col < NUM_COLS; col++) {
//                Location locations = new Location();
//                locations.setCol(col);
//                locations.setRow(row);
//                
//                locations[row][col] = locations;
//            }
//        }
//        
//    }
    
}