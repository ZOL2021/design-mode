package com.zlbteam;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotSame;

@SpringBootTest
class PrototypePatternApplicationTests {

    @Test
    void contextLoads() {
        String prototype = "prototype";
        assertNotSame("prototype", prototype);
    }

}
