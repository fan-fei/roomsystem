package com.feifan.loginmanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.feifan.common.CommonUtility;
import com.feifan.daoservice.LoginManageDaoService;
import com.feifan.loginmanage.form.LoginManageForm;
import com.feifan.loginmanage.sqlbean.LoginManageLoginValidateParamBean;
import com.feifan.loginmanage.sqlbean.LoginManageLoginValidateResultBean;

public class LoginManageLoginAction extends Action {

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
		// 检查验证码是否正确，软件是否过期
		if (!CommonUtility.identify()) {
			ActionErrors actionErrors = new ActionErrors();
			actionErrors.add("error", new ActionMessage("identifyfailure"));
			this.addErrors(request, actionErrors);
			return mapping.findForward("fail");
		}
		LoginManageLoginValidateParamBean paramBean = new LoginManageLoginValidateParamBean();
		paramBean.setValue(loginManageForm);

		// 验证该用户密码是否存在
		LoginManageLoginValidateResultBean resultBean = loginmanagedaoserviceimpl.loginManageLoginValidate(paramBean);
		if (resultBean == null) {
			ActionErrors actionErrors = new ActionErrors();
			actionErrors.add("error", new ActionMessage("loginmanage_action_01"));
			this.addErrors(request, actionErrors);
			return mapping.findForward("fail");
		}
		// 存在则将该用户相关数据设为SESSION
		request.getSession().setAttribute("username", resultBean.getUsername());
		request.getSession().setAttribute("authority", resultBean.getAuthority());
		request.getSession().setAttribute("nickname", resultBean.getNickname());
		CommonUtility.lastupdated_operator = resultBean.getUsername();
		return mapping.findForward("success");
	}
}
