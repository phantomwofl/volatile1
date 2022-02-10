class Client extends Thread {

    final private int NUMBER = 5;
    final private int PERIODICITY = 2000;
    ThreadGroup group;

    public Client(ThreadGroup group) {
        this.group = group;
    }

    @Override
    public void run() {

        for (int i = 1; i < NUMBER; i++) {
            try {
                Thread.sleep(PERIODICITY);
                Main.toggle = true;
                System.out.println("Включаю тумблер");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
