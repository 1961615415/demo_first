package com.dcx.springboot.demo_first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {
@GetMapping("/index")
@ResponseBody
public String login(){
	return "你好！";
	
}
}
