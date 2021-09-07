package com.missloverexception.project.interview.chapter6;

public class ThreadDemo1 extends Thread{
    @Override
    public void run() {
        System.out.println("继承Thread的多线程，线程名：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        threadDemo1.setName("线程1");
        threadDemo1.start();

        System.out.println("主线程名称:" + Thread.currentThread().getName());
    }
}
