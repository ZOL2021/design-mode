package com.zlbteam;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FactoryPatternApplicationTests {

    @Test
    void contextLoads() {
        String factory = "factory";
        assertNotSame("fac", factory);
    }

}
