package com.example.testing.collection;

import java.util.ArrayList;
import java.util.*;


public class OddNumbersExterminator {


    ArrayList<Integer> listOfNumbers;

    public OddNumbersExterminator(ArrayList<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList <Integer> newList= new ArrayList<>();

        for (Integer i : numbers){
            if(i % 2 == 0){
                newList.add(i);
            }
        }

        return newList;
    }

    int size() {
        return listOfNumbers.size();
    }
}
