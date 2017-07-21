package com.feifan.usermanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.UserManageDaoService;
import com.feifan.usermanage.form.UserManageForm;
import com.feifan.usermanage.sqlbean.UserManageModifyConfirmExecuteParamBean;

public class UserManageModifyConfirmExecuteAction extends Action {

	private UserManageDaoService usermanagedaoserviceimpl;

	public UserManageDaoService getUsermanagedaoserviceimpl() {
		return usermanagedaoserviceimpl;
	}

	public void setUsermanagedaoserviceimpl(UserManageDaoService usermanagedaoserviceimpl) {
		this.usermanagedaoserviceimpl = usermanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		UserManageForm userManageForm = (UserManageForm) form;
		UserManageModifyConfirmExecuteParamBean paramBean = new UserManageModifyConfirmExecuteParamBean();
		// 设定paramBean
		paramBean.setValue(userManageForm);
		// 执行数据库
		usermanagedaoserviceimpl.userManageModifyConfirmExecute(paramBean);
		return mapping.findForward("success");
	}
}
