package common;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ArraysTest {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1};
        Arrays.sort(numbers); // 结果：{1, 3, 5, 9}
        System.out.println(Arrays.toString(numbers));

        String[] names = {"John", "Alice", "Bob"};
        Arrays.sort(names, Comparator.reverseOrder()); // 逆序排列
        System.out.println(Arrays.toString(names));
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println(index);

        String[] array = {"A", "B", "C"};
        Spliterator<String> spliterator = Arrays.spliterator(array);

        // 创建顺序流
        Stream<String> stream = StreamSupport.stream(spliterator, false);
        stream.forEach(System.out::println); // 输出 A → B → C

//        // 创建并行流
//        Stream<String> parallelStream = StreamSupport.stream(spliterator, true);
//        parallelStream.forEach(System.out::println); // 输出顺序不确定（并行）
        System.out.println(Arrays.compare(numbers, new int[]{9, 3, 5, 9}));//-1，0，1

        long[] a = {1L, 2L, 3L, 4L};
        long[] b = {1L, 2L, 9L, 4L};

// 比较整个数组范围
        int result = Arrays.mismatch(a, 0, 4, b, 0, 4); // 返回 2
    }
}
