/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


/**
 *
 */
public class HouseView extends View{
    
    public HouseView() {
        super("K - Enter Kitchen\n"
                + "L - Enter Living Room\n"
                + "G - Enter Garage\n"
                + "B - Enter Bed Room\n"
                + "A  - Enter Basement\n"
                + "X - Return to Game Menu\n");
    }

    @Override   
    public boolean doAction(char input) {
        
         switch(input) {
            case 'K' :
                EnterKitchen();
                break;
            case 'L' :
                EnterLivingRoom();
                break;
            case 'G' :
                EnterGarage();
                break;
            case 'B' :
                EnterBedroom();
                break;
            case 'A' :
                EnterBasement();
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please select a valid input.");
                break;
            }
            return true;
    }


    private void EnterKitchen() {
       System.out.println("NOT IMPLEMENTED YET"); 
                
    }
    
    private void EnterLivingRoom() {
        System.out.println("NOT IMPLEMENTED YET");     
    }

    private void EnterGarage() {
        System.out.println("NOT IMPLEMENTED YET");     
    }

    private void EnterBedroom() {
        System.out.println("NOT IMPLEMENTED YET");     
    }

    private void EnterBasement() {
        System.out.println("NOT IMPLEMENTED YET");     
    }
}
    

