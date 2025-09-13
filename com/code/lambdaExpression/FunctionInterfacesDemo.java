package com.code.lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class FunctionInterfacesDemo {

    public static void showDemo(){

        // Consumer interface

//        ---> BiConsumer
//        ----> IntConsumer

        // List.add(1)
        // Array.asList(1, 2, 3)
        // List.of(1,2,3
        //Collections.addAll(collection, 1, 2,  3);

        List<Integer> list = List.of(1, 2, 3);


        // imperative programming (for, if else, switch/case)
        for (var item : list){
            System.out.println(item);
        }

//        list.forEach((Integer item ) -> {
//            System.out.println(item);
//        });

        // Declarative programming

        list.forEach(item -> System.out.println(item));









        // in java predefined functional interfaces


        // Consumer --->  which takes input but returns nothing (void)
//        void consume(obj){
//
//        }

        // Supplier --> which takes no input but returns some value

//        Obj supply(){
//            return value
//        }


        // Function
//        map  ---> function that can map value to different value
//        transfer data
//        <T, R>


        // Predicate
//       it takes input always returns boolean

        // boolean test(condition)

//        it takes an input and checks if it satisfies criteria
//        used to filtering data
    }
}
