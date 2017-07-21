package com.feifan.loginmanage.sqlbean;

import com.feifan.common.CommonUtility;
import com.feifan.loginmanage.form.LoginManageForm;

public class LoginManageSetUserConfirmExecuteParamBean {
	// 帐号
	private String username;
	// 原密码
	private String password;
	// 新密码
	private String new_password;
	// 昵称
	private String nickname;
	// 最后操作帐号
	private String lastupdated_operator;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNew_password() {
		return new_password;
	}

	public void setNew_password(String new_password) {
		this.new_password = new_password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getLastupdated_operator() {
		return lastupdated_operator;
	}

	public void setLastupdated_operator(String lastupdated_operator) {
		this.lastupdated_operator = lastupdated_operator;
	}

	public void setValue(LoginManageForm form) {
		this.username = form.getUsername();
		this.password = form.getPassword();
		this.new_password = form.getNew_password();
		this.nickname = form.getNickname();
		this.lastupdated_operator = CommonUtility.lastupdated_operator;
	}
}
