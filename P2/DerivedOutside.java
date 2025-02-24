package P2;
import P1.SameClass;


public class DerivedOutside extends SameClass {
    DerivedOutside() {
        System.out.println("Different Package Subclass Constructor");
        // System.out.println("Private: " + pri); // Not accessible
        // System.out.println("No Modifier: " + nomod); // Not accessible
        System.out.println("Protected: " + pro);
        System.out.println("Public: " + pub);
    }
    public static void main(String[] args) {
        new DerivedOutside();
    }

}
