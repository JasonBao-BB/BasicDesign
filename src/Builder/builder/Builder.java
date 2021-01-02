package Builder.builder;

import Builder.entity.CellPhone;

/*
* private String gpu;
    private String cpu;
    private String screen;
    private String identifier;
    *
    * */
public interface Builder {
    void setCpu(String cpu);
    void setGpu(String gpu);
    void setScreen(String screen);
    void setIdentity(String identity);

    CellPhone getPhone();
}
