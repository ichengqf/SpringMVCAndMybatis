package cn.hobocat.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.hobocat.model.User;


@Controller
@RequestMapping(value = "/api_cat")
public class TestController  {
    @RequestMapping(path = "/add")
    public ModelAndView save(@ModelAttribute User user,HttpServletRequest request, HttpServletResponse response) {
        System.out.println(user.getId()+":"+user.getName());
        Map<String, Object> map=new HashMap<String,Object>();
         map.put("id", user.getId());
         map.put("name", user.getName());


        return new ModelAndView("test.jsp", "User", map);
    }

}