public class SynchronizedBlockAndMethod {
    public static void main(String[] args) {
        SynchronizedDiff synchronizedDiff = new SynchronizedDiff();
        synchronizedDiff.print1();
        synchronizedDiff.print2();

        /*
        Print1 start...
        Print1 end...
        Print2 start...
        Inside synchronized block...
        Print2 end...
         */
    }
}

class SynchronizedDiff {
    // synchronized method (locks whole method)
    public synchronized void print1() {
        System.out.println("Print1 start...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println("Print1 end...");
    }

    // synchronized block (locks only critical part)
    public void print2() {
        System.out.println("Print2 start...");
        synchronized (this) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println("Inside synchronized block...");
        }
        System.out.println("Print2 end...");
    }
}
