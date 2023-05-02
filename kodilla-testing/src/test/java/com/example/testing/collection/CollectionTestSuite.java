package com.example.testing.collection;

import com.example.testing.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    ArrayList<Integer> emptyArrayList = new ArrayList<Integer>();
    ArrayList<Integer> filledArrayList1 = new ArrayList<Integer>();



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


        //When
        OddNumbersExterminator firstList = new OddNumbersExterminator();
        firstList.exterminate(emptyArrayList);

        //Then
        Assertions.assertEquals(filledArrayList1, emptyArrayList);
    }

    @DisplayName("When one list is filled")
    @Test
    public void testOddNumbersExterminatorNormalList(){

        //Given
        ArrayList<Integer> correctList= new ArrayList<>(List.of(2,4,6));
        ArrayList<Integer> listToExterminate= new ArrayList<>(List.of(1,2,3,4,5,6));



        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> finalList= new ArrayList<>(exterminator.exterminate(listToExterminate));

        //Then
        Assertions.assertEquals(correctList, finalList);
    }
}
