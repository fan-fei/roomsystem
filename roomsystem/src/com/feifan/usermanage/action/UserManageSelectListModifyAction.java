package com.feifan.usermanage.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.UserManageDaoService;
import com.feifan.usermanage.form.UserManageForm;
import com.feifan.usermanage.sqlbean.UserManageSelectInputSelectResultBean;

public class UserManageSelectListModifyAction extends Action {

	private UserManageDaoService usermanagedaoserviceimpl;

	public UserManageDaoService getUsermanagedaoserviceimpl() {
		return usermanagedaoserviceimpl;
	}

	public void setUsermanagedaoserviceimpl(UserManageDaoService usermanagedaoserviceimpl) {
		this.usermanagedaoserviceimpl = usermanagedaoserviceimpl;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		UserManageForm userManageForm = (UserManageForm) form;
		String index = (String) request.getParameter("index");
		UserManageSelectInputSelectResultBean resultBean = ((List<UserManageSelectInputSelectResultBean>) request.getSession().getAttribute("userManageSelectInputSelectResult")).get(Integer.parseInt(index));
		userManageForm.setValue(resultBean);
		return mapping.findForward("success");
	}
}
