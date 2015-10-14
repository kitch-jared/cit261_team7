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
public class Deliveries implements Serializable {
    
    private boolean makeDeliveries;
    private int numberOfDeliveries;
    private double deliveryTime;
    private double deliveryMoney;

    public Deliveries() {
    }
    
    public boolean isMakeDeliveries() {
        return makeDeliveries;
    }

    public void setMakeDeliveries(boolean makeDeliveries) {
        this.makeDeliveries = makeDeliveries;
    }

    public int getNumberOfDeliveries() {
        return numberOfDeliveries;
    }

    public void setNumberOfDeliveries(int numberOfDeliveries) {
        this.numberOfDeliveries = numberOfDeliveries;
    }

    public float getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public double getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(double deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public double getDeliveryMoney() {
        return deliveryMoney;
    }

    public void setDeliveryMoney(double deliveryMoney) {
        this.deliveryMoney = deliveryMoney;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + (this.makeDeliveries ? 1 : 0);
        hash = 73 * hash + this.numberOfDeliveries;
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.deliveryTime) ^ (Double.doubleToLongBits(this.deliveryTime) >>> 32));
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.deliveryMoney) ^ (Double.doubleToLongBits(this.deliveryMoney) >>> 32));
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
        final Deliveries other = (Deliveries) obj;
        if (this.makeDeliveries != other.makeDeliveries) {
            return false;
        }
        if (this.numberOfDeliveries != other.numberOfDeliveries) {
            return false;
        }
        if (Double.doubleToLongBits(this.deliveryTime) != Double.doubleToLongBits(other.deliveryTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.deliveryMoney) != Double.doubleToLongBits(other.deliveryMoney)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Deliveries{" + "makeDeliveries=" + makeDeliveries + ", numberOfDeliveries=" + numberOfDeliveries + ", deliveryTime=" + deliveryTime + ", deliveryMoney=" + deliveryMoney + '}';
    }

    
    
    ///////////////////////////////////////////////
    // METHODS
    //////////////////////////////////////////////
    
    /* Implement methods to determine number of deliveries and calculate new time
       after delivery is made */
    
    public boolean hasDeliveries() {
        if (makeDeliveries == true) {
            System.out.println("Yes, you have deliveries.");
        } else {
            System.out.println("No deliveries.");
        }
        return false;
        }
    
    // Need to calculate remaining time  
 }
            
        

    
