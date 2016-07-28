package com.dezhonger.controller;

import com.dezhonger.object.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by Administrator on 2016/7/28.
 */
@Controller
@RequestMapping("/bbtForum.do")
@SessionAttributes("currUser") //①将ModelMap中属性名为currUser的属性
public class BbtForumController {

//    @RequestMapping(params = "method=listBoardTopic")
//    public String listBoardTopic(int topicId,User user) {
//        System.out.println("topicId:"+topicId);
//        System.out.println("user:"+user);
//        System.out.println("call listBoardTopic method.");
//        return "listTopic";
//    }

    @RequestMapping(params = "method=listBoardTopic")
    public String listBoardTopic(@RequestParam("id")int topicId, User user,
                                 ModelMap model) {
        System.out.println("topicId:" + topicId);
        System.out.println("user:" + user);
        model.addAttribute("currUser",user); //②向ModelMap中添加一个属性
        return "listTopic";
    }

}
