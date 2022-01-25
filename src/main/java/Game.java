class Game extends Thread {

    final int PERIODICITY = 1000;

    @Override
    public void run() {


            while (true) {
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
}
