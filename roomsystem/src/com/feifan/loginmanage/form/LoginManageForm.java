package com.feifan.loginmanage.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.feifan.common.CommonUtility;
import com.feifan.usermanage.sqlbean.UserManageSelectInputSelectResultBean;

public class LoginManageForm extends ActionForm {
	private static final long serialVersionUID = 4503933219269085351L;
	// ID
	private String id;
	// 帐号
	private String username;
	// 密码//原密码
	private String password;
	// 密码//新密码
	private String new_password;
	// 密码确认// 新密码确认
	private String password_confirm;
	// 权限
	private String authority;
	// 昵称
	private String nickname;
	// 备注
	private String comment;
	// 页面FLAG
	private String page_flag;
	// 是否设置密码
	private String if_password;

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors actionErrors = new ActionErrors();
		if (null == username || username.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "帐号"));
		} else if (!CommonUtility.isUsername(username)) {
			actionErrors.add("error", new ActionMessage("usermanage_form_02", "帐号"));
		} else if (null == nickname || nickname.trim().equals("")) {
			actionErrors.add("error", new ActionMessage("global_form_01", "昵称"));
		}
		if (if_password != null) {
			if (null == password || password.trim().equals("")) {
				actionErrors.add("error", new ActionMessage("global_form_01", "原密码"));
			} else if (!CommonUtility.isPassword(password)) {
				actionErrors.add("error", new ActionMessage("global_form_05", "原密码"));
			} else if (null == new_password || new_password.trim().equals("")) {
				actionErrors.add("error", new ActionMessage("global_form_01", "新密码"));
			} else if (!CommonUtility.isPassword(new_password)) {
				actionErrors.add("error", new ActionMessage("global_form_05", "新密码"));
			} else if (!new_password.equals(password_confirm)) {
				actionErrors.add("error", new ActionMessage("loginmanage_form_01"));
			}
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

	public String getNew_password() {
		return new_password;
	}

	public void setNew_password(String new_password) {
		this.new_password = new_password;
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

	public String getPage_flag() {
		return page_flag;
	}

	public void setPage_flag(String page_flag) {
		this.page_flag = page_flag;
	}

	public String getIf_password() {
		return if_password;
	}

	public void setIf_password(String if_password) {
		this.if_password = if_password;
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
