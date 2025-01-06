package extend.spi;

import java.util.List;

/**
 * @author caihuaxin
 * @version 1.0.0
 * @doc 搜索
 * @date 2023-02-07
 */
public interface Search {
    public List<String> searchDoc(String keyword);
}
