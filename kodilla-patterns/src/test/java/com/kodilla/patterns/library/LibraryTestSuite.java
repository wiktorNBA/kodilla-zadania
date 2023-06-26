package com.kodilla.patterns.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        LocalDate publicationDateOfBook1 = LocalDate.of(1941,5,10);
        LocalDate publicationDateOfBook2 = LocalDate.of(2000,9,14);


        Book book1 = new Book("W pustyni i w puszczy","Henryk Sienkiewicz", publicationDateOfBook1);
        Book book2 = new Book("Pan Tadeusz", "Adam Mickiewicz",publicationDateOfBook2);

        Library library = new Library("Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);


        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assertions.assertEquals(1, library.getBooks().size());
        Assertions.assertEquals(1, clonedLibrary.getBooks().size());
        Assertions.assertEquals(2, deepClonedLibrary.getBooks().size());
        Assertions.assertEquals(library.getBooks(), clonedLibrary.getBooks());
        Assertions.assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());

    }
}
