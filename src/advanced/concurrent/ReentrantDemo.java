package advanced.concurrent;

/**
 * @author caihuaxin
 * @version 1.0.0
 * @doc 可重入锁演示
 * @date 2023-10-23 14:10:10
 */
public class ReentrantDemo {
    public static void main(String[] args) {
        ReentrantDemo demo =  new ReentrantDemo();
        demo.method1();
        ReentrantDemo demo2 =  new ReentrantDemo();
        demo2.method2();
    }

    private synchronized void method1() {
        System.out.println(Thread.currentThread().getId() + ": method1()");
        method2();
    }

    private synchronized void method2() {
        System.out.println(Thread.currentThread().getId()+ ": method2()");
        method3();
    }

    private synchronized void method3() {
        System.out.println(Thread.currentThread().getId()+ ": method3()");
    }
}
