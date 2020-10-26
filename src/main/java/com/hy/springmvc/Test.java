package com.hy.springmvc;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.springmvc.pojo.Student;
import com.hy.springmvc.service.StudentSerive;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Auther: wangsq
 * @Date: 2020/9/4 09:54
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        StudentSerive studentSerive=applicationContext.getBean(StudentSerive.class);

        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("stu_name","王五");

        Page<Student> page=new Page(2,3);
        List<Student> page1= studentSerive.list();
        for(Student student:page1){
            System.out.println(student.getStuName());

        }
    }
}
