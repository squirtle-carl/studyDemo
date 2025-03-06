package advanced.jul;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author squirtle
 * @version 1.0.0
 * @describe 日志快速测试
 * @date 2025/02/25
 */
public class LogQuickTest {
    //获取日志记录器
    Logger logger = Logger.getLogger("advanced.jul");

    public void test() {
        logger.info("Hello JUL Info");
        logger.log(Level.INFO, "Hello JUL Info");
        String name = "squirtle";
        int age = 18;
        logger.log(Level.INFO, "Hello {0},You are {1}", new Object[]{name, age});
    }

    public static void main(String[] args) {
//        LogQuickTest logQuickTest = new LogQuickTest();
//        logQuickTest.test();
        String selfIntroduction = String.format("%s今年%d岁", "杰尼龟的小龟壳", 18);
        System.out.println(selfIntroduction);
    }
}
