package com.code.lambdaExpression;

import java.beans.Visibility;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void showDemo() {
        var executor = Executors.newFixedThreadPool(2);
        try{
        for (var i=0; i <10; i++) {
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }}
        finally {
            executor.shutdown();
        }



//        System.out.println(executor.getClass().getName());

    }


    //

    // thread 1
    // thread 2  --> data
    // thread 3

//    Race condition -> multiple threads trying to modify same data
//    Visibility problem --> one thread changing data, it's not visible to another data


//    Thread pool --> ExecutorService

//    pool of threads --> worker threads ->
//    --> they can be re-used to several tasks
//    --> They are not destroyed and recreated




}
