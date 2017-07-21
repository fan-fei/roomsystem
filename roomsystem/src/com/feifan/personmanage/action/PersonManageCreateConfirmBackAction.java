package com.feifan.personmanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.PersonManageDaoService;

public class PersonManageCreateConfirmBackAction extends Action {

	private PersonManageDaoService personmanagedaoserviceimpl;

	public PersonManageDaoService getPersonmanagedaoserviceimpl() {
		return personmanagedaoserviceimpl;
	}

	public void setPersonmanagedaoserviceimpl(PersonManageDaoService personmanagedaoserviceimpl) {
		this.personmanagedaoserviceimpl = personmanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		return mapping.findForward("success");
	}
}
