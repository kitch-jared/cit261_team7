/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Location;
import model.MainMap;
import model.Player;

/**
 *
 * @author maloriegomm
 */
public class MapControl {

    private int row;
    private int col;
    private Location[][] locations;
    
    public static MainMap createMap(Player player) {
        
        MainMap map = new MainMap(3, 4);
        
        map.initialize();
        
        player.setLocation(map.getLocations()[1][1]);
        
        return map;
        
        Location location = createLocation();
        
        //Scene[] scenes = createScenes();
        GameControl gameControl = new GameControl();
        gameControl.assignNamesToLocations(map);
        return map;
    }
    
    public void move(Location l){
    
       System.out.println(l);
     
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
    
    private static Location createLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /*public Map() {
        
    }
    //public MainMap (int row, int col) {
    
        
    }*/
}

  