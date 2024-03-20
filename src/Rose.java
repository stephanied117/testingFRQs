public class Rose extends Flower {
    private String color;
    public Rose(String n, int p, String c) {
        super(n, p);
        color = c;
    }
    public String info() {
        return super.info() + "\nColor: " + color;
    }
    public String getColor() {
        return color;
    }
}
