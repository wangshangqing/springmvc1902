package com.hy.springmvc;

import com.hy.springmvc.pojo.Student;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: wangsq
 * @Date: 2020/9/21 16:58
 * @Description:
 */
public class SqlSelect {

    public String query(@Param("stu")Student student){
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("select * from tb_student s inner join tb_classes c on s.classno=c.cno where 1=1 ");
        if(student!=null && student.getStuName()!=null){
            stringBuffer.append(" and stu_name='"+student.getStuName()+"'");
        }
        if(student!=null && student.getClassno()!=null){
            stringBuffer.append(" and classno="+student.getClassno());
        }
        if(student!=null && student.getSex()!=null && !"".equals(student.getSex())){
            stringBuffer.append(" and sex='"+student.getSex()+"'");
        }
        return stringBuffer.toString();
    }
}
