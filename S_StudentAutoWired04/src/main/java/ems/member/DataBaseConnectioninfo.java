package ems.member;
//xml파일에서 주입했기 때문에 setter가 없어도 됨
public class DataBaseConnectioninfo {
	
	private String jdbcUrl;
	private String userId;
	private String userPw;
	
	public String getJdbcUrl() {
		return jdbcUrl;
	}
	
	
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}
	
	
	public String getUserId() {
		return userId;
	}
	
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	public String getUsePw() {
		return userPw;
	}
	
	
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	

}
