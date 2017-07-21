package com.feifan.personmanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.feifan.daoservice.PersonManageDaoService;
import com.feifan.personmanage.form.PersonManageForm;
import com.feifan.personmanage.sqlbean.PersonManageDeleteConfirmExecuteParamBean;

public class PersonManageDeleteConfirmExecuteAction extends Action {

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

		// 验证该人员是否已经住宿
		int count = personmanagedaoserviceimpl.personManageDeleteConfirmValidate(personManageForm.getId());
		if (count != 0) {
			ActionErrors actionErrors = new ActionErrors();
			actionErrors.add("error", new ActionMessage("personmanage_action_01"));
			this.addErrors(request, actionErrors);
			return mapping.findForward("fail");
		}
		// 如果未住宿则删除
		PersonManageDeleteConfirmExecuteParamBean paramBean = new PersonManageDeleteConfirmExecuteParamBean();
		paramBean.setValue(personManageForm);
		personmanagedaoserviceimpl.personManageDeleteConfirmExecute(paramBean);
		return mapping.findForward("success");
	}
}
