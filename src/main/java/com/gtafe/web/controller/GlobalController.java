package com.gtafe.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Desc: 全局入口
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-4-24
 * Time: 上午8:45
 */
@Controller
public class GlobalController {
    @RequestMapping("index")
    public String index() {
        return "index";
    }
    @RequestMapping("message")
    public String message() {
        return "message";
    }
}
