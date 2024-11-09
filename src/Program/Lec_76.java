// -------------------------------------------------------------------------------------------------------------------------

// Chapter-13 Practice Set

// -------------------------------------------------------------------------------------------------------------------------


package Program;

class Good_Morning761 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Good Morning Everyone ......");
    }
}

class Welcome762 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Welcome");
    }
}

class Good_Morning763 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Good Morning Everyone ......");
    }
}

class Welcome764 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println("Exception Occured :- " + e);
            }
        }
    }
}

class MyThread_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Thread-1 is Running ......... (Priority = 8)");
    }
}

class MyThread_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Thread-2 is Running ......... (Priority = 10)");
    }
}

class MyThread_3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Thread-3 is Running ......... (Priority = 3)");
    }
}

class MyThread_4 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Thread-4 is Running ......... (Priority = 5)");
    }
}

class MyThread_5 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Thread-5 is Running ......... (Priority = 1)");
    }
}

public class Lec_76 {
    public static void main(String[] args) {

        // 1) Write a program to print "Good Morning" and "Welcome" Continuously on the screen in Java Thread
        Good_Morning761 t1 = new Good_Morning761();
        Welcome762 t2 = new Welcome762();

        t1.start();
        t2.start();
        // Good Morning Everyone ......
        // Good Morning Everyone ......
        // Welcome
        // Welcome
        // Welcome
        // Welcome
        // Welcome
        // Welcome
        // Welcome
        // Welcome
        // Welcome
        // Welcome
        // Good Morning Everyone ......
        // Good Morning Everyone ......
        // Good Morning Everyone ......
        // Good Morning Everyone ......
        // Good Morning Everyone ......
        // Good Morning Everyone ......
        // Good Morning Everyone ......
        // Good Morning Everyone ......


        Good_Morning763 p1 = new Good_Morning763();
        Welcome764 p2 = new Welcome764();

        p1.start();
        p2.start();
        // Good Morning Everyone ......
        // Good Morning Everyone ......
        // Welcome
        // Good Morning Everyone ......
        // Good Morning Everyone ......
        // Good Morning Everyone ......
        // Good Morning Everyone ......
        // Good Morning Everyone ......
        // Good Morning Everyone ......
        // Good Morning Everyone ......
        // Good Morning Everyone ......
        // Welcome
        // Welcome
        // Welcome
        // Welcome
        // Welcome
        // Welcome
        // Welcome
        // Welcome
        // Welcome


        // 3) Demonstrate getPriority() and setPriority() methods in Java Thread.
        MyThread_1 a1 = new MyThread_1();
        MyThread_2 a2 = new MyThread_2();
        MyThread_3 a3 = new MyThread_3();
        MyThread_4 a4 = new MyThread_4();
        MyThread_5 a5 = new MyThread_5();

        a1.setPriority(8);
        a2.setPriority(10);       // OR a1.setPriority(Thread.MAX_PRIORITY)
        a3.setPriority(3);
        a4.setPriority(5);        // OR a4.setPriority(Thread.NORM_PRIORITY)
        a5.setPriority(1);        // OR a5.setPriority(Thread.MIN_PRIORITY)

        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();

        System.out.println("Priority of Thread-1 is :- " + a1.getPriority());
        System.out.println("Priority of Thread-2 is :- " + a2.getPriority());
        System.out.println("Priority of Thread-3 is :- " + a3.getPriority());
        System.out.println("Priority of Thread-4 is :- " + a4.getPriority());
        System.out.println("Priority of Thread-5 is :- " + a5.getPriority());
        // Thread-1 is Running ......... (Priority = 8)
        // Thread-1 is Running ......... (Priority = 8)
        // Thread-1 is Running ......... (Priority = 8)
        // Thread-1 is Running ......... (Priority = 8)
        // Thread-1 is Running ......... (Priority = 8)
        // Thread-2 is Running ......... (Priority = 10)
        // Thread-2 is Running ......... (Priority = 10)
        // Thread-2 is Running ......... (Priority = 10)
        // Thread-2 is Running ......... (Priority = 10)
        // Thread-2 is Running ......... (Priority = 10)
        // Thread-4 is Running ......... (Priority = 5)
        // Priority of Thread-1 is :- 8
        // Priority of Thread-2 is :- 10
        // Priority of Thread-3 is :- 3
        // Priority of Thread-4 is :- 5
        // Priority of Thread-5 is :- 1
        // Thread-4 is Running ......... (Priority = 5)
        // Thread-4 is Running ......... (Priority = 5)
        // Thread-4 is Running ......... (Priority = 5)
        // Thread-4 is Running ......... (Priority = 5)
        // Thread-3 is Running ......... (Priority = 3)
        // Thread-3 is Running ......... (Priority = 3)
        // Thread-3 is Running ......... (Priority = 3)
        // Thread-3 is Running ......... (Priority = 3)
        // Thread-3 is Running ......... (Priority = 3)
        // Thread-5 is Running ......... (Priority = 1)
        // Thread-5 is Running ......... (Priority = 1)
        // Thread-5 is Running ......... (Priority = 1)
        // Thread-5 is Running ......... (Priority = 1)
        // Thread-5 is Running ......... (Priority = 1)

    }
}


// -------------------------------------------------------------------------------------------------------------------------