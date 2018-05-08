package com.kelon.demo1.Controller;
import com.kelon.demo1.Repository.UserDao1;
import com.kelon.demo1.Repository.iUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.ServiceMode;


@Controller
public class a {

    @Autowired
    private iUserDao userDao;

    @Autowired
    private UserDao1 userDao1;

    @RequestMapping("/jdbc")
    public ModelAndView hello()
    {
        ModelAndView mav = new ModelAndView("jdbc");
        mav.addObject("users", userDao.findAll());
        return mav;

    }

    @RequestMapping("/jdbc1")
    public ModelAndView jdbc()
    {
        ModelAndView mav = new ModelAndView("jdbc");
        mav.addObject("users", userDao1.getAllUser());
        return mav;
    }


    @RequestMapping("/task")
    public ModelAndView task()
    {
        ModelAndView mav = new ModelAndView("task");
    return  mav;
    }
}
