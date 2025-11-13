
interface Workable {
    void work();
}

interface Feedable {
    void eat();
}

interface Payable {
    void getPaid();
}


class HumanWorker implements Workable, Feedable, Payable {
    @Override
    public void work() {
        System.out.println("Human working on task...");
    }

    @Override
    public void eat() {
        System.out.println("Human eating lunch...");
    }

    @Override
    public void getPaid() {
        System.out.println("Human receiving paycheck...");
    }
}


class RobotWorker implements Workable, Payable {
    @Override
    public void work() {
        System.out.println("Robot working 24/7...");
    }

    @Override
    public void getPaid() {
        System.out.println("Robot needs maintenance budget...");
    }
}


public class ISPTest {
    public static void manageWork(Workable w) {
        w.work();
    }

    public static void manageLunch(Feedable f) {
        f.eat();
    }

    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        RobotWorker robot = new RobotWorker();

        manageWork(human);
        manageWork(robot);
        manageLunch(human);
        
    }
}

