public class Fox extends Animal{
    private int speed;

    public Fox(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public void print() {
        System.out.println(" Name: " + getName()+ " speed: " +speed +" км/ч ");
    }
}
