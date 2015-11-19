/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import model.Game;
import model.MainMap;
import model.Player;

/**
 *
 * @author maloriegomm
 */
public class MainMenuView extends View {
   
    public MainMenuView() {
         super("Please select an option:\n"
                + "N - Begin new game\n"
                + "L - Load saved game\n"
                + "H - View help menu\n"
                + "X - Exit game\n");
    }
    
    /**
     * This  calls a method based on the input
     * @param input
     * @return 
     */
    
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'N' :
                startNewGame();
                break;
            case 'L' :
                loadGame();
                break;
            case 'H' :
                showHelpMenu();
                break;
            case 'X' :
                return false;
            default:
                System.out.println("Please select a valid input.");
                break;
        }
        
        return true;
    
    }

    public void startNewGame() { 
        
        Game game = new Game();// create new game
        Player player = new Player();// create new player
        
        WelcomeView welcomeView = new WelcomeView();
        welcomeView.displayBanner();
        
        player.setName(welcomeView.getPlayerName());// set players name in player class
        
        welcomeView.displayPlayerNameBanner(player);
        game.setPlayer(player);// save player in game
        
        
      GameMenuView gameMenu = new GameMenuView();
      gameMenu.display();
      
    }

    private void loadGame() {
      System.out.println("NOT IMPLEMENTED YET");

    }

    private void showHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
}
