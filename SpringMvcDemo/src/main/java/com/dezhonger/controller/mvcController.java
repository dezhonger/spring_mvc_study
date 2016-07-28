package com.dezhonger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zwl on 2016/7/12.
 */
@Controller
@RequestMapping("/mvc")
public class mvcController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    @RequestMapping("/cal")
    public ModelAndView cal() {
        return new ModelAndView("cal", "message", "this is");
    }
}
