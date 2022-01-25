public class Main {

    volatile static boolean toggle;

    public static void main(String[] args) throws InterruptedException {




        Game game = new Game();
        Client client = new Client();
        Thread thread1 = new Thread(game);
        Thread thread2 = new Thread(client);

        thread2.start();
        thread1.start();

        thread1.join();
        thread1.interrupt();
    }
}
