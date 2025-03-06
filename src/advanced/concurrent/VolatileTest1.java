package advanced.concurrent;

public class VolatileTest1 {
    int a = 0;
    volatile boolean flag = false;

    public void writer() {
        a = 1;              // 1 线程A修改共享变量
        flag = true;        // 2 线程A写volatile变量
        System.out.println("writer");
    }

    public void reader() {
        if (flag) {         // 3 线程B读同一个volatile变量
            int i = a;          // 4 线程B读共享变量
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        final  VolatileTest1 test = new VolatileTest1();
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            test.reader();
        });
        Thread thread1 = new Thread(() -> {
            test.writer();
        });
        thread.start();

        thread1.start();
        System.out.println(111);
    }
}
