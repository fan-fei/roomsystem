package com.feifan.loginmanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.LoginManageDaoService;
import com.feifan.loginmanage.form.LoginManageForm;

public class LoginManageSetUserInputConfirmAction extends Action {

	private LoginManageDaoService loginmanagedaoserviceimpl;

	public LoginManageDaoService getLoginmanagedaoserviceimpl() {
		return loginmanagedaoserviceimpl;
	}

	public void setLoginmanagedaoserviceimpl(LoginManageDaoService loginmanagedaoserviceimpl) {
		this.loginmanagedaoserviceimpl = loginmanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		LoginManageForm loginManageForm = (LoginManageForm) form;
		// 取得密码长度，用以显示相应长度的星号
		if (loginManageForm.getIf_password() != null) {
			int passwordLength = loginManageForm.getPassword().length();
			int new_passwordLength = loginManageForm.getNew_password().length();
			request.setAttribute("passwordLength", passwordLength);
			request.setAttribute("new_passwordLength", new_passwordLength);
		}
		return mapping.findForward("success");
	}
}
