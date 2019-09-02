package core.page;

import cn.hutool.core.util.ObjectUtil;
import lombok.Data;

/**
 * 通用分页
 */

@Data
public class Page {

    private Integer pageNum = 1;

    private Integer pageSize = 10;

    private Long total;

    private Boolean hasNextPage = false;

    private Integer nextPage;

    public void setHasNextPage(Boolean hasNextPage) {
        if (ObjectUtil.isNotNull(hasNextPage)) {
            this.hasNextPage = hasNextPage;
        }
        if (this.hasNextPage ) {
            nextPage = this.pageNum + 1;
        }
    }
}