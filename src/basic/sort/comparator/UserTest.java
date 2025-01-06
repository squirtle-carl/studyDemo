package basic.sort.comparator;

import basic.sort.comparable.User;

import java.util.Comparator;
import java.util.TreeSet;

public class UserTest {
    public static void main(String[] args) {
        Comparator<User> com= Comparator.comparingInt(User::getAge);
        TreeSet<User> treeSet = new TreeSet<>(com);
        treeSet.add(new User("李白",20));
        treeSet.add(new User("孙悟空",200));
        treeSet.add(new User("杜甫",17));
        treeSet.add(new User("白居易",15));
        treeSet.add(new User("诸葛亮",37));
        for (Object o : treeSet) {
            System.out.println(o.toString());
        }
        System.out.println("***************");
//        Comparator<User> comU= Comparator.comparing(User::getName);
        treeSet.stream().sorted().forEach(System.out::println);
    }
}
