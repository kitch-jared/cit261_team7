/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Maxine
 */
public class MegaAisles implements Serializable {
    
    private Item item;
    private Item itemCost;

    public MegaAisles() {
    }
    
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItemCost() {
        return itemCost;
    }

    public void setItemCost(Item itemCost) {
        this.itemCost = itemCost;
    }

    @Override
    public String toString() {
        return "MegaAisles{item=" + item + ", itemCost=" + itemCost + '}';
    }
           
}
