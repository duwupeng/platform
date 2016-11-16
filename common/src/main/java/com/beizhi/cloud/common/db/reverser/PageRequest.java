package com.beizhi.cloud.common.db.reverser;

/**
 * 分页请求
 * Created by eric on 16/11/14.
 */
public class PageRequest {
    /**
     * 查询的开始序号（序号从零开始）
     *
     */
    public Integer start = 0; // required
    /**
     * 返回记录数
     *
     */
    public Integer limit = 10; // required
    /**
     * 排序的字段<br/>
     * <ul>
     * <li>field1 asc, field2 desc</li>
     * </ul>
     *
     */
    public String sortFields; // optional



    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getSortFields() {
        return sortFields;
    }

    public void setSortFields(String sortFields) {
        this.sortFields = sortFields;
    }
}
