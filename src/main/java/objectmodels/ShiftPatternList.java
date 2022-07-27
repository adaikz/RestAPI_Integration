package objectmodels;

import java.util.List;

/**
 * 
 */
public class ShiftPatternList {
    private List<ShiftPatternListItem> list;
    private String pageIndex;
    private String pageSize;
    private String totalCount;

    public List<ShiftPatternListItem> getList() {
        return list;
    }

    public String getPageIndex() {
        return pageIndex;
    }

    public String getPageSize() {
        return pageSize;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setList(List<ShiftPatternListItem> list) {
        this.list = list;
    }

    public void setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }
}
