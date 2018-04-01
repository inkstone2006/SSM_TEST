package com.li.stone.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
 */

@Controller
public class HomeController {

    /**
     * 打开主页
     */
    @RequestMapping("/home")
    public String openHome(){
        System.out.println("hello world");
        return "index";
    }

    @RequestMapping("/home2")
    public String openHome2(){
        System.out.println("how are you?");
        return "index2";
    }
}
