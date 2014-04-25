package com.gtafe.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

/**
 * Desc: 全局入口
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-4-24
 * Time: 上午8:45
 */
@Controller
public class GlobalController {
    @RequestMapping("/index")
    public String index(Model model, HttpSession session) {
        model.addAttribute("account",session.getAttribute("account"));
        return "index";
    }

    @RequestMapping("/message")
    public String message() {
        return "message";
    }
}
