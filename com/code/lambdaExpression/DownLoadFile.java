package com.code.lambdaExpression;

public class DownLoadFile implements Runnable {

    @Override
    public void run() {
        System.out.println("Downloading file " + " " + Thread.currentThread().getName());
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        for(var i = 0; i < Integer.MAX_VALUE; i++) {
            if(Thread.currentThread().isInterrupted()) return;
            System.out.println("threads -->" + i);
        }


        System.out.println("Download completed");
    }
}
