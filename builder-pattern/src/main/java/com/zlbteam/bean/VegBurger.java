package com.zlbteam.bean;

import com.zlbteam.service.impl.BurgerImpl;

/**
 * @author zhoulibin
 */
public class VegBurger extends BurgerImpl {

    /**
     * 名称
     *
     * @return 名称
     */
    @Override
    public String name() {
        return "Veg Burger";
    }

    /**
     * 价格
     *
     * @return 价格
     */
    @Override
    public float price() {
        return 0.1f;
    }
}
