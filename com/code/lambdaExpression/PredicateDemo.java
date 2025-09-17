package com.code.lambdaExpression;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void showDemo() {

        Predicate<String> isLongerThan3 = str -> str.length() > 3 ;
        var result = isLongerThan3.test("he");

        System.out.println(result);


                // "hello" --> greater than 3

        // And
        // Or
        // negate

    }

    // predicate take input and it will always return boolean
}

// consumer - accept
// Supplier --> get
// Function --> apply
// Predicate - test