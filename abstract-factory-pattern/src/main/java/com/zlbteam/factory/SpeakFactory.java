package com.zlbteam.factory;

import com.zlbteam.service.ShowService;
import com.zlbteam.service.SpeakService;
import com.zlbteam.service.impl.*;
import org.springframework.stereotype.Component;

/**
 * @author zhoulibin
 */
@Component
public class SpeakFactory extends AbstractFactory{
    /**
     * 获取实现类对象
     * @param type 实现类型
     * @return 实例
     */
    @Override
    public ShowService getShow(String type){
       return null;
    }

    /**
     * 获取speak 实例
     *
     * @param type 类型
     * @return 实例
     */
    @Override
    public SpeakService getSpeak(String type) {
        switch (type) {
            case "1": return new SpeakOneImpl();
            case "2": return new SpeakTwoImpl();
            case "3": return new SpeakThreeImpl();
            default: return null;
        }
    }
}
