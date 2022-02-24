package thread;

public class TestRunningMan {

    public static void main(String[] args) {

        RunningMan r1 = new RunningMan("alpha");
        RunningMan r2 = new RunningMan("beta");
        RunningMan r3 = new RunningMan("omega");

        r1.start();
        r2.start();
        r3.start();


    }
}
