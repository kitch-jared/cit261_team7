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
    private Names[] names;
    
   public void move(Location l){
    
       System.out.println(l);
     
    }
    public static MainMap createMap() {
        
        MainMap map = new MainMap(3, 4);
        //Scene[] scenes = createScenes();
        GameControl gameControl = new GameControl();
        gameControl.assignNamesToLocations(map, names);
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
    /*public Map() {
        
    }
    //public MainMap (int row, int col) {
    
        
    }*/
}

  