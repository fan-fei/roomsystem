package com.feifan.loginmanage.sqlbean;


public class LoginManageLoginValidateResultBean {
	// ID
	private String id;
	// 帐号
	private String username;
	// 权限
	private String authority;
	// 昵称
	private String nickname;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
}
