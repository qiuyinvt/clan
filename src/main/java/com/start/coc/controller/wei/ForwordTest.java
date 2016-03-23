package com.start.coc.controller.wei;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("forwordTest")
public class ForwordTest {

	@RequestMapping(value="toAdd",method={RequestMethod.GET,RequestMethod.POST})
	public String toAdd(){
		
		return "forwordTest/add";
		
	}
	
	@RequestMapping(value="add",method={RequestMethod.GET,RequestMethod.POST})
	public String add(){
		
		return "redirect:toAdd";
		
	}
	
	@RequestMapping(value="toList",method={RequestMethod.GET,RequestMethod.POST})
	public String toList(){

		return "forwordTest/index";
		
	}
	
}
