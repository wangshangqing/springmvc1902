package com.hy.springmvc.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @Auther: wangsq
 * @Date: 2020/9/16 11:25
 * @Description:
 */
@TableName("tb_classes")
public class Classes {
    private Integer cno;
    private String classname;


    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "cno=" + cno +
                ", classname='" + classname + '\'' +
                '}';
    }
}
