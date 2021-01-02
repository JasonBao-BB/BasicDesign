package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Apple apple = Apple.getApple();
//
//        Class cs = Class.forName("test.Apple");
//
//        Constructor constructor = cs.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Apple apple1 = (Apple) constructor.newInstance();

        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            service.submit(()->{
                Apple apple = Apple.getApple();
            });
        }

    }
}
