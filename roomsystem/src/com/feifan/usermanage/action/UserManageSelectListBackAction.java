package com.feifan.usermanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.UserManageDaoService;
import com.feifan.usermanage.form.UserManageForm;

public class UserManageSelectListBackAction extends Action {

	private UserManageDaoService usermanagedaoserviceimpl;

	public UserManageDaoService getUsermanagedaoserviceimpl() {
		return usermanagedaoserviceimpl;
	}

	public void setUsermanagedaoserviceimpl(UserManageDaoService usermanagedaoserviceimpl) {
		this.usermanagedaoserviceimpl = usermanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		UserManageForm userManageForm = (UserManageForm) form;
		// 取得检索条件
		UserManageForm condition = (UserManageForm) request.getSession().getAttribute("userManageSelectInputSelectCondition");
		// 设定检索条件
		userManageForm.setUsername((condition).getUsername());
		userManageForm.setAuthority(condition.getAuthority());
		userManageForm.setNickname(condition.getNickname());
		return mapping.findForward("success");
	}
}
