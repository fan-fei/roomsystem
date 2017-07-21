package com.feifan.loginmanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.LoginManageDaoService;

public class LoginManageLogoutAction extends Action {

	private LoginManageDaoService loginmanagedaoserviceimpl;

	public LoginManageDaoService getLoginmanagedaoserviceimpl() {
		return loginmanagedaoserviceimpl;
	}

	public void setLoginmanagedaoserviceimpl(LoginManageDaoService loginmanagedaoserviceimpl) {
		this.loginmanagedaoserviceimpl = loginmanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.getSession().removeAttribute("username");
		request.getSession().removeAttribute("authority");
		request.getSession().removeAttribute("nickname");
		return mapping.findForward("success");
	}
}
