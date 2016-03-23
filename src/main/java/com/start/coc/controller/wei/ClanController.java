package com.start.coc.controller.wei;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.start.coc.service.model.Clan;
import com.start.coc.service.model.ClanMan;
import com.start.coc.service.service.ClanManService;
import com.start.coc.service.service.ClanService;
import com.start.coc.service.utils.Find;

@Controller
@RequestMapping("/wei/clan")
public class ClanController {
	@Autowired
	private ClanService clanService;
	
	@Autowired
	private ClanManService clanManService;
	
	@RequestMapping("/my")
	public String toIndex(HttpServletRequest request,Model model,HttpSession session){
		Clan clan = clanService.selectByPrimaryKey(1);
		List<ClanMan> clanMans;
		Find find = new Find();
		find.eq("clanId", "1");
		clanMans = clanManService.getByFind(find);
		model.addAttribute("clan", clan);
		model.addAttribute("clanMans", clanMans);	
		//model.addAllAttributes(clanMans);	
		return "wei/clan/myClan";
	}
}
