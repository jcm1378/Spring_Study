package com.bs.login.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bs.login.member.Member;
import com.bs.login.member.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping (value = "/memJoin", method=RequestMethod.POST)
	public String memJoin(Member member) {
		
		service.memberResister(member);
		
		return "memJoinOk";
	}
	
	@RequestMapping(value="/memLogin", method=RequestMethod.POST)
	public String memLogin(Model model, 
			@RequestParam("memId") String memId, 
			@RequestParam("memPw") String memPw) {
		
		Member member = service.memberSearch(memId, memPw);
		
		try {
			model.addAttribute("memId", member.getMemId());
			model.addAttribute("memPw", member.getMemPw());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return "memLoginOk";
	}

}
