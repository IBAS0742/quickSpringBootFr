package com.company.project.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

public class Workevent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 身份证号码
     */
    @ApiModelProperty(value = "身份证号码")
    @Column(name = "idcardNumber")
    private String idcardnumber;

    /**
     * 关联id（可能关联了某些事）
     */
    @ApiModelProperty(value = "关联id（可能关联了某些事）")
    @Column(name = "relationId")
    private String relationid;

    /**
     * 事件名称
     */
    @ApiModelProperty(value = "事件名称")
    private String name;

    /**
     * 事件发生时间
     */
    @ApiModelProperty(value = "事件发生时间")
    @Column(name = "createTime")
    private String createtime;

    /**
     * 备注信息
     */
    @ApiModelProperty(value = "备注信息")
    private String remark;

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
     * 获取身份证号码
     *
     * @return idcardNumber - 身份证号码
     */
    public String getIdcardnumber() {
        return idcardnumber;
    }

    /**
     * 设置身份证号码
     *
     * @param idcardnumber 身份证号码
     */
    public void setIdcardnumber(String idcardnumber) {
        this.idcardnumber = idcardnumber;
    }

    /**
     * 获取关联id（可能关联了某些事）
     *
     * @return relationId - 关联id（可能关联了某些事）
     */
    public String getRelationid() {
        return relationid;
    }

    /**
     * 设置关联id（可能关联了某些事）
     *
     * @param relationid 关联id（可能关联了某些事）
     */
    public void setRelationid(String relationid) {
        this.relationid = relationid;
    }

    /**
     * 获取事件名称
     *
     * @return name - 事件名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置事件名称
     *
     * @param name 事件名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取事件发生时间
     *
     * @return createTime - 事件发生时间
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * 设置事件发生时间
     *
     * @param createtime 事件发生时间
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取备注信息
     *
     * @return remark - 备注信息
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注信息
     *
     * @param remark 备注信息
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}