package Builder.builder;

import Builder.entity.CellPhone;
import Builder.entity.Samsung;

public class SamsungBuilder implements Builder{

    private Samsung samsung;

    public SamsungBuilder(){
        samsung = new Samsung();
    }

    @Override
    public void setCpu(String cpu) {
        this.samsung.setCpu(cpu);
    }

    @Override
    public void setGpu(String gpu) {
        this.samsung.setGpu(gpu);
    }

    @Override
    public void setScreen(String screen) {
        this.samsung.setScreen(screen);
    }

    @Override
    public void setIdentity(String identity) {
        this.samsung.setIdentifier(identity);
    }

    @Override
    public CellPhone getPhone() {
        return samsung;
    }
}
