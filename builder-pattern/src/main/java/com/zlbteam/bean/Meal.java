package com.zlbteam.bean;

import com.zlbteam.service.Item;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoulibin
 */
@Slf4j
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            log.info(
                    "Item : " + item.name()
                    + ", Packing : " + item.packing().pack()
                    + ", Price : " + item.price()
            );
        }
    }
}
