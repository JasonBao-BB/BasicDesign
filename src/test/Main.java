package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
//        teacher.getAge();
//        teacher.teach();

        //通过反射API获取整个类的信息
        try {

            Class cl1 = Class.forName("test.Teacher");

            Field[] publicFields = cl1.getFields();
            System.out.println("**********************************");
            Field[] allFields = cl1.getDeclaredFields();

            for (Field field : allFields) {
                System.out.println(field);
            }


            System.out.println("====================================");
            Method[] publicMethods = cl1.getMethods();
            System.out.println("**********************************");
            Method[] allMethods = cl1.getDeclaredMethods();

            for (Method method : allMethods) {
                System.out.println(method);
            }

            System.out.println("**********************************");
            Constructor[] constructors = cl1.getDeclaredConstructors();
            for (Constructor method : constructors) {
                System.out.println(method);
            }

            System.out.println("=================创建对象===================");

            Teacher teacher1 = (Teacher) cl1.newInstance();
            System.out.println(teacher1);

            Constructor constructor = cl1.getConstructor(String.class, Integer.class, String.class,
                    Integer.class);

            Teacher teacher2 = (Teacher) constructor.newInstance("Boyang", 18, "M", 999999);
            System.out.println(teacher2);

            System.out.println("=================强制执行===================");
            Method method = cl1.getDeclaredMethod("prepare");
            method.setAccessible(true);
            method.invoke(teacher2);


        } catch (Exception e) {
            System.out.println(e);
        }



    }


}
