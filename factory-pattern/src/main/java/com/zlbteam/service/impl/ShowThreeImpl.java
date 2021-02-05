package com.zlbteam.service.impl;

import com.zlbteam.service.ShowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author zhoulibin
 */
@Slf4j
@Service
public class ShowThreeImpl implements ShowService {
    /**
     * 展示信息
     */
    @Override
    public void show() {
        log.info("three");
    }
}
