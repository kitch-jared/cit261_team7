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
public class HelpMenuView extends View{
    
    public HelpMenuView() {
        super("G - What is the goal of the game?\n"
                + "V - view inventory and resources\n"
                + "M - How to move locations\n"
                + "A - How to make money\n"
                + "B - How to buy supplies\n"
                + "X - Close Help Menu\n");
    }

    /**
     * This just calls a method based on the input
     *
     * @param input
     */
    @Override
     public boolean doAction(char input) {
        
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
          return true;
    }

    
     private void GameGoal() {
        System.out.println("The goal of the game is to..."); 
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
    
  
//    public char getInput() {
//        
//        Scanner in = new Scanner(System.in);
//        
//        String input = "";
//        char rtn = 0;
//        
//        while(input.length() < 1){
//            display();
//            input = in.nextLine();
//            
//            if(input.length() < 1){
//                System.out.println("Pleses select an option");
//                display();
//            } else {
//            
//                rtn = input.toUpperCase().charAt(0);
//
//                 if(rtn != 'G' && rtn != 'V' && rtn != 'M' && rtn != 'A' && rtn != 'B' && rtn != 'X') {
//                    System.out.println("Please select a valid input.");
//                    input = "";
//                }
//            
//            }
//        
//        }
//     return rtn;
//
//    }
}
