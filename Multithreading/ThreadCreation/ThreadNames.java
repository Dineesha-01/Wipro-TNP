class MyThread extends Thread {
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}

public class ThreadNames {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("Scooby");
        t2.setName("Shaggy");
        t1.start();
        t2.start();
        System.out.println("First Thread Name: " + t1.getName());
        System.out.println("Second Thread Name: " + t2.getName());
    }
}