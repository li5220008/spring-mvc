package com.gtafe.web.controller;

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
@SessionAttributes({"account"})
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
            mv.setViewName("/user/register");
            mv.addObject("form", loginForm);
        } else {
            User user = new User();
            WebUtils.copyBean(loginForm, user);
            System.out.println(user);
            service.addUser(user);
            attr.addFlashAttribute("message", "注册成功！");
            mv.setViewName("redirect:message");
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
    public String loginDo(@Valid LoginForm form, BindingResult result,Model model, RedirectAttributes attr) {
        if (result.hasErrors()) {
            return "redirect:/user/login";
        } else {
            User user = service.login(form.getUsername(), form.getPassword());
            if(user != null){
                model.addAttribute("account",user);
                return "redirect:index";
            }
            attr.addFlashAttribute("message", "登陆成功！");
            //attr.addAttribute("message","恭喜你注册成！");
            return "redirect:index";
        }
    }

    @RequestMapping("/blog")
    public ModelAndView blog() {
        ModelAndView mv = new ModelAndView();
        return mv;
    }
}
