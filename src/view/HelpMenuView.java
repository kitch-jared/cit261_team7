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
            case 'X':
                return false;
            }
            return true;
        }
     
    
     private void GameGoal() {
        System.out.println("The goal of the game is to.../n"
                             + ""); 
    }
    
    private void ViewInventory() {
        System.out.println("To view your inventory, you will need to go to the Game Menu/n"
                            + "and select 'I' for veiw inventory/n"
                            + ""); 
    }

    private void MoveLocations() {
        System.out.println("To move locations on the map, determine where you want to move/n"
                            + " to and then go to the Game Menu and /n"
                            + "select 'L' for Move to a New Location./n"
                             + "");  
    }

    private void MakeMoney() {
        System.out.println("To make money you will need to go to the delivery center and accept a delivery/n"
                            + "and then make that delivery in the delivery center./n"
                             + ""); 
    }

    private void BuySupplies() {
        System.out.println("To purchase supplies you will need to go to the Mega store and/or the camping store./n"
                            + "You will be able to select which aisle you want to go down/n"
                            + "and then purchase those items by selecting them in the store aisles./n"
                            + "");   
    }
}
