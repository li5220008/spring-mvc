package com.gtafe.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-4-17
 * Time: 上午11:28
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/register")
    public ModelAndView register(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping("/registerPost")
    public ModelAndView registerPost(HttpServletRequest request,HttpServletResponse response){

        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping("/delete")
    public ModelAndView delete(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping("/update")
    public ModelAndView update(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping("/blog")
    public ModelAndView blog(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }
}
