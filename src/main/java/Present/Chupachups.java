package Present;

public class Chupachups extends Sladost{
    private String vkus;
    public Chupachups(String name, Integer weight, Integer price, String vkus) {
        super(name, weight, price);
        this.vkus=vkus;
    }

    public String getVkus() {
        return vkus;
    }

    public void setVkus(String vkus) {
        this.vkus = vkus;
    }

    @Override
    public String toString() {
        return super.toString()+", vkus=" + vkus;
    }
}
