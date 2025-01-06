import extend.spi.Search;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {
    private static class Inner {
    }
    static void checkSynthetic (String name) {
        try {
            System.out.println (name + " : " + Class.forName (name).isSynthetic ());
        } catch (ClassNotFoundException exc) {
            exc.printStackTrace (System.out);
        }
    }
    public static void main(String[] args) {
        //测试合成类
        new Inner();
        checkSynthetic ("com.carl.test.Main");
        checkSynthetic ("com.carl.test.Main$Inner");
        checkSynthetic ("com.carl.test.Main$1");

        //测试SPI
        ServiceLoader<Search> s = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = s.iterator();
        while (iterator.hasNext()){
            Search next = iterator.next();
            next.searchDoc("hello world");
        }
    }
}
