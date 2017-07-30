package com.qq.springbootdemo;

import com.qq.springbootdemo.filter.MyFilter;
import com.qq.springbootdemo.filter.MyFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Boot自动添加了OrderedCharacterEncodingFilter和HiddenHttpMethodFilter，并且我们可以自定义Filter
 * 两种方式:
 * (1)通过Configuration 代码的形式添加
 * (2)通过注解的形式:
 *      @Order(1)
 *      @WebFilter(filterName = "MyFilter", urlPatterns = "/*")
 * <p>
 * Created by cliffyan on 2017/7/30.
 */
@Configuration
public class WebConfiguration {

    @Bean
    public FilterRegistrationBean myFilter1FilterRegistration() {

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter());//将自定义Filter加入过滤链

        registration.addUrlPatterns("/*");
        registration.setName("MyFilter");
        registration.setOrder(1);

        registration.addInitParameter("paramName", "paramValue");
        return registration;
    }

    @Bean
    public FilterRegistrationBean myFilter2FilterRegistration() {

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter2());//将自定义Filter加入过滤链

        registration.addUrlPatterns("/*");
        registration.setName("MyFilter2");
        registration.setOrder(2);

        registration.addInitParameter("paramName", "paramValue");

        return registration;
    }

}
