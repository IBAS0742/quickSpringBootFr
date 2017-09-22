package com.company.project.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 所属公司名字
     */
    @ApiModelProperty(value = "所属公司名字")
    @Column(name = "companyId")
    private String companyid;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String descript;

    /**
     * 部门名字
     */
    @ApiModelProperty(value = "部门名字")
    private String name;

    /**
     * 负责人id
     */
    @ApiModelProperty(value = "负责人id")
    private String header;

    /**
     * 父部门（顶级为空）
     */
    @ApiModelProperty(value = "父部门（顶级为空）")
    @Column(name = "parentId")
    private String parentid;

    /**
     * 联系电话（负责人的？）
     */
    @ApiModelProperty(value = "联系电话（负责人的？）")
    private String telephone;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取所属公司名字
     *
     * @return companyId - 所属公司名字
     */
    public String getCompanyid() {
        return companyid;
    }

    /**
     * 设置所属公司名字
     *
     * @param companyid 所属公司名字
     */
    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    /**
     * 获取描述
     *
     * @return descript - 描述
     */
    public String getDescript() {
        return descript;
    }

    /**
     * 设置描述
     *
     * @param descript 描述
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }

    /**
     * 获取部门名字
     *
     * @return name - 部门名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置部门名字
     *
     * @param name 部门名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取负责人id
     *
     * @return header - 负责人id
     */
    public String getHeader() {
        return header;
    }

    /**
     * 设置负责人id
     *
     * @param header 负责人id
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * 获取父部门（顶级为空）
     *
     * @return parentId - 父部门（顶级为空）
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * 设置父部门（顶级为空）
     *
     * @param parentid 父部门（顶级为空）
     */
    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取联系电话（负责人的？）
     *
     * @return telephone - 联系电话（负责人的？）
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置联系电话（负责人的？）
     *
     * @param telephone 联系电话（负责人的？）
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}