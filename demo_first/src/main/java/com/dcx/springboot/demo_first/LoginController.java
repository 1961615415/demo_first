package com.dcx.springboot.demo_first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
@GetMapping("/login")
@ResponseBody
public String login(){
	return "你好！欢迎您登录";
}
}
