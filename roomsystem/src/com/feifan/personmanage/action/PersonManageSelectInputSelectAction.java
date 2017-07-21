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
import com.feifan.personmanage.sqlbean.PersonManageSelectInputSelectParamBean;
import com.feifan.personmanage.sqlbean.PersonManageSelectInputSelectResultBean;

public class PersonManageSelectInputSelectAction extends Action {

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
		PersonManageSelectInputSelectParamBean paramBean = new PersonManageSelectInputSelectParamBean();
		// 将检索条件放入SESSION
		request.getSession().setAttribute("personManageSelectInputSelectCondition", personManageForm);
		// 设定paramBean
		paramBean.setValue(personManageForm);
		// 执行数据库
		List<PersonManageSelectInputSelectResultBean> results = personmanagedaoserviceimpl.personManageSelectInputSelect(paramBean);
		// 将检索结果放入SESSION
		request.getSession().setAttribute("personManageSelectInputSelectResult", results);
		return mapping.findForward("success");
	}
}
