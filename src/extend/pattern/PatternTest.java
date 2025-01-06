package extend.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        String pattern="(\\d{3})-(\\d{3})-(\\d{4})";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher("My phone number is 123-456-7890.");
        while (m.find()) {
            System.out.println("Full match:"+m.group(0));
            System.out.println("First group:"+m.group(1));
            System.out.println("Second group:"+m.group(2));
            System.out.println("Third group:"+m.group(3));

        }
        System.out.println("My phone number is 123-456-7890.".matches(pattern));
    }
}
