package Builder.creator;

import Builder.builder.Builder;
import Builder.entity.CellPhone;

public class PhoneCreator {

    Builder builder;

    public PhoneCreator(Builder builder) {
        this.builder = builder;
    }

    public CellPhone getPhone(){
        return this.builder.getPhone();
    }

    public void constructPhone(String cpu, String gpu, String screen, String identity) {
        this.builder.setCpu(cpu);
        this.builder.setGpu(gpu);
        this.builder.setScreen(screen);
        this.builder.setIdentity(identity);
    }

}
