package com.zlbteam.bean;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhoulibin
 */
@Slf4j
public class SingleBean {

    private static SingleBean instance = new SingleBean();

    private SingleBean(){}

    public static SingleBean getInstance(){
        return instance;
    }

    /**
     *
     * 展示信息
     * @param message
     */
    public void show(String message){
        log.info("show: " + message);
    }
}
