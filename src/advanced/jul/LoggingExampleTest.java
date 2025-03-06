package advanced.jul;

import java.io.IOException;
import java.util.logging.*;

public class LoggingExampleTest {
    public void testLogging() {
        // 获取日志记录器
        Logger logger = Logger.getLogger("LoggingExample");

        // 设置日志级别为INFO，这意味着INFO级别及以上的日志会被记录
        logger.setLevel(Level.INFO);

        // 创建控制台Handler 将日志输出到控制台
        ConsoleHandler consoleHandler = getConsoleHandler();
        logger.addHandler(consoleHandler);

        // 创建文件Handler 将日志输出到文件
        // 并设置其日志级别和Formatter
        try {
            FileHandler fileHandler = new FileHandler("app.log", true);
            fileHandler.setLevel(Level.ALL); // 文件将记录所有级别的日志
            fileHandler.setFormatter(new SimpleFormatter() {
                @Override
                public synchronized String format(LogRecord record) {
                    // 自定义日志格式
                    return String.format("%1$tF %1$tT [%2$s] %3$s %n", record.getMillis(), record.getLevel(), record.getMessage());
                }
            });
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 创建并设置Filter
        Filter filter = new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
                // 这里可以添加过滤逻辑，例如只记录包含特定字符串的日志
                return record.getMessage().contains("信息");
            }
        };

        // 将Filter应用到Logger
        logger.setFilter(filter);

        // 记录不同级别的日志
        logger.severe("严重错误信息 - 应记录到控制台和文件");
        logger.warning("警告信息 - 应记录到控制台和文件");
        logger.info("常规信息 - 只记录到文件");
        logger.config("配置信息 - 只记录到文件");
        logger.fine("详细日志 - 只记录到文件");


        // 这条日志将被Filter过滤掉，不会记录
        logger.info("这条信息不重要，将被过滤");

        // 这条日志将被记录，因为消息中包含"important"
        logger.info("这条信息很重要，将被记录到控制台和文件");
    }

    /**
     * @return {@link ConsoleHandler }
     * @Description: 设置日志级别和Formatter
     * @see ConsoleHandler
     */
    private static ConsoleHandler getConsoleHandler() {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.WARNING); // 控制台只输出WARNING及以上级别的日志
        consoleHandler.setFormatter(new SimpleFormatter() {
            @Override
            public synchronized String format(LogRecord record) {
                // 自定义日志格式
                return String.format("%1$tF %1$tT [%2$s] %3$s %n", record.getMillis(), record.getLevel(), record.getMessage());
            }
        });
        return consoleHandler;
    }

    public static void main(String[] args) {
        LoggingExampleTest test = new LoggingExampleTest();
        test.testLogging();
    }
}
