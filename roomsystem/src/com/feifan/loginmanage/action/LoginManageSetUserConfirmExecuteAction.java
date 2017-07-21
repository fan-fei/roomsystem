package com.feifan.loginmanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.feifan.daoservice.LoginManageDaoService;
import com.feifan.loginmanage.form.LoginManageForm;
import com.feifan.loginmanage.sqlbean.LoginManageSetUserConfirmExecuteParamBean;
import com.feifan.loginmanage.sqlbean.LoginManageSetUserConfirmValidateParamBean;

public class LoginManageSetUserConfirmExecuteAction extends Action {

	private LoginManageDaoService loginmanagedaoserviceimpl;

	public LoginManageDaoService getLoginmanagedaoserviceimpl() {
		return loginmanagedaoserviceimpl;
	}

	public void setLoginmanagedaoserviceimpl(LoginManageDaoService loginmanagedaoserviceimpl) {
		this.loginmanagedaoserviceimpl = loginmanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		LoginManageForm loginManageForm = (LoginManageForm) form;
		// 判断是否要设置密码
		if (loginManageForm.getIf_password() != null) {
			LoginManageSetUserConfirmValidateParamBean validateParamBean = new LoginManageSetUserConfirmValidateParamBean();
			// 设定paramBean
			validateParamBean.setValue(loginManageForm);
			// 验证密码是否正确
			int count = loginmanagedaoserviceimpl.loginManageSetUserConfirmValidate(validateParamBean);
			if (count == 0) {
				int passwordLength = loginManageForm.getPassword().length();
				int new_passwordLength = loginManageForm.getNew_password().length();
				request.setAttribute("passwordLength", passwordLength);
				request.setAttribute("new_passwordLength", new_passwordLength);
				ActionErrors actionErrors = new ActionErrors();
				actionErrors.add("error", new ActionMessage("loginmanage_action_02"));
				this.addErrors(request, actionErrors);
				return mapping.findForward("fail");
			}
			// 执行数据库
			LoginManageSetUserConfirmExecuteParamBean executeParamBean = new LoginManageSetUserConfirmExecuteParamBean();
			executeParamBean.setValue(loginManageForm);
			loginmanagedaoserviceimpl.loginManageSetUserConfirmExecute(executeParamBean);
			request.getSession().setAttribute("nickname", loginManageForm.getNickname());
		} else {
			LoginManageSetUserConfirmValidateParamBean validateParamBean = new LoginManageSetUserConfirmValidateParamBean();
			// 设定paramBean
			validateParamBean.setValue(loginManageForm);
			// 验证该用户是否被删除
			int count = loginmanagedaoserviceimpl.loginManageSetUserConfirmValidateNoPassword(validateParamBean);
			if (count == 0) {
				ActionErrors actionErrors = new ActionErrors();
				actionErrors.add("error", new ActionMessage("loginmanage_action_03"));
				this.addErrors(request, actionErrors);
				return mapping.findForward("fail");
			}
			// 执行数据库
			LoginManageSetUserConfirmExecuteParamBean executeParamBean = new LoginManageSetUserConfirmExecuteParamBean();
			executeParamBean.setValue(loginManageForm);
			loginmanagedaoserviceimpl.loginManageSetUserConfirmExecuteNoPassword(executeParamBean);
			request.getSession().setAttribute("nickname", loginManageForm.getNickname());
		}
		return mapping.findForward("success");
	}
}
