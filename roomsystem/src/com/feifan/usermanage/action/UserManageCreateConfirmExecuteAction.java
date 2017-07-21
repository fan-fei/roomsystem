package com.feifan.usermanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.feifan.daoservice.UserManageDaoService;
import com.feifan.usermanage.form.UserManageForm;
import com.feifan.usermanage.sqlbean.UserManageCreateConfirmExecuteParamBean;

public class UserManageCreateConfirmExecuteAction extends Action {

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
		// 验证该条数据是否已经存在
		int count = usermanagedaoserviceimpl.userManageCreateConfirmValidate(userManageForm.getUsername());
		if (count != 0) {
			ActionErrors actionErrors = new ActionErrors();
			actionErrors.add("error", new ActionMessage("global_action_01", "帐号"));
			this.addErrors(request, actionErrors);
			// 取得密码长度，用以显示相应长度的星号
			int passwordLength = userManageForm.getPassword().length();
			request.setAttribute("passwordLength", passwordLength);
			return mapping.findForward("fail");
		}
		// 如不存在则执行
		UserManageCreateConfirmExecuteParamBean paramBean = new UserManageCreateConfirmExecuteParamBean();
		paramBean.setValue(userManageForm);
		usermanagedaoserviceimpl.userManageCreateConfirmExecute(paramBean);

		return mapping.findForward("success");
	}
}
