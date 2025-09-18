package com.code.lambdaExpression;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void showDemo() {

        Predicate<String> isLongerThan3 = str -> str.length() > 3 ;
        var result = isLongerThan3.test("he");

        // String --> "{key:value}"

        // hasLeftBrace

        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

//        System.out.println(hasLeftBrace.and(hasRightBrace).test("{key:value}"));
//        System.out.println(hasLeftBrace.or(hasRightBrace).test("{key:value}"));

        System.out.println(hasLeftBrace.negate().test("key:value}"));

//        !result

//        Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);
//         hasLeftAndRightBraces.test("{key:value");
        //and, or, negate

        // logical and , logical or, negate









//        System.out.println(result);


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