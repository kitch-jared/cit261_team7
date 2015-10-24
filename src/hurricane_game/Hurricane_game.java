/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hurricane_game;

import model.CampingAisles;
import model.CampingStore;
import model.Deliveries;
import model.DeliveryCenter;
import model.Game;
import model.HouseRooms;
import model.InventoryList;
import model.Item;
import model.Location;
import model.MainMap;
import model.Player;


/**
 *
 * @author maloriegomm
 */
public class Hurricane_game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Player playerOne = new Player(); 
      
      // This is just a test to see if the Player function works
      playerOne.setName("Fred Flintstone");
      
      String playerInfo = playerOne. toString();
      System.out.println(playerInfo);
      
      MainMap mainMap = new MainMap();
        mainMap.initialize();
        
        System.out.println(mainMap.toString());
      
    }
    
}
