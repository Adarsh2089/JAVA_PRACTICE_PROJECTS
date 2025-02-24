package P2;
import P1.SameClass;

public class NonSubClass {
    NonSubClass() {
        SameClass obj = new SameClass();
        System.out.println("Different Package Non-Subclass Constructor");
        // System.out.println("Private: " + obj.pri); // Not accessible
        // System.out.println("No Modifier: " + obj.nomod); // Not accessible
        // System.out.println("Protected: " + obj.pro); // Not accessible
        System.out.println("Public: " + obj.pub);
    }
    public static void main(String[] args) {
        new NonSubClass();
    }
}
