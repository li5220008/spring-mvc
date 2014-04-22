package com.gtafe.web.controller;

import com.gtafe.utils.WebUtils;
import com.gtafe.web.formbean.LoginForm;
import com.gtafe.web.formbean.RegisterForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-4-17
 * Time: 上午11:28
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value={"/register"}, method = RequestMethod.GET)
    public String register(){
        return "/user/register";
    }

    @RequestMapping(value={"/registerDo"}, method = RequestMethod.POST)
    public ModelAndView registerPost(@Valid RegisterForm loginForm, Errors errors) {
        ModelAndView mv = new ModelAndView();

        if(errors.hasErrors()){
            mv.setViewName("/user/register");
            mv.addObject("form",loginForm);
        }else {
            mv.setViewName("/user/login");
        }
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
        mv.addObject(new LoginForm());
        return mv;
    }

    @RequestMapping(value = {"/loginDo"}, method = RequestMethod.POST)
    public String loginDo(@Valid LoginForm form, BindingResult result) {
        if (result.hasErrors()) {
            return "/user/login";
        } else {
            return "/user/register";
        }

        /*ModelAndView mv = new ModelAndView();
        if (errors.hasErrors()) {
            mv.addObject(form);
            mv.setViewName("/user/login");
        }else {
            mv.setViewName("/user/register");
        }
        return mv;*/
    }

    @RequestMapping("/blog")
    public ModelAndView blog(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }
}
