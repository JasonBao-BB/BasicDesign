package Singleton;
/*
* 饿汉 Hunger-Man
* 缺点 -> 占用不比要的内存
* CatchType -> Eager, Lazy
* Eager -> 主要这个Entity 被加载了 这个对应的Entity 一样会立刻加载
*
* Class Loader -> static fileds -> method area
* 类的加载 -> Class Loader -> binary data (Method Area) -> Class class (Heap Memory) => {static fields}
* 类的初始化 -> new Object();
* */
//饿汉第一种写法
class Singleton {

    private Singleton(){

    }

    private static final Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}

//饿汉的第二种写法 用static code block
class Singleton2{
    private Singleton2(){

    }

    private static Singleton2 singleton;

    static {
        singleton = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return singleton;
    }
}

//懒汉 线程不安全
class Singleton3{
    private Singleton3(){

    }

    private static Singleton3 singleton;

    public static Singleton3 getInstance() {
        if (singleton == null) {
            singleton = new Singleton3();
        }
        return singleton;
    }
}

//懒汉 线程安全 synchronized
class Singleton4{
    private Singleton4(){

    }

    private static Singleton4 singleton;

    public synchronized static Singleton4 getInstance() {
        if (singleton == null) {
            singleton = new Singleton4();
        }
        return singleton;
    }
    //懒汉 线程安全 双重判断
    public static Singleton4 getInstance2() {
        if (singleton == null) {
            synchronized (Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }

        }
        return singleton;
    }
}

// 懒汉 + 饿汉（内部类）+ 线程安全
// Reflection API + Anti-Serilization
class Singlton5{
    private Singlton5() {

    }

    //内部类
    private static class GetSingleton{
        private static final Singlton5 INSTANCE = new Singlton5();
    }

    public static Singlton5 getInstance() {
        return GetSingleton.INSTANCE;
    }
}

// 枚举 ******推荐写法 -> 无法被破解
enum Singleton6{
    INTANCE, APPLE, HELLO, WORD, FANGBI;
    public void getInstance() {

    }
}
//Singleton.INSTANCE;