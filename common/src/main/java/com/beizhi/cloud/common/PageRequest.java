package com.beizhi.cloud.common;

/**
 * Created by eric on 16/11/14.
 */
public class PageRequest {
    /**
     * 查询的开始序号（序号从零开始）
     *
     */
    public int start; // required
    /**
     * 返回记录数
     *
     */
    public int limit; // required
    /**
     * 排序的字段<br/>
     * <ul>
     * <li>field1 asc, field2 desc</li>
     * </ul>
     *
     */
    public String sortFields; // optional



    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getSortFields() {
        return sortFields;
    }

    public void setSortFields(String sortFields) {
        this.sortFields = sortFields;
    }
}
