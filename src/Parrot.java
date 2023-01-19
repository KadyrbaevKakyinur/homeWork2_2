public class Parrot extends Animal{
    private String parrotName;

    public Parrot(String name, String parrotName) {
        super(name);
        this.parrotName = parrotName;
    }

    @Override
    public void print() {
        System.out.println(" Name: " + getName()+ " parrotName: " + parrotName);
    }
}
