package com.company.project.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 公司名称
     */
    @ApiModelProperty(value = "公司名称")
    private String name;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String descript;

    /**
     * 负责人id
     */
    @ApiModelProperty(value = "负责人id")
    private String header;

    /**
     * 父公司id（顶级则为空）
     */
    @ApiModelProperty(value = "父公司id（顶级则为空）")
    @Column(name = "parentId")
    private String parentid;

    /**
     * 公司电话
     */
    @ApiModelProperty(value = "公司电话")
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
     * 获取公司名称
     *
     * @return name - 公司名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置公司名称
     *
     * @param name 公司名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取父公司id（顶级则为空）
     *
     * @return parentId - 父公司id（顶级则为空）
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * 设置父公司id（顶级则为空）
     *
     * @param parentid 父公司id（顶级则为空）
     */
    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取公司电话
     *
     * @return telephone - 公司电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置公司电话
     *
     * @param telephone 公司电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}