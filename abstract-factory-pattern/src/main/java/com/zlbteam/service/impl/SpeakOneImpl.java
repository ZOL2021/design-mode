package com.zlbteam.service.impl;

import com.zlbteam.service.SpeakService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author zhoulibin
 */
@Slf4j
@Service
public class SpeakOneImpl implements SpeakService {

    /**
     * 展示信息
     */
    @Override
    public void speak() {
        log.info("1");
    }
}
