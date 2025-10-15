package concepts;

/*
Common Symptoms for Dead lock:
    App hangs indefinitely under concurrent load
    High CPU usage but no progress
    Thread dumps show threads stuck on locks
*/
public class Deadlock {

    static class Resource {
    }

    public static void main(String[] args) {
        Resource lock1 = new Resource();
        Resource lock2 = new Resource();

        // Thread 1 locks lock1 first, then tries to lock lock2
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock1...");
                try {
                    Thread.sleep(100);
                    System.out.println("In try bock of t1 thread");
                } catch (InterruptedException ignored) {
                }

                System.out.println("Thread 1: Waiting for lock2...");
                synchronized (lock2) {
                    System.out.println("Thread 1: Acquired lock2!");
                }
            }
        });

        // Thread 2 locks lock2 first, then tries to lock lock1
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock2...");
                try {
                    Thread.sleep(100);
                    System.out.println("In try bock of t2 thread");
                } catch (InterruptedException ignored) {
                }

                System.out.println("Thread 2: Waiting for lock1...");
                synchronized (lock1) {
                    System.out.println("Thread 2: Acquired lock1!");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

