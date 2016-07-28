package com.dezhonger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zwl on 2016/7/27.
 */
@Controller
public class Controller2 {
    @RequestMapping("/show")
    public Map<String, String> getMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value-1");
        map.put("key2", "value-2");
        return map;
    }
    @RequestMapping("/demo2/kong")
    public void kong() {
        return ;
    }
}
