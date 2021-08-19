package com.yt.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @USER: Young
 * @DATETIME: 2020/7/15
 * @DESCRIPTION:
 **/
public class HashMapDemo1 {
    public static void main(String[] args) {
        Map<Object, Object> hashMap = new HashMap<>();

        Thread thread = new MyThread();
        thread.start();

        new Thread(() ->{
            System.out.println("线程");
        }).start();
    }


    // 继承Thread类
    public static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("我是使用继承Thread类创建的线程");
        }
    }

}

















