// -------------------------------------------------------------------------------------------------------------------------

// 71)  1] Creating Thread By Extending "Thread" Class

// -------------------------------------------------------------------------------------------------------------------------


package Program;

class Mythread_711 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("This is running Thread-1");
    }
}

class Mythread_712 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Thread-2");
    }
}

public class Lec_71_1 {
    public static void main(String[] args) {

        Mythread_711 t1 = new Mythread_711();
        Mythread_712 t2 = new Mythread_712();

        t1.start();     // Start Thread-1 and invoked run() method
        t2.start();     // Start Thread-2 and invoked run() method
        // This is running Thread-1
        // This is running Thread-1
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // This is running Thread-1
        // This is running Thread-1
        // This is running Thread-1
        // This is running Thread-1
        // This is running Thread-1
        // This is running Thread-1
        // This is running Thread-1
        // This is running Thread-1
        // Thread-2
        // Thread-2
        // Thread-2

    }
}


// -------------------------------------------------------------------------------------------------------------------------