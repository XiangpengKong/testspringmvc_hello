package com.peng.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by KING on 2017/8/6.
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "/test")
    public String test(Model model){
        model.addAttribute("name","张三");
        return "success";
    }

    @RequestMapping(value = "/test1")
    public ModelAndView test1(){
        ModelAndView result = new ModelAndView();
        result.setViewName("success");
        result.addObject("name","李四");
        return result;
    }
}
