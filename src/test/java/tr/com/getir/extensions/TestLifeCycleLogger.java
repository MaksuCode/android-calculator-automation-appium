package tr.com.getir.extensions;

import logger.Log;
import org.junit.jupiter.api.*;

public interface TestLifeCycleLogger {

    Log logger = new Log();

    @BeforeAll
    default void beforeAllTests() {
        logger.info("#############################################################");
        logger.info("Test initiated...");
    }

    @AfterAll
    default void afterAllTests() {
        logger.info("Test finished...");
        logger.info("#############################################################");
    }

    @BeforeEach
    default void beforeEachTest(TestInfo testInfo) {
        logger.info(String.format("About to execute [%s]",
                testInfo.getDisplayName()));
    }

    @AfterEach
    default void afterEachTest(TestInfo testInfo) {
        logger.info(String.format("Finished executing [%s]",
                testInfo.getDisplayName()));
    }

}
