/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Maxine
 */
public class MegaAisles implements Serializable {
    
    private SuppliesList item;
    private SuppliesList itemCost;

    public MegaAisles() {
    }
    
    public SuppliesList getItem() {
        return item;
    }

    public void setItem(SuppliesList item) {
        this.item = item;
    }

    public SuppliesList getItemCost() {
        return itemCost;
    }

    public void setItemCost(SuppliesList itemCost) {
        this.itemCost = itemCost;
    }

    @Override
    public String toString() {
        return "MegaAisles{item=" + item + ", itemCost=" + itemCost + '}';
    }
           
}
