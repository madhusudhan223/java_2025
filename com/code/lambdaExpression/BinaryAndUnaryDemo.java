package com.code.lambdaExpression;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BinaryAndUnaryDemo {


//    x = 1 + 2 ;
    public static void showDemo() {
        BinaryOperator<Integer> add = (a,b) -> a + b ;

        Function<Integer, Integer> square = a -> a * a;

//        public static void

//        System.out.println(add.apply(1, 2));

//        System.out.println(add.andThen(square).apply(1,2));
        UnaryOperator<Integer> unarySquare = n -> n * n ;
        UnaryOperator<Integer> increment = n -> n + 1 ;

        System.out.println(increment.andThen(unarySquare).apply(5));

        unarySquare.apply(4);

        System.out.println(increment.apply(2));


    }


    //
}
