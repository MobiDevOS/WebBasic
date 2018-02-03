package com.github.dispatch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainDispatch
{

    @RequestMapping(value = "/")
    public String toJsp() {
        System.out.println("index");
        return "index";
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String toHtml() {
        System.out.println("index.html");
        return "index";
    }

    @RequestMapping("/helloworld")
    public String hello(){
        System.out.println("hello world");
        return "success";
    }


    // 删除博客文章 get 指定id
    @RequestMapping("/delete/{id}")
    public String deleteBlog(@PathVariable("id") int id) {

        return "index";
    }

}
