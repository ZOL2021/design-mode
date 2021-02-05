package com.zlbteam.factory;

import com.zlbteam.service.ShowService;
import com.zlbteam.service.SpeakService;
import lombok.Data;

/**
 * @author zhoulibin
 */
@Data
public abstract class AbstractFactory {

    /**
     * 属性
     */
    private String prop = "abstract";

    /**
     * 获取show 实例
     * @param type 类型
     * @return 实例
     */
    public abstract ShowService getShow(String type);

    /**
     * 获取speak 实例
     * @param type 类型
     * @return 实例
     */
    public abstract SpeakService getSpeak(String type);
}
