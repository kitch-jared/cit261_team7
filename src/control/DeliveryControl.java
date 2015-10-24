/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author maloriegomm
 */
public class DeliveryControl {
    
    public void checkDeliveries(boolean makeDeliveries, int numberOfDeliveries){
    
        if (!makeDeliveries) {
                System.out.println("No Deliveries");
        }
        
	else {
            if (makeDeliveries) {
		for (int d = 10; d <= 10; d--) // need to rewrite this code; not working
                    numberOfDeliveries = 10 - d;

                System.out.println("Yes, you have " + numberOfDeliveries); 
            }
        }
    }
    
    public int calcNewTimeAfterDelivery(boolean makeDeliveries, int timeRemaining){
        
        if (!makeDeliveries) {
		return timeRemaining;
        }
        else {
            if (makeDeliveries) {
                int deliveryTime = timeRemaining - 2;
                return deliveryTime;
            }
        }
        int deliveryTime = timeRemaining - 2;
               
	if (deliveryTime < 0) {
		return - 1;
        }
	
	return deliveryTime;


    }
}
