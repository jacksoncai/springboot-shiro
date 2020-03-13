package com.csd.controller;

import com.csd.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


//登录拦截
@Controller
//为了每一页有用户名回显,将username存入session域
@SessionAttributes("username")
public class LoginController {
    @Autowired
    UserService userService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/login")
    public String toLogin()
    {
        return "login";
    }
    @GetMapping("/test")
    public String test()
    {
        return "test";
    }


    //用post提高安全性
    @PostMapping("/toLogin")
    public String equipLossTest(
             @RequestParam("uName")String uName,
             @RequestParam("password")String password,Model model)
        {
        //获取当前用户
        Subject subject = SecurityUtils.getSubject();

        logger.info("用户名--------"+uName+"密码--------"+password);
            //封装用户的登录信息
        UsernamePasswordToken token = new UsernamePasswordToken(uName,password);

        try{
            //将令牌传入
            subject.login(token);
            model.addAttribute("msg",uName+"欢迎您!");
            model.addAttribute("username",uName);
/*
            session.setAttribute("username",uName);
*/

            return "main";
        }
        catch (UnknownAccountException e){//没有此用户
            model.addAttribute("msg","未找到此用户名");
            return "login";
        }catch (IncorrectCredentialsException e){//密码错误
            model.addAttribute("msg","密码错误");
            return "login";
        }

    }




}
