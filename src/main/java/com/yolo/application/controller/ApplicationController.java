package com.yolo.application.controller;

import java.net.MalformedURLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yolo.application.model.Sleep;
import com.yolo.application.model.User;
import com.yolo.application.service.ApplicationService;
import com.yolo.application.service.SleepServiceRest;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
 class ApplicationController {
	
	@Autowired
    private ApplicationService userService;
	
	@Autowired
    private SleepServiceRest sleepServiceRest;

	@RequestMapping(value = "/calculate", method = RequestMethod.POST, produces = {"application/json"})
     public @ResponseBody User calculateUserInformation(@RequestBody User user) {
		this.userService.calculate(user);
	        return user;
	    }
	
	@RequestMapping(value = "/calculateSleepInfo", method = RequestMethod.POST, produces = {"application/json"})
    public @ResponseBody Sleep sleepInfo(@RequestBody Sleep sleep) throws MalformedURLException {
	         this.sleepServiceRest.getSleepInfo(sleep);
	         return sleep;
	    }

}
