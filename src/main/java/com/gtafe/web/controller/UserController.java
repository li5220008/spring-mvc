package com.gtafe.web.controller;

import com.gtafe.dto.Message;
import com.gtafe.model.User;
import com.gtafe.service.IUserService;
import com.gtafe.utils.DateUtils;
import com.gtafe.utils.WebUtils;
import com.gtafe.web.formbean.LoginForm;
import com.gtafe.web.formbean.RegisterForm;
import com.gtafe.web.formbean.UpdateForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.text.ParseException;
import java.util.List;
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
            Message message = new Message();
            message.setMessage("恭喜你，注册成功！");
            message.setUri("/user/login");
            attr.addFlashAttribute("message",message);
            mv.setViewName("redirect:/message");
        }
        return mv;
    }

    @RequestMapping("/delete")
    public String delete(int id) {
        service.deleteUser(id);
        return "redirect:/user/list";
    }

    @RequestMapping("/update")
    public String update(int id,Model model) {
        User user = service.selectUserByID(id);
        UpdateForm form = new UpdateForm();
        WebUtils.copyBean(user,form);
        form.setPassword("");
        try {
            form.setBirthday(DateUtils.formatDate(user.getBirthday()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        model.addAttribute("form",form);
        return "/user/update";
    }

    @RequestMapping("/updateDo")
    public String updateDo(Model model, UpdateForm form) {
        User user = new User();
        WebUtils.copyBean(form,user);
        service.updateUser(user);
        return "redirect:/user/list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<User> allUser = service.findAllUser();
        model.addAttribute("users",allUser);
        return "/user/list";
    }

    @RequestMapping("/info")
    public @ResponseBody User info(int id,Model model) {
        User user = service.selectUserByID(id);
        return user;
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
