/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Location;

/**
 *
 * @author maloriegomm
 */
public class MapControl {
    
   public void move(Location l){
    
       System.out.println(l);
     
    }
    /* How do I call the visited parameter from the location class? I keep getting
       errors that the data types are incompatible. 
   */
   /*public boolean validLocation(Location visited) {
   
       if (visited){
            System.out.println("You have already visited this location.");
            return location;
        }
        else {
            System.out.println("Invalid entry. Please enter new coordinates.");
            return location;
        }
   }*/
    public int calcTimeRemaining(int timeRemaining, int timeToDeduct, int deliveryTime) {
        
        if(timeRemaining < 0) {
		return -1;
        }
                
	if((deliveryTime + timeToDeduct > timeRemaining) || (deliveryTime + timeToDeduct < 0)){
		return -1;
        }
        
	timeRemaining = timeRemaining - (deliveryTime + timeToDeduct);
        
	return timeRemaining;
    }
    
    public int calcTimeToDeduct(int timeRemaining) {
    
        int calcTimeToDeduct = timeRemaining - 1;
            
            return calcTimeToDeduct;
        }
    }

  