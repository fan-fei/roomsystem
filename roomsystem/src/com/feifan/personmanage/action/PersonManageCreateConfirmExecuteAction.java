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
import com.feifan.personmanage.sqlbean.PersonManageCreateConfirmExecuteParamBean;

public class PersonManageCreateConfirmExecuteAction extends Action {

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
		// 验证该条数据是否已经存在
		int count = personmanagedaoserviceimpl.personManageCreateConfirmValidate(personManageForm.getPerson_num());
		if (count != 0) {
			ActionErrors actionErrors = new ActionErrors();
			actionErrors.add("error", new ActionMessage("global_action_01", "身份证号"));
			this.addErrors(request, actionErrors);
			return mapping.findForward("fail");
		}
		// 如不存在则执行
		PersonManageCreateConfirmExecuteParamBean paramBean = new PersonManageCreateConfirmExecuteParamBean();
		paramBean.setValue(personManageForm);
		personmanagedaoserviceimpl.personManageCreateConfirmExecute(paramBean);

		return mapping.findForward("success");
	}
}
