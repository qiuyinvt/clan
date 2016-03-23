package com.start.coc.controller.wei;


import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.start.coc.service.enums.ClanManRole;
import com.start.coc.service.model.ClanMan;
import com.start.coc.service.service.ClanManService;
import com.start.coc.service.service.ClanService;
import com.start.coc.service.utils.Find;

@Controller
@RequestMapping("/wei/clanMan")
public class ClanManController {
	@Autowired
	private ClanService clanService;
	
	@Autowired
	private ClanManService clanManService;
	
	@RequestMapping(value="/toView",method={RequestMethod.GET,RequestMethod.POST})
	public String toView(HttpServletRequest request,Model model){
		Long id = Long.parseLong(request.getParameter("id"));		
		ClanMan clan = clanManService.selectByPrimaryKey(id);		
		model.addAttribute("clan", clan);	
		//model.addAllAttributes(clanMans);	
		return "wei/clanMan/clanManView";
	}
	
	@RequestMapping(value="/toAdd",method={RequestMethod.GET,RequestMethod.POST})
	public String toAdd(Map<String,Object> map){		
		map.put("roles", ClanManRole.ROLES);		
		map.put("clanMan",new ClanMan());
		//model.addAttribute("roles", ClanManRole.ROLES);		
		//model.addAttribute("clanMan",new ClanMan());
		return "wei/clanMan/clanManAdd";
	}
	
	@RequestMapping(value="/add",method={RequestMethod.GET,RequestMethod.POST})
	public String add(@ModelAttribute("clanMan") ClanMan clanMan){
		clanMan.setClanId(1);
		clanMan.setCreated(new Date());
		clanMan.setIsQuit(false);
		clanManService.insert(clanMan);
		return "redirect:/wei/clan/my";
	}

}
