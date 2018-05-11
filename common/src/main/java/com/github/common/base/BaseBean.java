package com.github.common.base;

import com.alibaba.fastjson.JSON;
import com.github.common.annotation.Ignore;

import java.io.Serializable;
import java.util.Date;

public class BaseBean implements Serializable {

    @Ignore
    private static final long serialVersionUID = 592010556670321531L;
    private String createUser;
    private Date createTime;
    @Ignore
    private String modifyUser;
    @Ignore
    private Date modifyTime;

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "BaseBean{" +
                "createUser='" + createUser + '\'' +
                ", createTime=" + createTime +
                ", modifyUser='" + modifyUser + '\'' +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
