package com.qq.springbootdemo.controller;

import com.qq.springbootdemo.bean.Person;
import com.qq.springbootdemo.bean.Result;
import com.qq.springbootdemo.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试的DemoController
 * <p>
 * Created by cliffyan on 2017/7/15.
 */
@RestController
@RequestMapping("/demo")
public class ControllerDemo {
    private static final Logger log = LoggerFactory.getLogger(ControllerDemo.class);


    @RequestMapping("/index")
    public Result index() {
        Result result=new Result();
        result.setCode(0);
        result.setMsg(Constants.STR_SUCCESS);

        Person person=new Person();
        person.setId(10001);
        person.setName("qq");
        person.setAddress("shenzhen");
        result.setData(person);
        log.info("index request ");
        return result;
    }

}
