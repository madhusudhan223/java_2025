package com.code.lambdaExpression;

public class LambdaExpressionDemo {
    public static void showDemo(){

        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });

        // lambda operator ->
        // lambda expression
//        greet((String message) -> {
//            System.out.println(message);
//        });
//
//        greet((message) -> {
//            System.out.println(message);
//        });
//
//        greet(message -> {
//            System.out.println(message);
//        });

        greet(message -> System.out.println(message));

        // lambda expression --> shorter way to implement your functional interface.



        // one single parameter

    // peranthesis -> this is required only when we dont have any parameters, parameters more than one




//        anonymous inner class

        // we may not required to create new class

        // anonymous inner class -
        // lambda expression - java 8 - advanced

    }

    //

    public static void greet(Printer printer){

        printer.print("Welcome !!");

    }
}


//functional interface --->

// Printer -->
