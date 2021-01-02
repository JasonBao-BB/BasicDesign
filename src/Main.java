import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {


        Class cs = Class.forName("Student");

        System.out.println(cs.getName());

        Method[] methods = cs.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("==============================================");

        Field[] fields = cs.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("===============================================");
        Constructor constructor = cs.getConstructor(String.class, Integer.class, Integer.class);
        System.out.println(constructor);

        System.out.println("===================Refecltion 创建对象============================");
        Student student = (Student) cs.newInstance();
        System.out.println(student);

        Student student1 = (Student) constructor.newInstance("Bob", 98, 24);
        System.out.println(student1);

        System.out.println("===================Refecltion 调用方法============================");
        Method method = cs.getDeclaredMethod("videoGame");
        method.setAccessible(true);
        method.invoke(student1);


    }
}
