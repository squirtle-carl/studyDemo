package extend.spi;

import java.util.List;

/**
 * @author caihuaxin
 * @version 1.0.0
 * @doc 文件搜索
 * @date 2023-08-16 18:43:29
 * @see Search
 */
public class FileSearch implements Search{

    @Override
    public List<String> searchDoc(String keyword) {
        System.out.println("文件搜索"+keyword);
        return null;
    }
}
