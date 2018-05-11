package com.github.common.base;

import com.alibaba.fastjson.JSON;
import com.github.common.annotation.Ignore;

import java.io.Serializable;

public abstract class AbstractBean implements Serializable {

    @Ignore
    private static final long serialVersionUID = 592010556670321531L;

    public String toJsonString() {
        return JSON.toJSONString(this);
    }
}
