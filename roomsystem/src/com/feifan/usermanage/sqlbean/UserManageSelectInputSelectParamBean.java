package com.feifan.usermanage.sqlbean;

import javax.servlet.http.HttpServletRequest;

import com.feifan.usermanage.form.UserManageForm;

public class UserManageSelectInputSelectParamBean {
	// 帐号
	private String username;
	// 权限
	private String authority;
	// 昵称
	private String nickname;
	// 当前登录用户
	private String currentusername;

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

	public String getCurrentusername() {
		return currentusername;
	}

	public void setCurrentusername(String currentusername) {
		this.currentusername = currentusername;
	}

	public void setValue(UserManageForm form, HttpServletRequest request) {
		this.username = "%" + form.getUsername() + "%";
		this.authority = "%" + form.getAuthority() + "%";
		this.nickname = "%" + form.getNickname() + "%";
		this.currentusername = (String) request.getSession().getAttribute("username");
	}
}
