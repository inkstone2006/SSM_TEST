package com.li.stone.springmvc.web.controller;

import com.li.stone.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */

@Controller
public class RegController {

    @RequestMapping("/toReg")
    public String toRegView(){
        return "reg";
    }

    @RequestMapping("/doReg")
    public String doReg(@RequestParam("username") String username,@RequestParam("password") String password){
        System.out.println("插入数据");
        System.out.println(username + "," +password);
        return "index";
    }
/*    public String doReg(HttpServletRequest req){
        System.out.println("插入数据");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username + "," +password);
        return "index";
    }
*/
    @RequestMapping("/selectOne")
    public String selectOne(Model model, @RequestParam("uid") int uid){
        System.out.println("接受到了参数: uid=" + uid);
        String username = "tomson";
        model.addAttribute("myusername",username);
        return "selectOne";
    }
/*
    @RequestMapping("/selectAll")
    public String selectAll(Model mode){
        List<User>  list = new ArrayList<User>();
        for(int i = 1; i <= 50; i++){
            User u = new User();
            u.setId(i);
            u.setName("tom"+i);
            u.setAge(i % 20);
            list.add(u);
        }
        mode.addAttribute("allUsers",list);
        return "userList";
    }
*/


    @RequestMapping("/selectAll")
    public String selectAll(Model mode){
        mode.addAttribute("allUsers",DB.findAll());
        return "userList";
    }

    @RequestMapping("/deleteOne")
    public String deleteOne(@RequestParam("uid") int uid){
        DB.delete(uid);
        return "redirect:/selectAll";
    }

    @RequestMapping("/editOne")
    public String editOne(Model m,@RequestParam("uid") int uid){
        User u = DB.select(uid);
        m.addAttribute("user",u);
        return "editUser";
    }

    @RequestMapping("/updateOne")
    public String updateOne(User user){
        DB.update(user);
        return "redirect:/selectAll";
    }

    @RequestMapping("/toLogin")
    public String toLoginView(){
        return "login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(User u, HttpSession s){
        s.setAttribute("user",u);
        return "index";
    }
}
