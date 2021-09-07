package com.missloverexception.project.interview.chapter6;

public class ThreadDemo2 implements Runnable{
    @Override
    public void run() {
        System.out.println("实现Runnable接口的多线程，线程名：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        Thread thread = new Thread(threadDemo2);
        thread.setName("线程2");
        thread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("实现Runnable接口的多线程，线程名：" + Thread.currentThread().getName());
            }
        }).start();

        new Thread(() -> {
            System.out.println("实现Runnable接口的多线程，线程名：" + Thread.currentThread().getName());
        }).start();

    }
}
