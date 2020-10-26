package com.hy.springmvc.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.springmvc.LayuiData;
import com.hy.springmvc.Utils;
import com.hy.springmvc.exception.OrderException;
import com.hy.springmvc.pojo.Classes;
import com.hy.springmvc.pojo.Student;
import com.hy.springmvc.service.ClassesSerive;
import com.hy.springmvc.service.StudentSerive;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: wangsq
 * @Date: 2020/8/29 11:16
 * @Description:
 */
@Api
@Controller
@RequestMapping("/stu")
public class TestController{
    @Autowired
    private StudentSerive studentSerive;

    @Autowired
    private ClassesSerive classesSerive;

    @GetMapping(value = "queryAll.do")
    @ResponseBody
    @ApiOperation(httpMethod = "get",value = "根据学生ID查询一个学生")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "查询成功",response = Student.class)
    })
    public Student queryAll(@ApiParam(required = true,name = "id",value = "学生ID")@RequestParam String id){
        return studentSerive.getById(id);
    }

    @GetMapping("query")
    @ResponseBody
    public LayuiData query(Student student,Integer page,Integer limit){
        LayuiData layuiData=new LayuiData();
        IPage page1=studentSerive.query(page,limit,student);
        layuiData.setCode(0);
        layuiData.setMsg("");
        layuiData.setCount(Integer.parseInt(Long.toString(page1.getTotal())));
        layuiData.setData(page1.getRecords());
        return layuiData;
    }

    @GetMapping("queryClass")
    @ResponseBody
    public List<Classes> queryClass(){
        return classesSerive.list();
    }

    /**
     * 根据ID删除一条
     * @param id
     * @return
     */
    @GetMapping("del")
    @ResponseBody
    public String del(String id){
        try {
            studentSerive.removeById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return Utils.delIsError;
        } finally {
        }
        return Utils.delIsSuccess;
    }


    /**
     * 批量删除
     * @param ids
     * @return
     */
    @GetMapping("delIds")
    @ResponseBody
    public String delIds(String[] ids){
        try {
            studentSerive.removeByIds(Arrays.asList(ids));
        } catch (Exception e) {
            e.printStackTrace();
            return Utils.delIsError;
        } finally {
        }
        return Utils.delIsSuccess;
    }

    /**
     * 保存学生
     * @param student
     * @return
     */
    @GetMapping("save")
    @ResponseBody
    public String save(Student student){
        try {
            studentSerive.save(student);
        } catch (Exception e) {
            e.printStackTrace();
            return Utils.delIsError;
        } finally {
        }
        return Utils.delIsSuccess;
    }

    /**
     * 根据ID查询
     * @param id
     * @return
     * @throws OrderException
     */
    @GetMapping(value = "queryById")
    @ResponseBody
    public Student queryById(String id) throws OrderException {
        return studentSerive.getById(id);
    }
}
