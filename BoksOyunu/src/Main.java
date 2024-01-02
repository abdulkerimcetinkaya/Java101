public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 10,100,70,60);
        Fighter f2 = new Fighter("B", 20,100,120,55);

        Match match = new Match(f1,f2,70,120);
        match.run();
    }
}