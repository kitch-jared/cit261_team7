/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Deliveries;

/**
 *
 * @author maloriegomm
 */
public class DeliveryCenterView extends View{
    
    public DeliveryCenterView() {
        super("C - Choose a Delivery\n"
                + "M - Make a Delivery\n"
                + "V - View Deliveries\n"
                + "X - Return to Game Menu\n");
    }

    @Override   
    public boolean doAction(char input) {
        
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
            case 'X':
                return false;
            default:
                System.out.println("Please select a valid input.");
                break;
            }
            return true;
    }


    private void ChooseDelivery() {
        System.out.println("You Selected 'Choose a Delivery'. /n");
        System.out.println("Each delivery will take half an hour off your time./n");
        System.out.println("Which type of delivery would you like to make?");
        
        deliveryOptions();
                
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

    public void deliveryOptions() {
        // create 3 new deliveries instances
        Deliveries deliveryOne = new Deliveries();
        deliveryOne.setType("Name Type");
        
        Deliveries deliveryTwo = new Deliveries();
        deliveryTwo.setType("Name Type");
        
        Deliveries deliveryThree = new Deliveries();
        deliveryThree.setType("Name Type");
        
        System.out.println("Please select the type of delivery you would like to accept");
        System.out.println("A - deliveryOne");
        System.out.println("B - deliveryTwo");
        System.out.println("C - deliveryThree");
        System.out.println("X - Cancel");  
    }
}
