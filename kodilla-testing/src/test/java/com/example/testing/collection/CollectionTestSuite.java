package com.example.testing.collection;

import com.example.testing.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

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
        for (int i=0; i<20 ; i++){
            filledArrayList2.add(i);
            if(filledArrayList2.get(i) % 2 == 0){
                oddArrayList.add(filledArrayList2.get(i));
            }
        }

        //When
        OddNumbersExterminator secondList = new OddNumbersExterminator(filledArrayList2);
        secondList.exterminate(filledArrayList2);

        //Then
        Assertions.assertEquals(oddArrayList, filledArrayList2);
    }
}
