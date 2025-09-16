package com.code.lambdaExpression;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void showDemo(){
//        Supplier<Double> getRandomValue = () -> {return Math.random();};
        Supplier<Double> getRandomValue = () -> Math.random();
//        Consumer<String> print  = item -> {System.out.println(item);
        var random = getRandomValue.get();
        System.out.println(random);

        // one single statement in method, no need of return statement.
//        Supplier<Double> getRandomValue = () -> return Math.random();

    }
}
