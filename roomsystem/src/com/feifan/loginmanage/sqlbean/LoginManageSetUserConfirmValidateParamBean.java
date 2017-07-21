package com.feifan.loginmanage.sqlbean;

import com.feifan.loginmanage.form.LoginManageForm;

public class LoginManageSetUserConfirmValidateParamBean {
	// 帐号
	private String username;
	// 原密码
	private String password;

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

	public void setValue(LoginManageForm form) {
		this.username = form.getUsername();
		this.password = form.getPassword();
	}
}
