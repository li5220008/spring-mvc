package com.gtafe.web.controller;

import com.gtafe.dto.Message;
import com.gtafe.model.User;
import com.gtafe.service.IUserService;
import com.gtafe.utils.WebUtils;
import com.gtafe.web.formbean.LoginForm;
import com.gtafe.web.formbean.RegisterForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.jar.Attributes;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-4-17
 * Time: 上午11:28
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService service;

    @RequestMapping(value = {"/register"}, method = RequestMethod.GET)
    public String register() {
        return "/user/register";
    }

    @RequestMapping(value = {"/registerDo"}, method = RequestMethod.POST)
    public ModelAndView registerPost(@Valid RegisterForm loginForm, Errors errors, RedirectAttributes attr) {
        ModelAndView mv = new ModelAndView();
        if (errors.hasErrors()) {
            mv.setViewName("register");
            mv.addObject("form", loginForm);
        } else {
            User user = new User();
            WebUtils.copyBean(loginForm, user);
            System.out.println(user);
            service.addUser(user);
            attr.addFlashAttribute("message", "注册成功！");
            mv.setViewName("redirect:/message");
        }
        return mv;
    }

    @RequestMapping("/delete")
    public ModelAndView delete() {
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping("/update")
    public ModelAndView update() {
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping("/list")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView().addObject(new LoginForm());
    }

    @RequestMapping(value = {"/loginDo"}, method = RequestMethod.POST)
    public String loginDo(@Valid @ModelAttribute("loginForm") LoginForm loginForm, BindingResult result,Model model, RedirectAttributes attr,HttpSession session) {
        if (result.hasErrors()) {
            return "redirect:login";
        } else {
            User user = service.login(loginForm.getUsername(), loginForm.getPassword());
            if(user != null){
                session.setAttribute("account", user);
                return "redirect:/index";
            }
            Message message = new Message();
            message.setMessage("用户不存在！");
            attr.addFlashAttribute("message",message);
            return "redirect:/message";
        }
    }
    @RequestMapping(value = {"/logout"},method = RequestMethod.GET)
    public String logout(RedirectAttributes attr, HttpSession session){
        if(session !=null){
            session.removeAttribute("account");
        }
        //注销成功，跳到全局消息显示页面，显示注销成功消息，并控制消息显示页面过3秒后跳转到首页
        Message message = new Message();
        message.setMessage("成功退出！");
        message.setTime("2");
        message.setUri("/index");
        attr.addFlashAttribute("message", message);
        return "redirect:/message";
    }

    @RequestMapping("/blog")
    public ModelAndView blog() {
        ModelAndView mv = new ModelAndView();
        return mv;
    }
}
