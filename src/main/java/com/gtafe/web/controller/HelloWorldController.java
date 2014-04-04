package com.gtafe.web.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-4-4
 * Time: 下午5:52
 */
public class HelloWorldController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //1收集参数、验证参数
        //2绑定参数到命令对象
        //3将命令对象传入业务对象进行处理
        //4选择下一个页面
        ModelAndView mv = new ModelAndView();
        //添加模型数据 可以是任意的POJO对象
        mv.addObject("message", "Hello World!!");
        mv.setViewName("hello");
        return mv;
    }
}
