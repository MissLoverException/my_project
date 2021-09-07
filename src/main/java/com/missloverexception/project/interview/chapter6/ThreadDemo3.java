package com.missloverexception.project.interview.chapter6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo3 implements Runnable{
    @Override
    public void run() {
        System.out.println("实现Runnable+线程池的多线程，线程名：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 20; i++) {
            executorService.execute(new ThreadDemo3());
        }
        executorService.shutdown();
    }
}
