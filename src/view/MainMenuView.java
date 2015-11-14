/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
/**
 *
 * @author maloriegomm
 */
public class MainMenuView extends View {
   
    public MainMenuView() {
         super("Please select an option:\n"
                + "N - Begin new game\n"
                + "L - Load saved game\n"
                + "H - View help menu\n"
                + "E - Exit game\n");
    }
    
    /**
     * This  calls a method based on the input
     *
     * @param input
     */
    
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'N' :
                startNewGame();
                break;
            case 'L' :
                loadGame();
                break;
            case 'H' :
                showHelpMenu();
                break;
            case 'E' :
                return false;
            default:
                System.out.println("Please select a valid input.");
                break;
        }
        
        return true;
    
    }

    private void startNewGame() { // working on this function
      GameMenuView gameMenu = new GameMenuView();
      gameMenu.display();
      
    }

    private void loadGame() {
      System.out.println("NOT IMPLEMENTED YET");

    }

    private void showHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void exitGame() {
      System.out.println("NOT IMPLEMENTED YET");
    }
}
