package com.zlbteam;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotSame;

@SpringBootTest
class SingletonPatternApplicationTests {

    @Test
    void contextLoads() {
        String single = "single";
        assertNotSame("single", single);
    }

}
