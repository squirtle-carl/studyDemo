package advanced.concurrent;

/**
 * @author caihuaxin
 * @version 1.0.0
 * @doc Synchronized演示
 * @date 2023-08-17 11:05:06
 */
public class SynchronizedDemo {
    Object object = new Object();
    public void method(){
        synchronized (object) {
        }
        method2();
    }
    private static void method2(){

    }
}
