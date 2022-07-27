package objectmodels;

import java.util.List;

/**
 * Object class to persist parsed json response for list of all accounts
 */
public class AccountList {
    private List<AccountListItem> list;
    private String pageIndex;
    private String pageSize;
    private String totalCount;

    public List<AccountListItem> getList() {
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

    public void setList(List<AccountListItem> list) {
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
