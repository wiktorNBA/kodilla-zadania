package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LoggerTestSuite {

    @Test
    public void getLastLogTest(){
        //Given
        Logger logger = Logger.INSTANCE;
        String result = "";
        //When
        logger.log("First log");
        result = logger.getLastLog();
        //Then
        Assertions.assertEquals("First log", result);
    }
}
