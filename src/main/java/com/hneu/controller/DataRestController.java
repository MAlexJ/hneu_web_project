package com.hneu.controller;

import com.hneu.model.scedule.Schedule;
import com.hneu.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author malex
 */
@RestController
@RequestMapping(path = "/")
public class DataRestController {

    @Autowired
    private ScheduleService service;

    @RequestMapping(path = "/schedule", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Schedule getSchedule() {
        return service.getSchedule();
    }

}
