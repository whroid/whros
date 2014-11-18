package com.whroid.ee.whros.test.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.whroid.ee.whros.test.entity.User;
import com.whroid.ee.whros.test.service.UserService;


@Controller
@RequestMapping(value="/test")
public class TestController {
	
	Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Resource
	public UserService userService;
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public String testUser(Model model)
	{
		logger.info("TTTTTTTTTTTTTTTTTT----->>"+System.currentTimeMillis());
		List<User> users = userService.getUser();
		model.addAttribute("users", users);
		return "/test";
	}

	
	/**
	 * 员工信息
	 */
	@RequestMapping(value="/getOne",method=RequestMethod.GET)
	public String testUserOne(@RequestParam("uid") String uid,Model model)
	{
		logger.debug("testuserOne:id="+uid);
		System.out.print("uid="+uid);
		User user = userService.getUser(uid);
		model.addAttribute("user", user);
		return "/test_one";
	}
}
