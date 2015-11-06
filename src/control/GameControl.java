/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Scanner;
import model.Player;

/**
 *
 * @author maloriegomm
 */
public class GameControl {
    
    public void createNewGame(Player name) {
        
        Scanner in = new Scanner(System.in);
        
        String input ="";
        
        char rtn = 0;
        
        rtn = input.toUpperCase().charAt(0);
        
        if((rtn !='y') && (rtn != 'Y') && (rtn != 'n') && (rtn !='N')){
            System.out.println(name + ", you entered" + rtn);
            System.out.println("Please Y for yes or N for no");
        }
        else {
            System.out.println(name + "Welcome to your game. The clock starts now!");
            
            
        }
    }
    
    public void initializeMap() {
    
    }
    
    public void saveGame() {
    
    }
    
    public void retrieveGame() {
    
    }
    
    public Player createNewPlayer() {
        
        Player name = new Player();
        
        return name;
    
    }
    
}
