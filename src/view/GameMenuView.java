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
              + "A - Money Accounts\n"
              + "P - Survival Points Earned\n");
    }
    public void display() {
        
        System.out.println("Please select an option:");
        System.out.println("M - Map of town");
        System.out.println("S - Supplies list");
        System.out.println("I - Inventory list");
        System.out.println("L - Move to a new location");
        System.out.println("D - Deliver supplies");
        System.out.println("Y - View deliveries");
        System.out.println("V - View what location has");
        System.out.println("A - Money Accounts");
        System.out.println("P - Survival Points Earned");
        System.out.println("T - Time before hurricane");
        System.out.println("H - Help");
        System.out.println("X - Main Menu");
        
    }
    
    public char getInput() {
        
        Scanner in = new Scanner(System.in);
        
        String input = "";
        char rtn = 0;
        
        while(input.length() < 1){
            displayGameMenu();
            input = in.nextLine();
            
            if(input.length() < 1) {
                System.out.println("Pleses select an option");
                displayGameMenu();
            } else {
            
                rtn = input.toUpperCase().charAt(0);

                 if(rtn != 'M' && rtn != 'S' && rtn != 'I' && rtn != 'L' && rtn != 'D'
                         && rtn != 'Y' && rtn != 'V' && rtn != 'A' && rtn != 'P' && 
                         rtn != 'T' && rtn != 'H' && rtn != 'X') {
                    System.out.println("Please select a valid input.");
                    input = "";
                }
            
            }
        
        }
     return rtn;
    }
    
    
    public boolean doAction(char input) {
    
        switch (input) {
            case 'M':
                townMap();
                break;
            case 'S':
                suppliesList();
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
