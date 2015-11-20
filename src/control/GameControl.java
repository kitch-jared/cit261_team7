/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Scanner;
import model.Game;
import model.InventoryList;
import model.MainMap;
import model.Player;
import view.MainMenuView;
import view.WelcomeView;

/**
 *
 * @author maloriegomm
 */
public class GameControl {
    
    public void createNewGame() {
        
        Game game = new Game();// create new game
        Player player = new Player();// create new player
        
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
    
    public void createItemsList() {
            
    }    
}
