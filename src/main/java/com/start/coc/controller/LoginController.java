package com.start.coc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.start.coc.service.model.Clan;
import com.start.coc.service.model.User;
import com.start.coc.service.service.ClanService;
import com.start.coc.service.service.UserService;

@Controller
@RequestMapping
public class LoginController {
	@Autowired
	private UserService userService;

	@RequestMapping("/testLogin")
	public String testLogin(HttpSession session) {
		User user = userService.selectByPrimaryKey(13);
		UserDetails userDetails = user;
		PreAuthenticatedAuthenticationToken authentication = new PreAuthenticatedAuthenticationToken(userDetails,
				userDetails.getPassword(), userDetails.getAuthorities());
		authentication.setDetails(userDetails);
		SecurityContext context = SecurityContextHolder.getContext();
		context.setAuthentication(authentication);		
		session.setAttribute("SPRING_SECURITY_CONTEXT", SecurityContextHolder.getContext());
		return "/testLogin";
	}

	@RequestMapping("/login")
	public String toLogin(HttpSession session) {
		return "/login";
	}
	
	@RequestMapping("/home")
	public String toHome(HttpSession session) {
		return "/home";
	}
}
