package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testBoard() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        List<String> list1 = board.getDoneList().getTasksList();
        int size1 = list1.size();
        List<String> list2 = board.getInProgressList().getTasksList();
        int size2 = list2.size();
        List<String> list3 = board.getToDoList().getTasksList();
        int size3 = list3.size();

        //Then
        Assertions.assertEquals(0, size1);
        Assertions.assertEquals(0, size2);
        Assertions.assertEquals(0, size3);

    }

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        List<String> toDoList = board.getToDoList().getTasksList();
        toDoList.add("a");

        List<String> inProgressList = board.getInProgressList().getTasksList();
        inProgressList.add("b");

        List<String> doneList = board.getDoneList().getTasksList();
        doneList.add("c");

        //Then
        Assertions.assertEquals("a", toDoList.get(0));
        Assertions.assertEquals("b", inProgressList.get(0));
        Assertions.assertEquals("c", doneList.get(0));
    }
}