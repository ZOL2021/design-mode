package com.zlbteam.service;

/**
 * @author zhoulibin
 */
public interface Item {
    /**
     * 名称
     * @return 名称
     */
    String name();

    /**
     * 打包
     * @return 打包
     */
    Packing packing();

    /**
     * 价格
     * @return 价格
     */
    float price();
}
