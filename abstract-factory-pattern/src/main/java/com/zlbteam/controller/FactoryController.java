package com.zlbteam.controller;

import com.zlbteam.factory.AbstractFactory;
import com.zlbteam.producer.FactoryProducer;
import com.zlbteam.service.ShowService;
import com.zlbteam.service.SpeakService;
import lombok.extern.slf4j.Slf4j;
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

    @RequestMapping("/fact/{type}")
    public String fact(@PathVariable String type){
        AbstractFactory showFactory = FactoryProducer.getFactory("1");
        if(!ObjectUtils.isEmpty(showFactory)) {
            ShowService show = showFactory.getShow(type);
            show.show();
        }
        AbstractFactory speakFactory = FactoryProducer.getFactory("2");
        if(!ObjectUtils.isEmpty(speakFactory)) {
            SpeakService speak = speakFactory.getSpeak(type);
            speak.speak();
        }
        return "fact";
    }

}
