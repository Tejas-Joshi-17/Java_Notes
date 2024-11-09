// -------------------------------------------------------------------------------------------------------------------------

// 74) Java Thread Priorities

/*
 * setPriority(1-10)
 * 1) MIN_PRIORITY = 1
 * 2) NORM_PRIORITY = 5
 * 3) MAX_PRIORITY = 10
 */

// -------------------------------------------------------------------------------------------------------------------------


package Program;

class MyThread_741 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Thread-1");
    }
}

class MyThread_742 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Thread-2");
    }
}

class MyThread_743 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Thread-3");
    }
}

class MyThread_744 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Thread-4");
    }
}

class MyThread_745 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Thread-5");
    }
}

class MyThread_746 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Thread-1 (MAX_PRIORITY)");
    }
}

class MyThread_747 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Thread-2 (MIN_PRIORITY)");
    }
}

class MyThread_748 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Thread-3 (NORM_PRIORITY)");
    }
}

class MyThread_7491 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Thread-4 (MAX_PRIORITY)");
    }
}

class MyThread_7492 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Thread-5 (MIN_PRIORITY)");
    }
}

public class Lec_74 {
    public static void main(String[] args) {

        MyThread_741 t1 = new MyThread_741();
        MyThread_742 t2 = new MyThread_742();
        MyThread_743 t3 = new MyThread_743();
        MyThread_744 t4 = new MyThread_744();
        MyThread_745 t5 = new MyThread_745();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        // Thread-1
        // Thread-1
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-1
        // Thread-1
        // Thread-1
        // Thread-3
        // Thread-3
        // Thread-3
        // Thread-3
        // Thread-3
        // Thread-4
        // Thread-4
        // Thread-5
        // Thread-5
        // Thread-5
        // Thread-5
        // Thread-5
        // Thread-4
        // Thread-4
        // Thread-4


        MyThread_746 p1 = new MyThread_746();
        MyThread_747 p2 = new MyThread_747();
        MyThread_748 p3 = new MyThread_748();
        MyThread_7491 p4 = new MyThread_7491();
        MyThread_7492 p5 = new MyThread_7492();

        p1.setPriority(Thread.MAX_PRIORITY);      // OR    p1.setPriority(10)
        p2.setPriority(Thread.MIN_PRIORITY);      // OR    p2.setPriority(1)
        p3.setPriority(Thread.NORM_PRIORITY);     // OR    p3.setPriority(5)
        p4.setPriority(Thread.MAX_PRIORITY);      // OR    p4.setPriority(10)
        p5.setPriority(Thread.MIN_PRIORITY);      // OR    p5.setPriority(1)

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        // Thread-1 (MAX_PRIORITY)
        // Thread-1 (MAX_PRIORITY)
        // Thread-1 (MAX_PRIORITY)
        // Thread-1 (MAX_PRIORITY)
        // Thread-1 (MAX_PRIORITY)
        // Thread-3 (NORM_PRIORITY)
        // Thread-4 (MAX_PRIORITY)
        // Thread-4 (MAX_PRIORITY)
        // Thread-4 (MAX_PRIORITY)
        // Thread-4 (MAX_PRIORITY)
        // Thread-4 (MAX_PRIORITY)
        // Thread-3 (NORM_PRIORITY)
        // Thread-3 (NORM_PRIORITY)
        // Thread-3 (NORM_PRIORITY)
        // Thread-3 (NORM_PRIORITY)
        // Thread-2 (MIN_PRIORITY)
        // Thread-5 (MIN_PRIORITY)
        // Thread-2 (MIN_PRIORITY)
        // Thread-5 (MIN_PRIORITY)
        // Thread-2 (MIN_PRIORITY)
        // Thread-5 (MIN_PRIORITY)
        // Thread-2 (MIN_PRIORITY)
        // Thread-5 (MIN_PRIORITY)
        // Thread-2 (MIN_PRIORITY)
        // Thread-5 (MIN_PRIORITY)

    }
}


// -------------------------------------------------------------------------------------------------------------------------