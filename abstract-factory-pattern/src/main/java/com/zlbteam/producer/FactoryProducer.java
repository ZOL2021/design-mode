package com.zlbteam.producer;

import com.zlbteam.factory.AbstractFactory;
import com.zlbteam.factory.ShowFactory;
import com.zlbteam.factory.SpeakFactory;

/**
 * @author zhoulibin
 */
public class FactoryProducer {

    private FactoryProducer() {}
    /**
     * 获取 工程实体
     * @param type 类型
     * @return 实体
     */
    public static AbstractFactory getFactory(String type) {
        switch (type) {
            case "1": return new ShowFactory();
            case "2": return new SpeakFactory();
            default: return null;
        }
    }
}
