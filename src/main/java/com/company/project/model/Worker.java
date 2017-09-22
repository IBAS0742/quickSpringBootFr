package com.company.project.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

public class Worker {
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
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String name;

    /**
     * 公司id
     */
    @ApiModelProperty(value = "公司id")
    @Column(name = "companyId")
    private String companyid;

    /**
     * 部门id
     */
    @ApiModelProperty(value = "部门id")
    @Column(name = "departmentId")
    private String departmentid;

    /**
     * 职位
     */
    @ApiModelProperty(value = "职位")
    private String role;

    /**
     * 有效期（好像是身份证有效时间）
     */
    @ApiModelProperty(value = "有效期（好像是身份证有效时间）")
    @Column(name = "vailPeriod")
    private String vailperiod;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private Short gender;

    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    private Short age;

    /**
     * 出生日期
     */
    @ApiModelProperty(value = "出生日期")
    private String birthday;

    /**
     * 民族
     */
    @ApiModelProperty(value = "民族")
    private String peple;

    /**
     * 婚姻状态
     */
    @ApiModelProperty(value = "婚姻状态")
    @Column(name = "maritalStatus")
    private String maritalstatus;

    /**
     * 最高学历
     */
    @ApiModelProperty(value = "最高学历")
    private String education;

    /**
     * 所学专业
     */
    @ApiModelProperty(value = "所学专业")
    private String major;

    /**
     * 毕业学校
     */
    @ApiModelProperty(value = "毕业学校")
    private String school;

    /**
     * 工号
     */
    @ApiModelProperty(value = "工号")
    @Column(name = "workerNumber")
    private String workernumber;

    /**
     * 联系电话
     */
    @ApiModelProperty(value = "联系电话")
    private String phone;

    /**
     * 身份证地址
     */
    @ApiModelProperty(value = "身份证地址")
    private String address;

    /**
     * 紧急联系人
     */
    @ApiModelProperty(value = "紧急联系人")
    @Column(name = "emerContact")
    private String emercontact;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

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
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取公司id
     *
     * @return companyId - 公司id
     */
    public String getCompanyid() {
        return companyid;
    }

    /**
     * 设置公司id
     *
     * @param companyid 公司id
     */
    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    /**
     * 获取部门id
     *
     * @return departmentId - 部门id
     */
    public String getDepartmentid() {
        return departmentid;
    }

    /**
     * 设置部门id
     *
     * @param departmentid 部门id
     */
    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    /**
     * 获取职位
     *
     * @return role - 职位
     */
    public String getRole() {
        return role;
    }

    /**
     * 设置职位
     *
     * @param role 职位
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 获取有效期（好像是身份证有效时间）
     *
     * @return vailPeriod - 有效期（好像是身份证有效时间）
     */
    public String getVailperiod() {
        return vailperiod;
    }

    /**
     * 设置有效期（好像是身份证有效时间）
     *
     * @param vailperiod 有效期（好像是身份证有效时间）
     */
    public void setVailperiod(String vailperiod) {
        this.vailperiod = vailperiod;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public Short getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(Short gender) {
        this.gender = gender;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Short getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Short age) {
        this.age = age;
    }

    /**
     * 获取出生日期
     *
     * @return birthday - 出生日期
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期
     *
     * @param birthday 出生日期
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取民族
     *
     * @return peple - 民族
     */
    public String getPeple() {
        return peple;
    }

    /**
     * 设置民族
     *
     * @param peple 民族
     */
    public void setPeple(String peple) {
        this.peple = peple;
    }

    /**
     * 获取婚姻状态
     *
     * @return maritalStatus - 婚姻状态
     */
    public String getMaritalstatus() {
        return maritalstatus;
    }

    /**
     * 设置婚姻状态
     *
     * @param maritalstatus 婚姻状态
     */
    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    /**
     * 获取最高学历
     *
     * @return education - 最高学历
     */
    public String getEducation() {
        return education;
    }

    /**
     * 设置最高学历
     *
     * @param education 最高学历
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * 获取所学专业
     *
     * @return major - 所学专业
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置所学专业
     *
     * @param major 所学专业
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * 获取毕业学校
     *
     * @return school - 毕业学校
     */
    public String getSchool() {
        return school;
    }

    /**
     * 设置毕业学校
     *
     * @param school 毕业学校
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * 获取工号
     *
     * @return workerNumber - 工号
     */
    public String getWorkernumber() {
        return workernumber;
    }

    /**
     * 设置工号
     *
     * @param workernumber 工号
     */
    public void setWorkernumber(String workernumber) {
        this.workernumber = workernumber;
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取身份证地址
     *
     * @return address - 身份证地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置身份证地址
     *
     * @param address 身份证地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取紧急联系人
     *
     * @return emerContact - 紧急联系人
     */
    public String getEmercontact() {
        return emercontact;
    }

    /**
     * 设置紧急联系人
     *
     * @param emercontact 紧急联系人
     */
    public void setEmercontact(String emercontact) {
        this.emercontact = emercontact;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
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