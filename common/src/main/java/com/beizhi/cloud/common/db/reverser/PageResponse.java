package com.beizhi.cloud.common.db.reverser;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页返回
 * Created by eric on 16/11/15.
 */
public class PageResponse<T> {
    /**
     * 查询的开始序号（序号从零开始）
     **/
	private Integer start;
    /**
     * 最大返回的记录数
     **/
	private Integer limit;

    /**
     * 总记录数
     */
    private Integer total = 0;

    private List<T>  results = new ArrayList<T>();

    public PageResponse(){}

    public PageResponse(PageRequest pageReq){
        this.start = pageReq.start != null ? pageReq.start : 0;
        this.limit = pageReq.limit;
    }

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

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }
}
