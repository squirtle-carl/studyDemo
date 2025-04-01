package basic.strings;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;

public class StringTest {

    public static void main(String[] args) {
        String s = "hello world";
        String s1 = "hello world";
        String s2 = new String("hello world");
        System.out.println(s == s1);
        System.out.println(s1 == s2);

//        List<String> list = Arrays.asList("hello", "world");
//        String result = String.join(" ", list);
//        System.out.println(result);

//        String template = "Hello {0}, welcome to {1}";
//        String result = MessageFormat.format(template, "John", "Java World");
//        System.out.println(result); // 输出: Hello John, welcome to Java World

        Formatter formatter = new Formatter();
        formatter.format("Hello %s, your score is %.2f", "Alice", 98.5);
        String result = formatter.toString();
        System.out.println(result); // 输出: Hello Alice, your score is 98.50
        formatter.close();
    }
}
