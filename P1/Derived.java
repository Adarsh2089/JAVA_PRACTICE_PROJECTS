package P1;

class Derived extends SameClass {
    Derived() {
        System.out.println("Same Package Subclass Constructor");
        // System.out.println("Private: " + pri); // Not accessible
        System.out.println("No Modifier: " + nomod);
        System.out.println("Protected: " + pro);
        System.out.println("Public: " + pub);
    }
    public static void main(String[] args) {
        new Derived();
    }
}

