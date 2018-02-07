package com.github.dispatch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/testrequet")
@Controller
public class CommonDispatch
{


    @RequestMapping(value = "/requestGet")
    public String toJsp() {
        System.out.println("resultGET");
        return "resultPage";
    }

    @RequestMapping(value = "/requestPost", method = RequestMethod.POST )
    public String requestPost() {
        System.out.println("requetPost");
        return "resultPage";
    }


    //因为浏览器不支持put 和 delete 只有get 和post 如果有特殊需要的话 需要在web.xml配置mapinginflter 用于把post 转为get
    @RequestMapping(value = "/requestPut/{id}", method = RequestMethod.PUT )
    public String requestPut(@PathVariable("id") int id) {
        System.out.println("requestPut"+id);
        return "resultPage";
    }

    //参数和请求头 条件之间都是并的关系 头部参数必须要真实的头部参数
    @RequestMapping(value = "/requestPost", method = RequestMethod.GET ,params =
            {"username","password=!20"},headers = {""})
    public String requestParams() {
      System.out.println("resultPage");
      return "resultPage";
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


    // 删除博客文章 get 指定id PathVariable 替换参数
    @RequestMapping("/delete/{id}")
    public String deleteBlog(@PathVariable("id") int id) {

        return "index";
    }

}
