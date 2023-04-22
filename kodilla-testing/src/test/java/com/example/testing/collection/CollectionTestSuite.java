package com.example.testing.collection;

import com.example.testing.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    ArrayList<Integer> emptyArrayList = new ArrayList<Integer>();
    ArrayList<Integer> filledArrayList = new ArrayList<Integer>();
    ArrayList<Integer> oddArrayList = new ArrayList<Integer>();


    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("When one list is empty")

    @Test
    void testOddNumbersExterminatorEmptyList(){

        //Given
        for (int i=0; i<20; i++){
            filledArrayList.add(i);
        }

        //When
        OddNumbersExterminator firstList = new OddNumbersExterminator(emptyArrayList);
        firstList.exterminate(emptyArrayList);

        //Then
        Assertions.assertEquals(filledArrayList, emptyArrayList);
    }

    @DisplayName("When one list is filled")
    @Test
    public void testOddNumbersExterminatorNormalList(){

        //Given
        for (int i=0; i<20 ; i++){
            if(filledArrayList.get(i) % 2 != 0){
                oddArrayList.add(filledArrayList.get(i));
            }
        }

        //When
        OddNumbersExterminator secondList = new OddNumbersExterminator(filledArrayList);
        secondList.exterminate(filledArrayList);

        //Then
        Assertions.assertEquals(oddArrayList, filledArrayList);
    }
}
