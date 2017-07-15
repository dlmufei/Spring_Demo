package com.example.demo.controller;

import com.example.demo.bean.Result;
import com.example.demo.utils.Constants;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试的DemoController
 * <p>
 * Created by cliffyan on 2017/7/15.
 */
@RestController
public class ControllerDemo {

    @RequestMapping("/index")
    public Result index() {
        Result result=new Result();
        result.setCode(0);
        result.setMsg(Constants.STR_SUCCESS);
        result.setData("data:data");
        return result;

    }

}
