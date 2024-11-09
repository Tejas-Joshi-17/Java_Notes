// -------------------------------------------------------------------------------------------------------------------------

// 75) Java Thread Method

// -------------------------------------------------------------------------------------------------------------------------


package Program;

class MyThread_751 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Thread-1 is Running ....");
    }
}

class MyThread_752 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Thread-2");
    }
}

class MyThread_753 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread-1 is Running .....");
            try {
                Thread.sleep(1000);
                // <---- Thread-1 stops Running for every 1000 miliseconds in that Thread-2 is Running
            } catch (InterruptedException e) {
                System.out.println("Interrupt is occured hence Thread-1 stopped :- " + e);
            }
        }
    }
}

class MyThread_754 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Thread-2");
    }
}

public class Lec_75 {
    public static void main(String[] args) {

        MyThread_751 t1 = new MyThread_751();
        MyThread_752 t2 = new MyThread_752();

        t1.start();
        try {
            t1.join();                  // <----- Thread-2 starts running until Thread-1 completed
        } catch (Exception e) {
            System.out.println("Some Exception Occured :- " + e);
        }

        t2.start();
        // Thread-1 is Running ....
        // Thread-1 is Running ....
        // Thread-1 is Running ....
        // Thread-1 is Running ....
        // Thread-1 is Running ....
        // Thread-1 is Running ....
        // Thread-1 is Running ....
        // Thread-1 is Running ....
        // Thread-1 is Running ....
        // Thread-1 is Running ....
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2


        MyThread_753 p1 = new MyThread_753();
        MyThread_754 p2 = new MyThread_754();

        p1.start();
        p2.start();
        // Thread-1 is Running .....
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-2
        // Thread-1 is Running .....
        // Thread-1 is Running .....
        // Thread-1 is Running .....
        // Thread-1 is Running .....
        // Thread-1 is Running .....
        // Thread-1 is Running .....
        // Thread-1 is Running .....
        // Thread-1 is Running .....
        // Thread-1 is Running .....

    }
}


// -------------------------------------------------------------------------------------------------------------------------