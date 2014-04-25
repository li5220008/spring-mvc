package com.gtafe.web.controller;

import com.gtafe.utils.ImgUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

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
    @RequestMapping("/randomImg")
    public void randomImg(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //指定输入内容
        resp.setContentType("image/jpeg");
        //控制浏览器不要缓存
        resp.setDateHeader("expries",-1);
        resp.setHeader("Cache-Control","no-cache");
        resp.setHeader("Pragma","no-cache");
        ImgUtils.randomImg(resp.getOutputStream());
    }
}
