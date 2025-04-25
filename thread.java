import java.util.Random;

public class thread {
    static int number; // Shared variable

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t1.start();
        t2.start();
        t3.start();
    }

    // Thread to generate random numbers
    static class Thread1 extends Thread {
        public void run() {
            Random rand = new Random();
            while (true) {
                number = rand.nextInt(100);
                System.out.println("\nRandom number: " + number);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    // Thread to print square if even
    static class Thread2 extends Thread {
        public void run() {
            while (true) {
                if (number % 2 == 0) {
                    System.out.println("Even → Square: " + (number * number));
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    // Thread to print cube if odd
    static class Thread3 extends Thread {
        public void run() {
            while (true) {
                if (number % 2 != 0) {
                    System.out.println("Odd → Cube: " + (number * number * number));
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
