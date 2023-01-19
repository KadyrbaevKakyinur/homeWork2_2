public class Main {
    public static void main(String[] args) {
        createObject("Parrot").print();
        createObject("Fox").print();
        createObject("Bear").print();
    }
    public static  Animal createObject(String className){
        return switch (className) {
            case "Parrot" -> new Parrot(" Parrot", " Snoop-Dogg ");
            case "Fox" -> new Fox(" Fox", 12);
            case "Bear" -> new Bear(" Bear ", " brown ");
            default -> null;
        };
    }
}