package com.github.dispatch;

import com.github.dispatch.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
}
