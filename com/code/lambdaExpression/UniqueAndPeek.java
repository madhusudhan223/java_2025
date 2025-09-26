package com.code.lambdaExpression;

import java.util.List;

public class UniqueAndPeek {
    public static void showDemo() {

        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("b", 20),
                new Movie("c", 30)
        );

//        movies.stream()
//                .map(m-> m.getLikes())
//                .distinct()
//                .forEach(item -> System.out.println(item));

        movies.stream()
                .peek(m-> System.out.println("before Filter " + m.getTitle()))
                .filter(m-> m.getLikes() > 10)
                .peek(m-> System.out.println("after Filter " + m.getTitle()))
                .map(m-> m.getTitle())
                .forEach(item -> System.out.println(item));


// peek -> used to observe each output operation it is useful for troubleshooting operations
        List<Integer> numbers = List.of(1, 2, 3, 3, 5);
//
        numbers.stream()
                .distinct()
                .forEach(num -> System.out.println(num));


//        peek()






//        --> price --> 10, 20, 20, 30


    }
}
