package com.feifan.personmanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.PersonManageDaoService;
import com.feifan.personmanage.form.PersonManageForm;

public class PersonManageSelectListBackAction extends Action {

	private PersonManageDaoService personmanagedaoserviceimpl;

	public PersonManageDaoService getPersonmanagedaoserviceimpl() {
		return personmanagedaoserviceimpl;
	}

	public void setPersonmanagedaoserviceimpl(PersonManageDaoService personmanagedaoserviceimpl) {
		this.personmanagedaoserviceimpl = personmanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		PersonManageForm personManageForm = (PersonManageForm) form;
		// 取得检索条件
		PersonManageForm condition = (PersonManageForm) request.getSession().getAttribute("personManageSelectInputSelectCondition");
		// 设定检索条件
		personManageForm.setPerson_num((condition).getPerson_num());
		personManageForm.setName(condition.getName());
		personManageForm.setSex(condition.getSex());
		personManageForm.setNative_place(condition.getNative_place());
		return mapping.findForward("success");
	}
}
