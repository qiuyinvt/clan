package com.start.coc.controller.wei;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.start.coc.service.model.ClanWar;
import com.start.coc.service.service.ClanWarService;
import com.start.coc.service.utils.Find;

@Controller
@RequestMapping("wei/war")
public class WarController {
	@Autowired
	private ClanWarService clanWarService;
	
	@RequestMapping("/clanWar")
	public String toIndex(HttpServletRequest request,Model model){		
		Find find = new Find();
		find.eq("clanId", "1");
		List<ClanWar> wars = clanWarService.getByFind(find);
		model.addAttribute("wars", wars);
		return "wei/war/clanWar";
	}
}
