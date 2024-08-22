// Worker interface
interface Worker {
    void work();
}

// Eater interface
interface Eater {
    void eat();
}

// Robot class
class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working...");
    }
}

// Human class
class Human implements Worker, Eater {
    @Override
    public void work() {
        System.out.println("Human is working...");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating...");
    }
}

// Demonstration
 class ISPMain {
    public static void main(String[] args) {
        Worker robot = new Robot();
        robot.work();

        Human human = new Human();
        human.work();
        human.eat();
    }
}
