package com.example.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeEach
    public void before(){
        System.out.println("Test Shape: begin");
        testCounter++;
        System.out.println("Preparing to execute test number " + testCounter);
    }
    @AfterEach
    public void after(){
        System.out.println("Test Shape: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Case: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Case: end");
    }

    @DisplayName("testAddFigure")
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollection = new ShapeCollector();

        //When
        shapeCollection.addFigure(new Triangle());

        //Then
        Assertions.assertEquals(1,shapeCollection.size());

    }

    @DisplayName("testRemoveFigure")
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollection = new ShapeCollector();
        Shape circle = new Circle();
        shapeCollection.addFigure(circle);

        //When
        shapeCollection.removeFigure(circle);

        //Then
        Assertions.assertEquals(0,shapeCollection.size());
    }

    @DisplayName("testGetFigure")
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollection = new ShapeCollector();
        Shape circle = new Circle();
        shapeCollection.addFigure(circle);

        //When
        String figure = shapeCollection.getFigure(0);

        //Then
        Assertions.assertEquals("Circle", figure);
    }

    @DisplayName("testShowFigures")
    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollection = new ShapeCollector();
        shapeCollection.addFigure(new Circle());
        shapeCollection.addFigure(new Square());
        shapeCollection.addFigure(new Triangle());

        //When
        String figures = shapeCollection.showFigures();

        //Then
        Assertions.assertEquals("Circle Square Triangle ", figures);
    }


}
