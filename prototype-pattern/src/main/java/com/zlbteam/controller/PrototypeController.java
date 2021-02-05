package com.zlbteam.controller;

import com.zlbteam.bean.TempClazz;
import com.zlbteam.cache.PojoCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoulibin
 */
@Slf4j
@RestController
public class PrototypeController {

    @RequestMapping("/prototype/{id}")
    public String prototype(@PathVariable String id){
        PojoCache.loadCache();
        TempClazz clazz = PojoCache.getTemp("1");
        log.info("prototype: " + clazz.getType());
        return "prototype";
    }
}
