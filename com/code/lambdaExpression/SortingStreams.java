package com.code.lambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStreams {

    public static void showDemo() {

        List<Movie> movies = List.of(
                new Movie("c", 10),
                new Movie("b", 5),
                new Movie("e", 50),
                new Movie("a", 60)
        );

//        List<Integer> numbers = List.of(5,6,3,8,2,1);
//        numbers.stream()
//                .sorted()
//                .forEach(item -> System.out.println(item));

        movies.stream()
                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
//                .sorted((a, b) -> a.getLikes() - b.getLikes())
                .forEach(item -> System.out.println(item.getTitle()));

        movies.stream()
//                .sorted(Comparator.comparing(movie -> movie.getTitle()))
                .sorted(Comparator.comparing(Movie::getTitle))
                .forEach(item -> System.out.println(item.getTitle()));

//        should return  - if both are equal
//        a == b; return 0
//         a > b --> return +1
//        a < b --> return -1


    }
}
