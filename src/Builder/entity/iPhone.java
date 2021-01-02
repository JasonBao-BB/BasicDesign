package Builder.entity;

public class iPhone implements CellPhone{

    private String gpu;
    private String cpu;
    private String screen;
    private String identifier;

    @Override
    public void sendtext() {

    }

    @Override
    public void playGame() {

    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

}
