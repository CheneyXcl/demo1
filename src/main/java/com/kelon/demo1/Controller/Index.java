package com.kelon.demo1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Index {
    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
