public class NumberPrinter {
    private static final int MAX_NUMBER = 15;
    public static void main(String[] args) {
        Thread t2 = new Thread(new PrintTask(2));
        Thread t3 = new Thread(new PrintTask(3));
        Thread t4 = new Thread(new PrintTask(4));
        Thread t5 = new Thread(new PrintTask(5));
        Thread tNumber = new Thread(new PrintTask(0));
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        tNumber.start();
    }
    static class PrintTask implements Runnable {
        private int divisor;
        PrintTask(int divisor) {
            this.divisor = divisor;
        }
        @Override
        public void run() {
            for (int i=1;i<=MAX_NUMBER;i++) {
                if (divisor==0 && i%2!=0 && i%3!=0 && i%4!=0 && i%5!=0) {
                    System.out.println("Number: " + i);
                } else if (divisor!=0 && i%divisor==0) {
                    System.out.println("Divisible by " + divisor + ":" + i);
                }
            }
        }
    }
}
