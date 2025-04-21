package advanced.collections;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("b");
//        set.add("c");
//        set.add("a");
//        System.out.println(set);//无序
//
//        Set<String> set2 = new TreeSet<>();
//        set2.add("b");
//        set2.add("c");
//        set2.add("a");
//        System.out.println(set2);//无序

        Set<String> set3 = new LinkedHashSet<>();
        set3.add("b");
        set3.add("c");
        set3.add("a");
        System.out.println(set3);//有序
    }
}
