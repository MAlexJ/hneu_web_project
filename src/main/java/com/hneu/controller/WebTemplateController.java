package com.hneu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author malex
 */
@Controller
@RequestMapping("/")
public class WebTemplateController {

    /**
     * Request index.html, method GET
     *
     * @return template home.html
     */
    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public String home() {
        return "views/home";
    }

    /**
     * @return template mobiles.html
     */
    @RequestMapping(path = "/mobiles", method = RequestMethod.GET)
    public String mobiles() {
        return "views/mobiles";
    }

    /**
     * @return template teachers.html
     */
    @RequestMapping(path = "/teachers", method = RequestMethod.GET)
    public String teachers() {
        return "views/teachers";
    }

    /**
     * @return template timetable.html
     */
    @RequestMapping(path = "/timetable", method = RequestMethod.GET)
    public String timetable() {
        return "views/timetable";
    }

    /**
     * @return template news.html
     */
    @RequestMapping(path = "/news", method = RequestMethod.GET)
    public String news() {
        return "views/news";
    }

    /**
     * @return template comments.html
     */
    @RequestMapping(path = "/comments", method = RequestMethod.GET)
    public String comments() {
        return "views/comments";
    }

    /**
     * @return template schedule.html
     */
    @RequestMapping(path = "/schedule", method = RequestMethod.GET)
    public String schedule() {
        return "views/schedule";
    }

}
