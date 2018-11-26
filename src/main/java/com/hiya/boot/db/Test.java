package com.hiya.boot.db;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "erp_test")
public class Test implements Serializable
{
    private static final long serialVersionUID = 81270338189L;

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, name = "create_by")
    private String createBy;

    @Column(nullable = false, name = "create_date")
    private Date createDate;

    @Column(nullable = false, name = "update_by")
    private String updateBy;

    @Column(nullable = false, name = "update_date")
    private Date updateDate;

    @Column(nullable = false, name = "remark")
    private String remark;

    @Column(nullable = false, name = "sort")
    private Integer sort;

    @Column(nullable = false, name = "del_flag")
    private String delFlag;

    @Column(nullable = false, name = "planning_expert")
    private String planningExpert;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getCreateBy()
    {
        return createBy;
    }

    public void setCreateBy(String createBy)
    {
        this.createBy = createBy;
    }

    public Date getCreateDate()
    {
        return createDate;
    }

    public void setCreateDate(Date createDate)
    {
        this.createDate = createDate;
    }

    public String getUpdateBy()
    {
        return updateBy;
    }

    public void setUpdateBy(String updateBy)
    {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate()
    {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate)
    {
        this.updateDate = updateDate;
    }

    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }

    public Integer getSort()
    {
        return sort;
    }

    public void setSort(Integer sort)
    {
        this.sort = sort;
    }

    public String getDelFlag()
    {
        return delFlag;
    }

    public void setDelFlag(String delFlag)
    {
        this.delFlag = delFlag;
    }

    public String getPlanningExpert()
    {
        return planningExpert;
    }

    public void setPlanningExpert(String planningExpert)
    {
        this.planningExpert = planningExpert;
    }

}