package com.feifan.personmanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.PersonManageDaoService;
import com.feifan.personmanage.form.PersonManageForm;
import com.feifan.personmanage.sqlbean.PersonManageModifyConfirmExecuteParamBean;

public class PersonManageModifyConfirmExecuteAction extends Action {

	private PersonManageDaoService personmanagedaoserviceimpl;

	public PersonManageDaoService getPersonmanagedaoserviceimpl() {
		return personmanagedaoserviceimpl;
	}

	public void setPersonmanagedaoserviceimpl(PersonManageDaoService personmanagedaoserviceimpl) {
		this.personmanagedaoserviceimpl = personmanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		PersonManageForm personManageForm = (PersonManageForm) form;
		PersonManageModifyConfirmExecuteParamBean paramBean = new PersonManageModifyConfirmExecuteParamBean();
		// 设定paramBean
		paramBean.setValue(personManageForm);
		// 执行数据库
		personmanagedaoserviceimpl.personManageModifyConfirmExecute(paramBean);
		return mapping.findForward("success");
	}
}
