package P1;


public class SamePackage {
    SamePackage() {
        SameClass obj = new SameClass();
        System.out.println("Same Package Non-Subclass Constructor");
        // System.out.println("Private: " + obj.pri); // Not accessible
        System.out.println("No Modifier: " + obj.nomod);
        System.out.println("Protected: " + obj.pro);
        System.out.println("Public: " + obj.pub);
    }
    public static void main(String[] args) {
        new SamePackage();
    }
}
