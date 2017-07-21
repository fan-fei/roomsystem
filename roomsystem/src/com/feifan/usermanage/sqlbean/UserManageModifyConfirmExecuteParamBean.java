package com.feifan.usermanage.sqlbean;

import com.feifan.common.CommonUtility;
import com.feifan.usermanage.form.UserManageForm;

public class UserManageModifyConfirmExecuteParamBean {
	// ID
	private String id;
	// 帐号
	private String username;
	// 密码
	private String password;
	// 权限
	private String authority;
	// 昵称
	private String nickname;
	// 备注
	private String comment;
	// 操作员
	private String lastupdated_operator;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getLastupdated_operator() {
		return lastupdated_operator;
	}

	public void setLastupdated_operator(String lastupdated_operator) {
		this.lastupdated_operator = lastupdated_operator;
	}

	public void setValue(UserManageForm form) {
		this.id = form.getId();
		this.username = form.getUsername();
		this.password = form.getPassword();
		this.authority = form.getAuthority();
		this.nickname = form.getNickname();
		this.comment = form.getComment();
		this.lastupdated_operator = CommonUtility.lastupdated_operator;
	}
}
