package com.dezhonger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zwl on 2016/7/12.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "redirect:dezhonger";
    }
    @RequestMapping(value = "/dezhonger", method = RequestMethod.GET)
    public String dezhonger() {
        return "dezhonger";
    }


}