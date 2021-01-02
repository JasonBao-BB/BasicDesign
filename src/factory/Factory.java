package factory;

/*
* 什么是工厂模式？
* 代替new object 而通过调用工厂的getObject得到新的对象
* Object obj = new Object();
* Object obj = Factory.getObject("type");
*
* CSGO
* Overwatch
* Valorant
*
* 什么时候使用工厂模式？
* 不同情况需要多种创建方式 同时代替new
*
* */

import com.sun.javafx.geom.ShapePair;

public abstract class Factory {

    Shape shape;

    public Factory() {

    }

    public abstract Shape getShape();

}
