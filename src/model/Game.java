/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author maloriegomm
 */
public class Game implements Serializable {
    
    private int survivalPoints;
    private int budget;
    private int timeRemaining;
    private int numberOfPointsEarned;

    public Game() {
    }
    
    public int getSurvivalPoints() {
        return survivalPoints;
    }

    public void setSurvivalPoints(int survivalPoints) {
        this.survivalPoints = survivalPoints;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(int moneyEarned) {
        this.moneyEarned = moneyEarned;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.survivalPoints;
        hash = 97 * hash + this.budget;
        hash = 97 * hash + this.moneyEarned;
        hash = 97 * hash + this.timeRemaining;
        hash = 97 * hash + this.numberOfPointsEarned;
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
        if (this.budget != other.budget) {
            return false;
        }
        if (this.moneyEarned != other.moneyEarned) {
            return false;
        }
        if (this.timeRemaining != other.timeRemaining) {
            return false;
        }
        if (this.numberOfPointsEarned != other.numberOfPointsEarned) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "survivalPoints=" + survivalPoints + ", budget=" + budget + ", moneyEarned=" + moneyEarned + ", timeRemaining=" + timeRemaining + ", numberOfPointsEarned=" + numberOfPointsEarned + '}';
    }
    
    ///////////////////////////////////////////////
    // METHODS
    ///////////////////////////////////////////////
    
    /* Need to set survival points, budget, calculate earned money, remaining time,
       and points earned
    */
    
}
