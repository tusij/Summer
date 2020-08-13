package com.jiwei.system.pojo;

import java.io.Serializable;

/**
 * @title: CookieUtil
 * @Author 赖志宇
 * @Description TODO 缺少注解验证
 * @Date: 2020/8/14
 * @Version 1.0
 */
public class Task implements Serializable {
    private String id;
    private String name;
    private String sex;
    private String telephone;
    private String address;
    private String description;
    private String computerType;
    private String status;
    private String repairMethod;
    private String startDate;
    private String endDate;

    public Task() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public String getComputerType() {
        return computerType;
    }

    public String getStatus() {
        return status;
    }

    public String getRepairMethod() {
        return repairMethod;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRepairMethod(String repairMethod) {
        this.repairMethod = repairMethod;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                ", computerType='" + computerType + '\'' +
                ", status='" + status + '\'' +
                ", repairMethod='" + repairMethod + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
