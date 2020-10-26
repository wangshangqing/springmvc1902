package com.hy.springmvc.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hy.springmvc.mapepr.StudentMapper;
import com.hy.springmvc.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: wangsq
 * @Date: 2020/9/4 09:41
 * @Description:
 */
@Service
public class StudentSerive extends ServiceImpl<StudentMapper,Student>{

    @Autowired
    public StudentMapper studentMapper;

    /**
     * 查询所有
     * @param page
     * @param limit
     * @return
     */
    public IPage query(Integer page,Integer limit,Student student){
        return studentMapper.query(new Page<Student>(page,limit),student);
    }
}
