package com.missloverexception.project.interview.chapter6;

import sun.awt.windows.ThemeReader;

import java.lang.annotation.Target;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyTask implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        System.out.println("实现Callable接口的多线程，线程名：" + Thread.currentThread().getName());
        return "实现Callable接口多线程返回值";
    }

    public static void main(String[] args) {

        MyTask myTask = new MyTask();
        FutureTask<Object> futureTask = new FutureTask<>(myTask);
        Thread thread = new Thread(futureTask);
        thread.setName("线程3");
        thread.start();
        try {
            System.out.println("返回值：" + futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        new Thread(new FutureTask<>(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                return "匿名内部类";
            }
        })).start();

        new Thread(new FutureTask<>(() -> "lambda返回值")).start();
    }
}
