package Builder.builder;

import Builder.entity.CellPhone;
import Builder.entity.iPhone;

public class iPhoneBuilder implements Builder{

    private Builder.entity.iPhone iPhone;

    public iPhoneBuilder(){
        this.iPhone = new iPhone();
    }

    @Override
    public void setCpu(String cpu) {
        this.iPhone.setCpu(cpu);
    }

    @Override
    public void setGpu(String gpu) {
        this.iPhone.setGpu(gpu);
    }

    @Override
    public void setScreen(String screen) {
        this.iPhone.setScreen(screen);
    }

    @Override
    public void setIdentity(String identity) {
        this.iPhone.setIdentifier(identity);
    }

    @Override
    public CellPhone getPhone() {
        return this.iPhone;
    }




}
