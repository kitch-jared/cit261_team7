/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author maloriegomm
 */
public class Game implements Serializable {

    private Player player;
    private int survivalPoints;
    public int timeRemaining;
    private int numberOfPointsEarned;
    private String itemsList[];//can be an Enum or Array because it doesn't need to grow or shrink
    public int neededSurvivalPoints;

    public Game() {
        
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    public int getSurvivalPoints() {
        return survivalPoints;
    }

    public void setSurvivalPoints(int survivalPoints) {
        this.survivalPoints = survivalPoints;
    }


    public int getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(int timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public int getNumberOfPointsEarned() {
        return numberOfPointsEarned;
    }

    public void setNumberOfPointsEarned(int numberOfPointsEarned) {
        this.numberOfPointsEarned = numberOfPointsEarned;
    }

    public String[] getItemsList() {
        return itemsList;
    }

    public void setItemsList(String[] itemsList) {
        this.itemsList = itemsList;
    }

    public int getNeededSurvivalPoints() {
        return neededSurvivalPoints;
    }

    public void setNeededSurvivalPoints(int neededSurvivalPoints) {
        this.neededSurvivalPoints = neededSurvivalPoints;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.survivalPoints;
        hash = 89 * hash + this.timeRemaining;
        hash = 89 * hash + this.numberOfPointsEarned;
        hash = 89 * hash + Arrays.deepHashCode(this.itemsList);
        hash = 89 * hash + this.neededSurvivalPoints;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.survivalPoints != other.survivalPoints) {
            return false;
        }
        if (this.timeRemaining != other.timeRemaining) {
            return false;
        }
        if (this.numberOfPointsEarned != other.numberOfPointsEarned) {
            return false;
        }
        if (!Arrays.deepEquals(this.itemsList, other.itemsList)) {
            return false;
        }
        if (this.neededSurvivalPoints != other.neededSurvivalPoints) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "survivalPoints=" + survivalPoints + ", timeRemaining=" + timeRemaining + ", numberOfPointsEarned=" + numberOfPointsEarned + ", itemsList=" + itemsList + ", neededSurvivalPoints=" + neededSurvivalPoints + '}';
    }
    
  
    ///////////////////////////////////////////////
    // METHODS
    ///////////////////////////////////////////////
    /* Need to set survival points, budget, calculate earned money, remaining time,
     and points earned
     */

    
    
   
}

