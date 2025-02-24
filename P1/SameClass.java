package P1;

public class SameClass {
    private int pri = 1;
    int nomod = 2;
    protected int pro = 3;
    public int pub = 4;

   public SameClass() {
        System.out.println("Same Class Constructor");
        System.out.println("Private: " + pri);
        System.out.println("No Modifier: " + nomod );
        System.out.println("Protected: " + pro);
        System.out.println("Public: " + pub);
    }
    public static void main(String[] args) {
        new SameClass();
    }
}
