package Builder;

import Builder.builder.Builder;
import Builder.builder.SamsungBuilder;
import Builder.builder.iPhoneBuilder;
import Builder.creator.PhoneCreator;
import Builder.entity.CellPhone;

public class Main {

    public static void main(String[] args) {
        /*
        * 我们要生产手机
        * 生产一台苹果手机 和 一台三星手机
        * CellPhone iPhone = new iPhone();
        * iphone.setXXX();
        * iphone.setXXX();
        * iphone.setXXX();
        * iphone.setXXX();
        * CellPhone samsung = new Samsung();
        * samsung.setXXX();
        * samsung.setXXX();
        * samsung.setXXX();
        * samsung.setXXX();
        * samsung.setXXX();
        * */



        PhoneCreator creator = new PhoneCreator(new iPhoneBuilder());
        PhoneCreator creator1 = new PhoneCreator(new SamsungBuilder());

        creator.constructPhone("A13", "A13", "Samsung", "FaceID");
        creator1.constructPhone("Sion 865","xxx","Samsung","Screen Finger");

        CellPhone iPhone = creator.getPhone();
        CellPhone samsung = creator1.getPhone();
    }
}
