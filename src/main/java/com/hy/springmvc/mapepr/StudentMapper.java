package com.hy.springmvc.mapepr;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.springmvc.SqlSelect;
import com.hy.springmvc.pojo.Student;
import org.apache.ibatis.annotations.*;

/**
 * @Auther: wangsq
 * @Date: 2020/9/16 10:22
 * @Description:
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student>{

    @Results({
            @Result(column ="stuno",property ="stuno"),
            @Result(column = "stu_name",property ="stuName"),
            @Result(column = "classname",property = "classes.classname")
    })
    @SelectProvider(type = SqlSelect.class,method = "query")
    public IPage<Student> query(Page<Student> page,@Param("stu") Student student);
}

