package com.company.project.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

public class Workcontact {
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
     * 到职时间
     */
    @ApiModelProperty(value = "到职时间")
    @Column(name = "startTime")
    private String starttime;

    /**
     * 离职时间
     */
    @ApiModelProperty(value = "离职时间")
    @Column(name = "endTime")
    private String endtime;

    /**
     * 合同生效日期
     */
    @ApiModelProperty(value = "合同生效日期")
    @Column(name = "validStartTime")
    private String validstarttime;

    /**
     * 合同到期时间
     */
    @ApiModelProperty(value = "合同到期时间")
    @Column(name = "validEndTime")
    private String validendtime;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
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
     * 获取到职时间
     *
     * @return startTime - 到职时间
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * 设置到职时间
     *
     * @param starttime 到职时间
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取离职时间
     *
     * @return endTime - 离职时间
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * 设置离职时间
     *
     * @param endtime 离职时间
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取合同生效日期
     *
     * @return validStartTime - 合同生效日期
     */
    public String getValidstarttime() {
        return validstarttime;
    }

    /**
     * 设置合同生效日期
     *
     * @param validstarttime 合同生效日期
     */
    public void setValidstarttime(String validstarttime) {
        this.validstarttime = validstarttime;
    }

    /**
     * 获取合同到期时间
     *
     * @return validEndTime - 合同到期时间
     */
    public String getValidendtime() {
        return validendtime;
    }

    /**
     * 设置合同到期时间
     *
     * @param validendtime 合同到期时间
     */
    public void setValidendtime(String validendtime) {
        this.validendtime = validendtime;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}