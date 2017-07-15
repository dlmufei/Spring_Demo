package com.qq.springbootdemo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

/**
 * jsonp支持
 * <p>
 * Created by cliffyan on 2017/7/16.
 */
@ControllerAdvice(basePackages = {"com.qq.springbootdemo.controller"})
public class JSONPController extends AbstractJsonpResponseBodyAdvice {
    public JSONPController() {
        super("callback", "jsonp");
    }
}
