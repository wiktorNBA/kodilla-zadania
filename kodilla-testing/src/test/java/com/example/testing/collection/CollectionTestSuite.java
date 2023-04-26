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
    ArrayList<Integer> filledArrayList2 = new ArrayList<Integer>();
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


        //When
        OddNumbersExterminator firstList = new OddNumbersExterminator(emptyArrayList);
        firstList.exterminate(emptyArrayList);

        //Then
        Assertions.assertEquals(filledArrayList1, emptyArrayList);
    }

    @DisplayName("When one list is filled")
    @Test
    public void testOddNumbersExterminatorNormalList(){

        //Given
        ArrayList<Integer> correctList= new ArrayList<>();
        correctList.add(2);
        correctList.add(4);
        correctList.add(6);
        correctList.add(8);
        correctList.add(10);
        ArrayList<Integer> listToExterminate= new ArrayList<>();
        listToExterminate.add(1);
        listToExterminate.add(2);
        listToExterminate.add(3);
        listToExterminate.add(4);
        listToExterminate.add(5);
        listToExterminate.add(6);
        listToExterminate.add(7);
        listToExterminate.add(8);
        listToExterminate.add(9);
        listToExterminate.add(10);


        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator((listToExterminate));
        ArrayList<Integer> finalList= new ArrayList<>(exterminator.exterminate(listToExterminate));

        //Then
        Assertions.assertEquals(correctList, finalList);
    }
}
