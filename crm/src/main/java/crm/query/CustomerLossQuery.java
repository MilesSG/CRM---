package crm.query;

import crm.base.BaseQuery;

/**
 * 乐字节：专注线上IT培训
 * 答疑老师微信：lezijie
 */
public class CustomerLossQuery extends BaseQuery {

    private String customerNo; // 客户编号
    private String customerName; // 客户名称
    private Integer state; // 流失状态  0=暂缓流失状态  1=确认流失状态

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
