package com.zlbteam.controller;

import com.zlbteam.bean.SingleBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author zhoulibin
 */
@Slf4j
@RestController
public class SingleController {
    /**
     * 单例模式
     */
    @RequestMapping("/single/{id}")
    public String single(@PathVariable String id) {
        log.info("id: " + id);
        SingleBean singleBean = SingleBean.getInstance();
        singleBean.show(id);
        return "single";
    }
}
