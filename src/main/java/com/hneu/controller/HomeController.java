package com.hneu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author malex
 */
@Controller
@RequestMapping("/")
public class HomeController {

    /**
     * @return template index.html
     */
    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "index";
    }
}
