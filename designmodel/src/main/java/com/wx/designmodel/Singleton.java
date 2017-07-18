package com.wx.designmodel;

/**
 * @Author: Wells.Wei
 * @Date: 2017/4/11
 * @Description: 单例
 */
public class Singleton {


}

/**
 * 懒汉式（1，2,3,4）
 */
class Singleton1{

    private static Singleton1 instance = null;
    private Singleton1(){}

    public static Singleton1 getInstance(){
        if (instance != null){
            instance = new Singleton1();
        }
        return instance;
    }
}

class Singleton2{

    private static Singleton2 instance = null;
    private Singleton2(){}

    public synchronized static Singleton2 getInstance(){
        if (instance != null){
            instance = new Singleton2();
        }
        return instance;
    }
}

/**
 * 双重检查锁
 */
class Singleton3{

    private static Singleton3 instance = null;
    private Singleton3(){}

    public  static Singleton3 getInstance(){
        if(instance == null) {
            synchronized (Singleton3.class) {
                if (instance != null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}

/**
 * 静态内部类(只会加载一次，所以线程安全)
 */
class Singleton4{
    private static class LazyHolder{
        private static final Singleton4 instance = new Singleton4();
    }

    private Singleton4(){}

    public static final Singleton4 getInstance(){
        return LazyHolder.instance;
    }
}

/**
 * 饿汉式
 */
class Singleton5{

    private static Singleton5 instance = new Singleton5();

    private Singleton5(){}

    public static Singleton5 getInstance(){
        return instance;
    }
}

