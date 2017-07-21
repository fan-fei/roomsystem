package com.feifan.loginmanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.LoginManageDaoService;

public class LoginManageSetUserConfirmBackAction extends Action {

	private LoginManageDaoService loginmanagedaoserviceimpl;

	public LoginManageDaoService getLoginmanagedaoserviceimpl() {
		return loginmanagedaoserviceimpl;
	}

	public void setLoginmanagedaoserviceimpl(LoginManageDaoService loginmanagedaoserviceimpl) {
		this.loginmanagedaoserviceimpl = loginmanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		return mapping.findForward("success");
	}
}
