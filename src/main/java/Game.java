class Game extends Thread {

    final int PERIODICITY = 1000;
    ThreadGroup group;

    public Game(ThreadGroup group) {
        this.group = group;
    }

    @Override
    public void run() {

        while (!isInterrupted()) {
            if (Main.toggle) {
                try {
                    Thread.sleep(PERIODICITY);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Main.toggle = false;
                System.out.println("Выключаю тумблер");
            }
        }
    }
}
