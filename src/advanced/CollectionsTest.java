package advanced;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author squirtle
 * @version 1.0.0
 * @describe 集合测试
 * @date 2025/03/07
 */
public class CollectionsTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(map);
        unmodifiableMap.put("key", 1);
    }
}
