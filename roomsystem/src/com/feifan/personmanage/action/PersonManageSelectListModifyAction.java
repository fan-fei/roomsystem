package com.feifan.personmanage.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.PersonManageDaoService;
import com.feifan.personmanage.form.PersonManageForm;
import com.feifan.personmanage.sqlbean.PersonManageSelectInputSelectResultBean;

public class PersonManageSelectListModifyAction extends Action {

	private PersonManageDaoService personmanagedaoserviceimpl;

	public PersonManageDaoService getPersonmanagedaoserviceimpl() {
		return personmanagedaoserviceimpl;
	}

	public void setPersonmanagedaoserviceimpl(PersonManageDaoService personmanagedaoserviceimpl) {
		this.personmanagedaoserviceimpl = personmanagedaoserviceimpl;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		PersonManageForm personManageForm = (PersonManageForm) form;
		String index = (String) request.getParameter("index");
		PersonManageSelectInputSelectResultBean resultBean = ((List<PersonManageSelectInputSelectResultBean>) request.getSession().getAttribute("personManageSelectInputSelectResult")).get(Integer.parseInt(index));
		personManageForm.setValue(resultBean);
		return mapping.findForward("success");
	}
}
