// Bird class
class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

// Ostrich class (violates LSP)
class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly");
    }
}

// Demonstration
 class LSPMain {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Bird ostrich = new Ostrich();
        ostrich.fly(); // This will cause an issue
    }
}
