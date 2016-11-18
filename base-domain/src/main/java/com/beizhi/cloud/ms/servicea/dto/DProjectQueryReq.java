package com.beizhi.cloud.ms.servicea.dto;

import java.util.List;

/**
 * Created by kanghong.zhao on 2016-11-16.
 */
public class DProjectQueryReq {

    private Integer companyId;

    private List<Integer> statusInclude;
    private List<Integer> statusExclude;

    private String projectNameLike;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public List<Integer> getStatusInclude() {
        return statusInclude;
    }

    public void setStatusInclude(List<Integer> statusInclude) {
        this.statusInclude = statusInclude;
    }

    public List<Integer> getStatusExclude() {
        return statusExclude;
    }

    public void setStatusExclude(List<Integer> statusExclude) {
        this.statusExclude = statusExclude;
    }

    public String getProjectNameLike() {
        return projectNameLike;
    }

    public void setProjectNameLike(String projectNameLike) {
        this.projectNameLike = projectNameLike;
    }
}
