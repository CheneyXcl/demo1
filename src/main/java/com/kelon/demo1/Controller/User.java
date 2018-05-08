package com.kelon.demo1.Controller;
import com.kelon.demo1.Repository.UserDao;
import com.kelon.demo1.Repository.iUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class User {

    @Autowired
    private iUserDao iUserDao;

    @Autowired
    private UserDao userDao1;

    @RequestMapping("/jdbc")
    public ModelAndView hello()
    {
        ModelAndView mav = new ModelAndView("jdbc");
        mav.addObject("users", iUserDao.findAll());
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
