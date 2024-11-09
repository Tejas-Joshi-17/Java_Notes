// -------------------------------------------------------------------------------------------------------------------------

// 73) Java Thread Constructor

// -------------------------------------------------------------------------------------------------------------------------


package Program;

class MyThread_731 extends Thread {
    public MyThread_731() {
        System.out.println("MyThread-100 Default Constructor");
    }

    public MyThread_731(String Name) {
        System.out.println("MyThread-100 Parameterized Constructor");
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++)
            System.out.println("This is running Thread-100");
    }

}

class MyThread_732 extends Thread {
    public MyThread_732() {
        System.out.println("MyThread-200 Default Constructor");
    }

    public MyThread_732(String Name) {
        System.out.println("MyThread-200 Parameterized Constructor");
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++)
            System.out.println("Thread-200");
    }
}

class MyThread_733 extends Thread {
    public MyThread_733() {
        System.out.println("MyThread-200 Default Constructor");
    }

    public MyThread_733(String Name) {
        this();
        System.out.println("MyThread-200 Parameterized Constructor");
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++)
            System.out.println("Thread-200");
    }
}

public class Lec_73 {
    public static void main(String[] args) {

        MyThread_731 t1 = new MyThread_731("India");
        MyThread_732 t2 = new MyThread_732("Tejas Joshi");      // Name of Thread is :- Tejas Joshi
        MyThread_733 t3 = new MyThread_733("Tejas Joshi");      // Name of Thread is :- Tejas Joshi

        t1.start();
        t2.start();

        System.out.println("Id of Thread-1 is :- " + t1.getId());
        System.out.println("Name of Thread-1 is :- " + t1.getName());
        System.out.println("Id of Thread-2 is :- " + t2.getId());
        System.out.println("Name of Thread-2 is :- " + t2.getName());
        // MyThread-100 Parameterized Constructor
        // MyThread-200 Parameterized Constructor
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Id of Thread-1 is :- 10
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // Name of Thread-1 is :- Thread-0
        // Id of Thread-2 is :- 11
        // Name of Thread-2 is :- Thread-1


        MyThread_731 p1 = new MyThread_731("India");
        MyThread_733 p2 = new MyThread_733("Tejas Joshi");      // Name of Thread is :- Tejas Joshi

        p1.start();
        p2.start();
        // MyThread-100 Default Constructor
        // MyThread-100 Parameterized Constructor
        // MyThread-200 Default Constructor
        // MyThread-200 Parameterized Constructor
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Id of Thread-1 is :- 10
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // Thread-200
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // This is running Thread-100
        // Name of Thread-1 is :- Thread-0
        // Id of Thread-2 is :- 11
        // Name of Thread-2 is :- Thread-1

    }
}


// -------------------------------------------------------------------------------------------------------------------------