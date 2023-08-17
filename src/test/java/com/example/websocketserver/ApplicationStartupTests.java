package com.example.websocketserver;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Tests here are ignored due the {@code CustomerConsumer.get()}
 * call in the constructor of {@code WorkOrderCompletionHandlerImpl}.
 * The return value of this method must be mocked before the class is autowired.
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationStartupTests {

    @Test
    public void shouldLoadApplicationContext() {

        // This test will pass if all required configuration is supplied
        // and all identifiable beans can be autowired.

        // This test will fail if configuration is missing
        // or certain Auto Configuration classes are not excluded.
    }
}
