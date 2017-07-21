package com.feifan.usermanage.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.feifan.common.CommonUtility;
import com.feifan.usermanage.sqlbean.UserManageSelectInputSelectResultBean;

public class UserManageForm extends ActionForm {
	private static final long serialVersionUID = -5439725176962082289L;
	// ID
	private String id;
	// 帐号
	private String username;
	// 密码
	private String password;
	// 密码确认
	private String password_confirm;
	// 权限
	private String authority;
	// 昵称
	private String nickname;
	// 备注
	private String comment;

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors actionErrors = new ActionErrors();
		if (null == username || username.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "帐号"));
		} else if (!CommonUtility.isUsername(username)) {
			actionErrors.add("error", new ActionMessage("usermanage_form_02", "帐号"));
		} else if (null == password || password.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "密码"));
		} else if (!CommonUtility.isPassword(password)) {
			actionErrors.add("error", new ActionMessage("global_form_05", "密码"));
		} else if (!password.equals(password_confirm)) {
			actionErrors.add("error", new ActionMessage("usermanage_form_01"));
		} else if (null == authority || authority.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "权限"));
		} else if (null == nickname || nickname.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "昵称"));
		}
		return actionErrors;
	}

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

	public String getPassword_confirm() {
		return password_confirm;
	}

	public void setPassword_confirm(String password_confirm) {
		this.password_confirm = password_confirm;
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

	public void setValue(UserManageSelectInputSelectResultBean resultBean) {
		this.id = resultBean.getId();
		this.username = resultBean.getUsername();
		this.password = resultBean.getPassword();
		this.password_confirm = resultBean.getPassword();
		this.authority = resultBean.getAuthority();
		this.nickname = resultBean.getNickname();
		this.comment = resultBean.getComment();
	}
}
