package com.hy.springmvc.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: wangsq
 * @Date: 2020/9/9 10:16
 * @Description:
 */
public class ExceptionHandler implements HandlerExceptionResolver{
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        //1、判断异常是具体哪一种异常
        String msg="";
        if(e instanceof OrderException){
            OrderException orderException=(OrderException)e;
            msg=orderException.getMsg();
        }
        //2、发短信和邮件通知相关人员


        //3、跳转到友好页面
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("error",msg);
        modelAndView.setViewName("/500");
        return modelAndView;
    }
}
