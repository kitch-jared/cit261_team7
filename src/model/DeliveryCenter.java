/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author maloriegomm
 */
public class DeliveryCenter implements Serializable {
    
    private String deliveryType;
    private boolean deliveryStatus;

    public DeliveryCenter() {
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public boolean isDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(boolean deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.deliveryType);
        hash = 67 * hash + (this.deliveryStatus ? 1 : 0);
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
        final DeliveryCenter other = (DeliveryCenter) obj;
        if (!Objects.equals(this.deliveryType, other.deliveryType)) {
            return false;
        }
        if (this.deliveryStatus != other.deliveryStatus) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DeliveryCenter{" + "deliveryType=" + deliveryType + ", deliveryStatus=" + deliveryStatus + '}';
    }
    
    ////////////////////////////////////
    // METHODS
    ///////////////////////////////////
    
    // Need to implement code to show different deliveryType options
    
    public String type() {
        System.out.println("W = Deliver water - earn $5 for every gallon delivered");
        System.out.println("N = Deliver supplies to nursing home - earn $10");
        System.out.println("P = Deliver supplies to the prison - earn $10");
        return null;
    }
    
    /* I'm trying to say if hasDelivery is false, then print "No deliveries."
       Otherwise, return "Yes, you have deliveries." This is the rest of the code
       I was trying to implement: else {
            System.out.println("You have deliveries."); */
    
    public void hasDelivered() {
        if (deliveryStatus == true)
            System.out.println("Yes, delivery was made.");
        } 
        /*else {
            System.out.println("No delivery was made.");
        }*/
    
    
}
