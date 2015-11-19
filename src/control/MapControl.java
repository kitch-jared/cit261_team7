/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Location;
import model.MainMap;

/**
 *
 * @author maloriegomm
 */
public class MapControl {
    private int row;
    private int col;
    private Location[][] locations;
    
   public void move(Location l){
    
       System.out.println(l);
     
    }
    private static MainMap createMap() {
        
        MainMap map = new MainMap(3, 4);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
        
    }
   
    public int calcTimeRemaining(int timeRemaining, int timeToDeduct, int deliveryTime) {
        
        if(timeRemaining < 0) {
		return -1;
        }
                
	if((deliveryTime + timeToDeduct > timeRemaining) || (deliveryTime + timeToDeduct < 0)){
		return -1;
        }
        
	timeRemaining = timeRemaining - (deliveryTime + timeToDeduct);
        
	return timeRemaining;
    }
    
    public int calcTimeToDeduct(int timeRemaining) {
    
        int calcTimeToDeduct = timeRemaining - 1;
            
            return calcTimeToDeduct;
        }
    public Map() {
        
    }
    public MainMap (int row, int col) {
    
        if (row < 1 || col < 1) {
            System.out.println("The number of rows and columns must be greater than 0");
            return;
        }
        this.row = row;
        this.col = col;
        
        this.locations = new Location[row][col];
        
        for (int r = 0; r < row; row++) {
            Location location  = new Location();
            location.setCol(col);
            location.setRow(row);
            location.visited(false);
            
            locations[row][col] = location;
        } 
    }   
}

  