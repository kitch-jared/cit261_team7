/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Maxine
 */
public class StoreView extends View {
    
    public StoreView() {
        super("Select a store: \n"
                + "M - Mega Store\n"
                + "C - Camping Store"
                + "X - Return to Game Menu\n");
    }
    
    @Override
    public boolean doAction(char input) {
        
        switch (input){
        
            case 'M':
                megaStoreAisles();
                break;
            case 'C':
                campingStoreAisles();
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please select a valid input");
                break;
        }
        return true;
        
    }
    private void megaStoreAisles() {
        StoreMegaAislesView megaAislesMenu = new StoreMegaAislesView();
        megaAislesMenu.display();
        }

    private void campingStoreAisles() {
        StoreCampingAislesView campingAislesMenu = new StoreCampingAislesView();
        campingAislesMenu.display();
    }
}
