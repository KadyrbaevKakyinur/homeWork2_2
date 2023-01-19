public class Bear extends Animal{
    private String color;

    public Bear(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println(" Name: "+ getName()+ " color: "+ color);
    }
}
