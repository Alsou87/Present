package Present;

public class Snikers extends Sladost{
    private String nuts;
    public Snikers(String name, Integer weight, Integer price, String nuts) {
        super(name, weight, price);
        this.nuts=nuts;
    }

    public String getNuts() {
        return nuts;
    }

    public void setNuts(String nuts) {
        this.nuts = nuts;
    }

    @Override
    public String toString() {
        return super.toString()+", nuts=" + nuts;
    }
}
