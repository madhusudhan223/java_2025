package com.code.lambdaExpression;

import java.util.function.*;

public class FunctionDemo {
    public static void showDemo() {


        // Consumers, Suppliers, Function, Predicate

//        Function<String, Integer> map = (str) ->{ return str.length(); };
        Function<String, Integer> map = str -> str.length();

        var length = map.apply("hello");

        System.out.println(length);

        // "key:value"

        //first: "key=value"
        //second: "{key=value}"


        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";
        Function<String, String> removeBraces = str ->  str ;

        var formatted = replaceColon.andThen(addBraces).andThen(removeBraces).apply("key:value");

//        compose  - it composes the function in reverse order


//        var formatted1 = removeBraces.compose(addBraces).compose(replaceColon).apply("key:value");
//        System.out.println(formatted1);



//
        System.out.println(formatted);

//        var formatted = addBraces.apply("key=value");

//        System.out.println(formatted);







//        var formatted = replaceColon.apply("key:value");
//
//        System.out.println(formatted);









// string --> which returns string length


//        primitive specialization

// argument is specific type and return value is parametrized
//       1. IntFunction , LongFunction, DoubleFunction -- it takes primitive integer as input and return type of value R

//        1. IntFunction , LongFunction, DoubleFunction -->     input is primitive - return type is dynamic

//       2. ToIntFunction, ToLongFunction, ToDoubleFunction --> input is dynamic  - return type is primitive

//        IntToLongFunction, IntToDoubleFunction --> input and output are primitives
//        DoubleToIntFunction, DoubleToLongFunction
//        LongToIntFunction, LongToDoubleFunction

    }
}
