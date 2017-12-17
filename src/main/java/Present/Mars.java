package Present;

public  class Mars extends Sladost{
    private Integer kkal;
    public Mars(String name, Integer weight, Integer price, Integer kkal) {
        super(name, weight, price);
        this.kkal=kkal;
    }

    public Integer getKkal() {
        return kkal;
    }

    public void setKkal(Integer kkal) {
        this.kkal = kkal;
    }

    @Override
    public String toString() {
        return super.toString()+", kkal=" + kkal;
    }

}
