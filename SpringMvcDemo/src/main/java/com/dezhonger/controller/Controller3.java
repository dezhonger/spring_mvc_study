package com.dezhonger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zwl on 2016/7/27.
 */
@Controller
public class Controller3 {
    @ResponseBody
    @RequestMapping(value="/print")
    public String print() {
        String message = "ResponseBody zhujie";
        return message;
    }
    @RequestMapping(value = "/jisuan")
    public void sq(int n,  ModelMap M) {
        M.put("x", String.valueOf(n));
        n = (n * (n - 1)) / 2;
        M.put("ans", String.valueOf(n));
    }
}
