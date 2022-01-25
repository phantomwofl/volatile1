class Client implements Runnable {

    final int NUMBER = 5;
    final int PERIODICITY = 2000;

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
