package com.jiwei.system.pojo;

import java.io.Serializable;

/**
 * @title: UserLogin
 * @Author 赖志宇
 * @Description TODO 缺少注解验证
 * @Date: 2020/8/14
 * @Version 1.0
 */
public class UserLogin implements Serializable {
    private String telephone;
    private String code;

    public UserLogin() {
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "telephone='" + telephone + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
