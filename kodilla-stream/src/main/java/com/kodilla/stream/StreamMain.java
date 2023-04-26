package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Ala ma kota", (text -> "ABC" + text + "ABC"));
        poemBeautifier.beautify("Ala ma kota", (text -> text.toUpperCase()));
        poemBeautifier.beautify("Ala ma kota", (text -> text.toLowerCase()));
        poemBeautifier.beautify("Ala ma kota", (text -> text.substring(7)));
    }
}