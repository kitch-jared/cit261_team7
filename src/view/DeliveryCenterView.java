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
public class DeliveryCenterView {
    
    public DeliveryCenterView() {
        
    }
    
    public void display() {
        
        System.out.println("Please select an option:");
        System.out.println("C - Choose a Delivery");
        System.out.println("M - Make a Delivery");
        System.out.println("V - View Deliveries");
        System.out.println("X - Return to Game Menu");
        
    }
    
    public char getInput() {
        
        Scanner in = new Scanner(System.in);
        
        String input = "";
        char rtn = 0;
        
        while(input.length() < 1){
            display();
            input = in.nextLine();
            
            if(input.length() < 1){
                System.out.println("Please select an option");
                display();
            } else {
            
                rtn = input.toUpperCase().charAt(0);

                 if(rtn != 'C' && rtn != 'M' && rtn != 'V' && rtn != 'X') {
                    System.out.println("Please select a valid input.");
                    input = "";
                }
            
            }
        
        }
     return rtn;

    }
    
    public void doAction(char input) {
        
         switch(input) {
            case 'C' :
                ChooseDelivery();
                break;
            case 'M' :
                MakeDelivery();
                break;
            case 'V' :
                ViewDeliveries();
                break;
            case 'X' :
                ReturnGameMenu();
                break;
            default:
                System.out.println("ERROR ON INPUT");
        }
    
    }


    private void ChooseDelivery() {
        System.out.println("NOT IMPLEMENTED YET"); 
    }
    
    private void MakeDelivery() {
        System.out.println("NOT IMPLEMENTED YET"); 
    }

    private void ViewDeliveries() {
        System.out.println("NOT IMPLEMENTED YET");  
    }

    private void ReturnGameMenu() {
        System.out.println("NOT IMPLEMENTED YET"); 
    }   
}
