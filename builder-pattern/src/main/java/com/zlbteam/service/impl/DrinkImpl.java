package com.zlbteam.service.impl;

import com.zlbteam.service.Item;
import com.zlbteam.service.Packing;

/**
 * @author zhoulibin
 */
public abstract class DrinkImpl implements Item {
    /**
     * 打包
     *
     * @return 打包
     */
    @Override
    public Packing packing() {
        return new BottleImpl();
    }
}
