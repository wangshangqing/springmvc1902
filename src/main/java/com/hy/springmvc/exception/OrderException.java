package com.hy.springmvc.exception;

/**
 * @Auther: wangsq
 * @Date: 2020/9/9 10:19
 * @Description:
 */
public class OrderException extends Exception{

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public OrderException(){

    }

    public OrderException(String msg){
        this.msg=msg;
    }
}
