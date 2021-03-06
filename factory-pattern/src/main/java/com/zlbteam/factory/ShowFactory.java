package com.zlbteam.factory;

import com.zlbteam.service.ShowService;
import com.zlbteam.service.impl.ShowOneImpl;
import com.zlbteam.service.impl.ShowThreeImpl;
import com.zlbteam.service.impl.ShowTwoImpl;
import org.springframework.stereotype.Component;

/**
 * @author zhoulibin
 */
@Component
public class ShowFactory {
    /**
     * 获取实现类对象
     * @param type 实现类型
     * @return 实例
     */
    public ShowService getShow(String type){
        switch (type) {
            case "1": return new ShowOneImpl();
            case "2": return new ShowTwoImpl();
            case "3": return new ShowThreeImpl();
            default: return null;
        }
    }
}
