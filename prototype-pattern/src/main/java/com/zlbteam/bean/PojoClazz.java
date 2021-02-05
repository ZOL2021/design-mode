package com.zlbteam.bean;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhoulibin
 */
@Slf4j
public class PojoClazz extends TempClazz{

    public PojoClazz(){
        type = "PojoClazz";
    }

    /**
     * 展示
     */
    @Override
    void show() {
        log.info("Inside PojoClazz::show() method.");
    }
}
