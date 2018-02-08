package com.github.dispatch;

import com.github.dispatch.bean.User;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

@SessionAttributes(types = {String.class} ,value = {"user"})
@Controller
public class IndexDispatch {

    @RequestMapping()
    public String index() {
        System.out.println("index");
        return "index";
    }

    /**
     * 测试get请求添加参数
     * int 类型可以添加defaultValue
     * 或者直接使用Integer
     * */
    @RequestMapping(value = "/requestGet")
    public String testRequetGetParam(@RequestParam(value = "username")String mUsreName,
                                   @RequestParam(value = "age") int age){
        System.out.println("username:"+mUsreName +"age:"+age);
        return "pojo";
    }

    //测试头文件
    @RequestMapping(value = "/requestHead")
    public String testRequetHead(@RequestHeader(value = "Accept-Language")String language ){
        System.out.println(language);
        return "resultPage";
    }

    //测试cookies
    @RequestMapping(value = "/requestCookies")
    public String testCookies(@CookieValue(value = "Webstorm-dabc2718", defaultValue = "") String language ){
        System.out.println(language);
        return "resultPage";
    }


    //测试cookies
    @RequestMapping(value = "/pojo")
    public String testCookies(User mUser){
        System.out.println(mUser.toString());
        return "resultPage";
    }

//
    //测试cookies
    @RequestMapping(value = "/sevletapi")
    public String testSevletApi(HttpServletRequest mRquestHandler, HttpServletResponse mResponse){

        return "resultPage";
    }


    //相当于给model 数据封装到request中
    @RequestMapping(value = "/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView = new ModelAndView("resultPage");
        modelAndView.addObject("time",new Date());
        return modelAndView;
    }


    //相当于其实入参对象应该是 BindingAawreModelAndMap 或者是model or MorderAndView 都是 相关类
    @RequestMapping(value = "/testMapping")
    public String testMap(Map<String,Object> map){
        map.put("list", Arrays.asList(new String[]{"tom","jack"}));
        return "resultPage";
    }


    //相当于其实入参对象应该是 BindingAawreModelAndMap 或者是model or MorderAndView 都是 相关类
    @RequestMapping(value = "/testSessionAttributes")
    public String testSessionAttributes(Map<String,Object> map){
        map.put("user", new User("zhujohnle","123"));
        map.put("lev", "goods");
        return "resultPage";
    }

}
