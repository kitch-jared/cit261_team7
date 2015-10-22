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
public class MapControl {
    
    public int calc(int timeRemaining, int timeToDeduct, int deliveryTime){
        
        if(timeRemaining < 0){
		return -1;
        }
                
	if(deliveryTime + timeToDeduct > timeRemaining){
		return -1;
        }
        
	timeRemaining = timeRemaining - (deliveryTime + timeToDeduct);
        
	return timeRemaining;
    }
}
