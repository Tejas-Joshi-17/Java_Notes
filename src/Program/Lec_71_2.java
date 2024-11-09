// -------------------------------------------------------------------------------------------------------------------------

// 71)  2] Creating Thread By Implementing "Runnable" Interface

// -------------------------------------------------------------------------------------------------------------------------


package Program;

class Mythread_713 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("This is running Thread-1");
    }
}

class Mythread_714 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Thread-2");
    }
}

public class Lec_71_2 {
    public static void main(String[] args) {

        Mythread_713 Bullet_1 = new Mythread_713();
        Thread t1 = new Thread(Bullet_1);

        Mythread_714 Bullet_2 = new Mythread_714();
        Thread t2 = new Thread(Bullet_2);

        t1.start();         // Start Thread-1 and invoked run() method
        t2.start();         // Start Thread-2 and invoked run() method
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

    }
}


// -------------------------------------------------------------------------------------------------------------------------