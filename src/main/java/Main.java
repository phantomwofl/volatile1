public class Main {

    volatile static boolean toggle;
    final static int WAIT_TIME = 2000;

    public static void main(String[] args) throws InterruptedException {


        ThreadGroup group = new ThreadGroup("group");
        Thread thread1 = new Game(group);
        Thread thread2 = new Client(group);

        thread2.start();
        thread1.start();


        thread2.join();
        Thread.sleep(WAIT_TIME);
        thread1.interrupt();
    }
}
