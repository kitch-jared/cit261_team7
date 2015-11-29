/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Scanner;
import model.Game;
import model.InventoryList;
import model.Item;
import model.Location;
import model.Location.LocationName;
import model.MainMap;
import model.Player;
import view.MainMenuView;
import view.WelcomeView;

/**
 *
 * @author maloriegomm
 */
public class GameControl {
    
    public static void createNewGame(Player player) {
        
        Game game = new Game();// create new game
        
        WelcomeView welcomeView = new WelcomeView();
        welcomeView.displayBanner();
        
        player.setName(welcomeView.getPlayerName());// set players name in player class
        
        welcomeView.displayPlayerNameBanner(player);
        game.setPlayer(player);// save player in game
   
        MainMap map = MapControl.createMap();
        game.setMap(map);
        }
    
    public void initializeMap() {
        
        
    }
    
    public void saveGame() {
    
    }
    
    public void retrieveGame() {
    
    }
    // Come back and figure out list. Need to create in items.
    /*public static Item[] createGameItemsList() {
        Item[] gameItemsList = new Item[50];
        
        Item tuna = new Item();
        tuna.setDescription("Tuna");
    
    }*/
    
    public static InventoryList[] createItemsCurrent() {
        System.out.println("***Items the player currently has***");
        return null;
    }
    
    public static InventoryList[] createItemsNeeded() {
        System.out.println("***Items the player still needs***");
        return null;
    }
    
    
    
    
    /*public enum LocationNames{ // delete, it's in location
        house,
        mega_store, 
        camping_store,
        delivery_center; 
    }*/
    
    
    public void assignNamesToLocations(MainMap map, Location locationName) {
      Location[][] locations = map.getLocations();
      locations[1][1].setLocations(LocationName.HOUSE);      
      locations[2][1].setLocations(LocationName.MEGA_STORE);
      locations[3][4].setLocations(LocationName.CAMPING_STORE);
      locations[1][3].setLocations(LocationName.DELIVERY_CENTER);
    }

    public void createNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
