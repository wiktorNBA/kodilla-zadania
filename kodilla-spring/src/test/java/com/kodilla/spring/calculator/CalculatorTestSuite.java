package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.junit.jupiter.api.Assertions;


@SpringBootTest
public class CalculatorTestSuite {

    Calculator calculator = new Calculator();

//    Nie rozumiem czemu to nie dziala
//    @Autowired
//    private Calculator calculator;

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double sum = calculator.add(4.2, 3.1);
        double diff = calculator.sub(4.9, 3);
        double product = calculator.mul(5.4, 8.2);
        double quo = calculator.div(50, 10);

        //Then
        Assertions.assertEquals(7.3, sum, 0.01);
        Assertions.assertEquals(1.9, diff, 0.01);
        Assertions.assertEquals(44.28, product, 0.01);
        Assertions.assertEquals(5, quo, 0.01);

    }
}
