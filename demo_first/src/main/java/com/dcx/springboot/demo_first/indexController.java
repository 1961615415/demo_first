package com.dcx.springboot.demo_first;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {
@GetMapping("index")
public Map<String,String> index(){
	HashMap<String, String> map=new HashMap<String, String>();
	map.put("name", "dcx");
	return map;
}
}
