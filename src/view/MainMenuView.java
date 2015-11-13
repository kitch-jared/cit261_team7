/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
//import control.GameControl;
//import model.Player;
//import view.GameMenuView;
/**
 *
 * @author maloriegomm
 */
public class MainMenuView extends View {
   
    public MainMenuView() {
        
    }
    
    /**
     *
     */
    public void display() {
        
        System.out.println("Please select an option:");
        System.out.println("N - Begin new game");
        System.out.println("L - Load saved game");
        System.out.println("H - View help menu");
        System.out.println("E - Exit game");
        char in = getInput();
        doAction(in);
        
    }
    
    public char getInput() {
        
        Scanner in = new Scanner(System.in);
        
        String input = "";
        char rtn = 0;
        
        while(input.length() < 1){
//            displayMenu();
            input = in.nextLine();
            
            if(input.length() < 1){
                System.out.println("Please select an option");
//                displayMenu();
            } else {
            
                rtn = input.toUpperCase().charAt(0);

                 if(rtn != 'N' && rtn != 'L' && rtn != 'H' && rtn != 'E') {
                    System.out.println("Please select a valid input.");
                    input = "";
                }
            
            }
        
        }
     return rtn;

    }
    
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
            case 'E' :
                return false;
            default:
                System.out.println("Please select a valid input.");
                display();
                break;
        }
        
        return true;
    
    }

    private void startNewGame() { // working on this function
      
      GameMenuView gameMenu = new GameMenuView();
      gameMenu.display();
      
    }

    private void loadGame() {
      System.out.println("NOT IMPLEMENTED YET");
      display();

    }

    private void showHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void exitGame() {
      System.out.println("NOT IMPLEMENTED YET");
    }
}
