package com.zlbteam.controller;

import com.zlbteam.factory.ShowFactory;
import com.zlbteam.service.ShowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoulibin
 */
@Slf4j
@RestController
public class FactoryController {

    @Autowired
    ShowFactory showFactory;

    @RequestMapping("/show/{type}")
    public String test(@PathVariable String type){
        ShowService show = showFactory.getShow(type);
        if (!ObjectUtils.isEmpty(show)){
            show.show();
        }
        log.info("null");
        return "show";
    }

}
