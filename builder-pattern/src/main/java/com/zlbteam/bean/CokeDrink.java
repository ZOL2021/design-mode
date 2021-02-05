package com.zlbteam.bean;

import com.zlbteam.service.impl.DrinkImpl;

/**
 * @author zhoulibin
 */
public class CokeDrink extends DrinkImpl {
    /**
     * 名称
     *
     * @return 名称
     */
    @Override
    public String name() {
        return "Coke Drink";
    }

    /**
     * 价格
     *
     * @return 价格
     */
    @Override
    public float price() {
        return 0.2f;
    }
}
