package com.hy.springmvc;

import java.util.List;

/**
 * @Auther: wangsq
 * @Date: 2020/9/27 16:49
 * @Description:
 */
public class LayuiData {

    private Integer code;
    private String msg;
    private Integer count;
    private List data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
