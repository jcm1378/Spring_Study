package com.bs.login.member.service;

import com.bs.login.member.Member;

public interface IMemberService {
	void memberResister(String memId, String memPw, String memMail, String memPhone1, String memPhone2, String memPhone3);
	void memberResister(Member member);
	Member memberSearch(String memId, String memPw);
	void memberModify();
	void memberRemove();

}
