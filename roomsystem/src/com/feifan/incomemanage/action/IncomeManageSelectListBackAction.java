package com.feifan.incomemanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.IncomeManageDaoService;
import com.feifan.incomemanage.form.IncomeManageForm;

public class IncomeManageSelectListBackAction extends Action {

	private IncomeManageDaoService incomemanagedaoserviceimpl;

	public IncomeManageDaoService getIncomemanagedaoserviceimpl() {
		return incomemanagedaoserviceimpl;
	}

	public void setIncomemanagedaoserviceimpl(IncomeManageDaoService incomemanagedaoserviceimpl) {
		this.incomemanagedaoserviceimpl = incomemanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		IncomeManageForm incomeManageForm = (IncomeManageForm) form;
		// 取得检索条件
		IncomeManageForm condition = (IncomeManageForm) request.getSession().getAttribute("incomeManageSelectInputSelectCondition");
		// 设定检索条件
		incomeManageForm.setBuilding_num((condition).getBuilding_num());
		incomeManageForm.setFloor_num(condition.getFloor_num());
		incomeManageForm.setYear(condition.getYear());
		incomeManageForm.setMonth(condition.getMonth());
		return mapping.findForward("success");
	}
}
