class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(getName() + " Completed.");
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("MAX Thread");
        MyThread t2 = new MyThread("MIN Thread");
        MyThread t3 = new MyThread("NORM Thread");
        t1.setPriority(Thread.MAX_PRIORITY);   
        t2.setPriority(Thread.MIN_PRIORITY);   
        t3.setPriority(Thread.NORM_PRIORITY); 
        System.out.println(t1.getName() + " Priority = " + t1.getPriority());
        System.out.println(t2.getName() + " Priority = " + t2.getPriority());
        System.out.println(t3.getName() + " Priority = " + t3.getPriority());
        t1.start();
        t2.start();
        t3.start();
    }
}