package com.code.lambdaExpression;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectorsDemo {

    public static void showDemo() {
        List<Movie> movies = List.of(
                new Movie("a", 10, Genre.COMEDY),
                new Movie("b", 20, Genre.ACTION),
                new Movie("c", 30, Genre.ACTION)
        );

        // key, value

        // key ( title)
        // value (likes)
//        {b=20, c=30}

//         key

        var result = movies.stream()
                .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));
//        .collect(Collectors.toMap(m->m.getTitle(), m -> m));
////        .collect(Collectors.toMap(m->m.getTitle(), Function.identity()));


        var sum = movies.stream()
                        .collect(Collectors.summingInt(Movie::getLikes));

        var summary = movies.stream()
                .collect(Collectors.summarizingInt(Movie::getLikes));

        var joinedResult = movies.stream()
                .map(Movie::getTitle)
                .collect(Collectors.joining(","));

//a:b:c

//        System.out.println(summary);
        System.out.println(joinedResult);

       var res = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre));

//       List<Integer> num = List.of(1,2,3);
//        IntStream.ran

        IntStream.rangeClosed(1, 5)
                .forEach(n -> System.out.println(n));


        IntStream.range(1, 5)
                .forEach(n -> System.out.println(n));





        System.out.println(res);

        //


//        System.out.println(sum);

//        System.out.println(result);


        // collect --> We can collect result of a stream into a Collection data structure (List, Map, Set)

    }


    // primitive stream

    // intStream
    // doubleStream
}
