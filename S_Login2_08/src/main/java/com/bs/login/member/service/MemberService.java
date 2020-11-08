package com.bs.login.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.login.member.Member;
import com.bs.login.member.dao.MemberDao;

@Service
public class MemberService implements IMemberService {
	
	@Autowired
	MemberDao dao;
	
	public void memberResister(String memId, String memPw, String memMail, String memPhone1, String memPhone2,
			String memPhone3) {
		
		dao.memberInsert(memId, memPw, memMail, memPhone1, memPhone2, memPhone3);
		System.out.println("Resiste Complete");
		
	}

	public void memberResister(Member member) {
		
		
		dao.memberInsert(member);
		System.out.println("memId : " + member.getMemId() + "Resite Complete");
		
	}

	@Override
	public Member memberSearch(String memId, String memPw) {
		
		Member member = dao.memberSelect(memId, memPw);
		
		return member;
	}

	@Override
	public void memberModify() {
		
	}

	@Override
	public void memberRemove() {
		
	}

}
