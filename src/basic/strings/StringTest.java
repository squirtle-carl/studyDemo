package basic.strings;

public class StringTest {
    public static void main(String[] args) {
        String s = "hello world";
        String s1 = "hello world";
        String s2 = new String("hello world");
        System.out.println(s == s1);
        System.out.println(s1 == s2);
    }
}
