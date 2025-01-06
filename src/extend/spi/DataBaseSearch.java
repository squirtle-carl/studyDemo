package extend.spi;

import java.util.List;

/**
 * @author caihuaxin
 * @version 1.0.0
 * @doc 数据库搜索
 * @date 2023-08-16 18:43:81
 * @see Search
 */
public class DataBaseSearch implements Search{
    @Override
    public List<String> searchDoc(String keyword) {
        System.out.println("数据库搜索"+keyword);
        return null;
    }
}
