/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Maxine
 */
public class GameMenuView extends View{
    
     public GameMenuView() {
        super("M - Map of town\n"
              + "S - Supplies list\n"
              + "I - Inventory list\n"
              + "L - Move to a new location\n"
              + "Y - View deliveries\n"
              + "V - View what location has\n"
              + "A - Money Accounts\n"
              + "P - Survival Points Earned\n"
              + "T - Time before hurricane\n"
              + "H - Help Menu\n"
              + "MM - Main Menu\n"
                // might not need the exit menu option
              + "X - Exit Game Menu\n");
    }
    
    
    public boolean doAction(char input) {
    
        switch (input) {
            case 'M':
                townMap();
                break;
            case 'I':
                inventoryList();
                break;
            case 'L':
                moveToANewLocation();
                break;
            case 'D':
                deliverSupplies();
                break;
            case 'Y':
                viewDeliveries();
                break;
            case 'V':
                viewLocationItems();
                break;
            case 'A':
                moneyAccount();
            case 'P':
                survivalPointsEarned();
                break;
            case 'T':
                timeRemaining();
                break;
            case 'H':
                helpTips();
                break;
            case 'X':
                return false;
            }
            return true;
        
        }

    private void townMap() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void suppliesList() {
        System.out.println("NOT IMPLEMENTED YET");
        }

    private void inventoryList() {
        System.out.println("NOT IMPLEMENTED YET"); 
    }

    private void moveToANewLocation() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void deliverSupplies() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void viewDeliveries() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void viewLocationItems() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void moneyAccount() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void survivalPointsEarned() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void timeRemaining() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void helpTips() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void mainMenu() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void displayGameMenu() {
        
    }
}
