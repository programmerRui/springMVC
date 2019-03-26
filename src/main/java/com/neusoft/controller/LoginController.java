package com.neusoft.controller;
import com.neusoft.po.User;
import com.neusoft.utils.DateConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;

@Controller
@SessionAttributes({"user"})
public class LoginController {
    @ModelAttribute
    public User populateModel(){
        User user=new User();
        user.setLove("学习");
        return user;
    }
    @RequestMapping("/login.do")
    public String login(User user, ModelMap map){
        //存到request
        map.put("user",user);
        DateConverter dateConverter=new DateConverter();
        Date convert = dateConverter.convert("1998-12-11");
        System.out.println(convert);
        //map.addAttribute("password",user.getPassword());
        //打印输出
        //System.out.println(user.getUsername()+","+user.getPassword());
        return "index";
    }
}
