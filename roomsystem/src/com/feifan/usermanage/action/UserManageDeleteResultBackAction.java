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
import com.feifan.usermanage.sqlbean.UserManageSelectInputSelectParamBean;
import com.feifan.usermanage.sqlbean.UserManageSelectInputSelectResultBean;

public class UserManageDeleteResultBackAction extends Action {

	private UserManageDaoService usermanagedaoserviceimpl;

	public UserManageDaoService getUsermanagedaoserviceimpl() {
		return usermanagedaoserviceimpl;
	}

	public void setUsermanagedaoserviceimpl(UserManageDaoService usermanagedaoserviceimpl) {
		this.usermanagedaoserviceimpl = usermanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		UserManageSelectInputSelectParamBean paramBean = new UserManageSelectInputSelectParamBean();
		// 将检索条件从SESSION取出
		UserManageForm userManageForm = (UserManageForm) request.getSession().getAttribute("userManageSelectInputSelectCondition");
		// 设定paramBean
		paramBean.setValue(userManageForm, request);
		// 执行数据库
		List<UserManageSelectInputSelectResultBean> results = usermanagedaoserviceimpl.userManageSelectInputSelect(paramBean);
		// 将检索结果放入SESSION
		request.getSession().setAttribute("userManageSelectInputSelectResult", results);
		return mapping.findForward("success");
	}
}
