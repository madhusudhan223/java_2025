package com.code.lambdaExpression;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsCreation {

    public static void showDemo() {

        // from collection
        // from Arrays
        // from an arbitrary number of objects
        //  infinite/finite streams

        // from Arrays
        int [] numbers = {1,2,3};
        Arrays.stream(numbers).forEach(item -> System.out.println(item));

        // from an arbitrary number of objects

        Stream.of(1,2,3,4).forEach(item -> System.out.println(item));


        // infinite/finite streams

        // infinite number stream
//          Stream.generate(() -> Math.random()).forEach(item -> System.out.println(item));

          // limited / finite stream
        Stream.generate(() -> Math.random()).limit(2).forEach(item -> System.out.println(item));

    }
}
