/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author maloriegomm
 */
public class HelpMenuView {
    
   public HelpMenuView() {
        
    }
    
    public void displayHelpMenu() {
        
        System.out.println("Please select an option:");
        System.out.println("G - What is the goal of the game?");
        System.out.println("V - view inventory and resources");
        System.out.println("M - How to move locations");
        System.out.println("A - How to make money");
        System.out.println("B - How to buy supplies");
        System.out.println("X - Close Help Menu");
        
    }
    
    public char getInput() {
        
        Scanner in = new Scanner(System.in);
        
        String input = "";
        char rtn = 0;
        
        while(input.length() < 1){
            displayHelpMenu();
            input = in.nextLine();
            
            if(input.length() < 1){
                System.out.println("Pleses select an option");
                displayHelpMenu();
            } else {
            
                rtn = input.toUpperCase().charAt(0);

                 if(rtn != 'G' && rtn != 'V' && rtn != 'M' && rtn != 'A' && rtn != 'B' && rtn != 'X') {
                    System.out.println("Please select a valid input.");
                    input = "";
                }
            
            }
        
        }
     return rtn;

    }
    
    public void doACtion(char input) {
        
         switch(input) {
            case 'G' :
                GameGoal();
                break;
            case 'V' :
                ViewInventory();
                break;
            case 'M' :
                MoveLocations();
                break;
            case 'A' :
                MakeMoney();
                break;
            case 'B' :
                BuySupplies();
                break;
            case 'X' :
                ExitHelpMenu();
                break;
            default:
                System.out.println("ERROR ON INPUT");
        }
    
    }


    private void GameGoal() {
        System.out.println("NOT IMPLEMENTED YET"); 
    }
    
    private void ViewInventory() {
        System.out.println("NOT IMPLEMENTED YET"); 
    }

    private void MoveLocations() {
        System.out.println("NOT IMPLEMENTED YET");  
    }

    private void MakeMoney() {
        System.out.println("NOT IMPLEMENTED YET"); 
    }

    private void BuySupplies() {
        System.out.println("NOT IMPLEMENTED YET");   
    }

    private void ExitHelpMenu() {
        System.out.println("NOT IMPLEMENTED YET");
    }
}
