package test;

/*

    什么是Singleton Design？
    如果我们想要一个Class在整个Application中只有一个对象
    我们就使用Singleton Design
    1. private construtor
    2. Reflection API
    3. Mutlti-thread problem

*/

public class Apple {

    private static Apple apple = null;

    //Reflection API
    private Apple(){ //construtor private
        if (apple != null) {
            throw new RuntimeException("不要设想去破解");
        }
    }

    public static Apple getApple() {
        if (apple == null) {
            synchronized (Apple.class) {
                if (apple == null) {
                    apple = new Apple();
                }
            }


        }
        return apple;
    }

}
