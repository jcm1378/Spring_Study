package com.bs.login.member.dao;

import com.bs.login.member.Member;

public interface IMemberDao {
	void memberInsert (String memId, String memPw, String memMail,
			String memPhone1, String memPhone2, String memPhone3);
	
	void memberInsert (Member member);
	Member memberSelect(String memId, String memPw);
	void memberUpdate();
	void memberDelete();

}
