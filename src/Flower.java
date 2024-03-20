public class Flower extends Plant {
    private int petals;
    public Flower(String n, int p) {
        super(n);
        petals = p;
    }
    public void losePetals(int num) {
        petals -= num;
    }
    public String info() {
        return super.info() + "\nPetals: " + petals;
    }
    public int getPetals() {
        return petals;
    }
}

