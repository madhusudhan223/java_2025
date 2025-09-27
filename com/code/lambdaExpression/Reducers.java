package com.code.lambdaExpression;

import java.util.Comparator;
import java.util.List;

public class Reducers {

    // they reduces stream of objects into single value

    public static void showDemo() {
        List<Movie> movies = List.of(
                new Movie("d", 10),
                new Movie("b", 20),
                new Movie("c", 40)
        );

//      var result =  movies.stream()
//                .anyMatch(m -> m.getLikes() > 20);

//        var result1 = movies.stream()
//                .allMatch(m -> m.getLikes() > 20);

//        var result2 = movies.stream()
//                .noneMatch(m -> m.getLikes() > 20);


 //   findFirst

//        var result = movies.stream()
//                .findAny()
//                .get();
//
//        System.out.println(result.getTitle());

       var result = movies.stream()
                  .min(Comparator.comparing(m-> m.getLikes()));
//                .max(Comparator.comparing(Movie::getLikes);

        System.out.println(result.get().getTitle());





//        System.out.println(result2);

//        System.out.println(result1);



//        System.out.println(result);

//        System.out.println(movies.stream().count());


        //Reducers

        //count

        // anyMatch(Predicate
        // allMatch(Predicate
        // noneMatch(Predicate

        //findFirst
        // findAny

        // max (Comparator
        // min (Comparator

        // reduce


    }


}



// all intermediate operations

//map/flatmap
//filter
//limit/skip
//sorted
//distinct
//peek
//takeWhile
//dropWhile


