package com.code.lambdaExpression;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void showDemo(){

        List<String> list = List.of("a", "b", "c", "d");

        Consumer<String> print  = item -> System.out.println(item);
        Consumer<String> printUppercase  = item -> System.out.println(item.toUpperCase());
        Consumer<String> printLowercase  = item -> System.out.println(item.toLowerCase());

        list.forEach(print.andThen(printUppercase).andThen(printLowercase));

//        consumer chaining

        // to call multiple Consumers sequentially we can use consumer chaining --> we have to use andThen



    }
}
