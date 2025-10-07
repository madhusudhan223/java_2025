package com.code.lambdaExpression;

public class ThreadDemo {
    public static void showDemo() {

//        System.out.println(Thread.currentThread().getName());

            Thread thread = new Thread(new DownLoadFile());
            thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread.interrupt();
//
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("Scanning a downloaded file for virus");





//        System.out.println("Step 3 " + Thread.currentThread().getName());

        // thread --> name, id


        // process -- thread

//        process  --> instance of program / application

//        concurrency --> ability of a program to manage mutiple task at same time

//        concurrency within process can be acheived within process -> using thread

//        thread --> sequence of instructions that thing which executes your code.

//        Atleast one main thread

        // garbage collector -- always one more thread will be running background

//        Thread thread = new Thread()


//        start() --> start the thread
        // run() --> contain code executed by thread
        // sleep(ms) --> pause the thread for given ms
        // join() --> waits for one thread to finish


//        synchronous -->  sequence
//        asynchronous --> parallel

//        thread.sleep(5000)

        // 1000ms -> 1 sec
        // 5000ms -> 5 sec
        // 10000ms --> 10sec

    }
}
