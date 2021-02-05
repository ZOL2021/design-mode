package com.zlbteam;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotSame;

@SpringBootTest
class AbstractFactoryPatternApplicationTests {

    @Test
    void contextLoads() {
        String factory = "factory";
        assertNotSame("fac", factory);
    }

}
