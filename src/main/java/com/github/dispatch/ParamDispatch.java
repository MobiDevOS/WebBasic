package com.github.dispatch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RequestMapping(value = "/testParam")
@Controller
public class ParamDispatch {


    @RequestMapping(value = "/requestGet")
    public void testRequetGetParam(@RequestParam(value = "username")String mUsreName,
                                   @RequestParam(value = "age") int age){
        System.out.println("username:"+mUsreName +"age:"+age);
    }
}
