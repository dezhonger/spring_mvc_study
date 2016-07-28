package com.dezhonger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/7/28.
 */
@Controller
public class Controller4 {

    @RequestMapping(value = "/req")
    public String test(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request);
        System.out.println(response);
        return "index";
    }
}
