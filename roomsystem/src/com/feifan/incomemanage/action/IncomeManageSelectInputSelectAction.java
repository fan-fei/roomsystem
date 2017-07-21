package com.feifan.incomemanage.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.IncomeManageDaoService;
import com.feifan.incomemanage.form.IncomeManageForm;
import com.feifan.incomemanage.sqlbean.IncomeManageSelectInputSelectParamBean;
import com.feifan.incomemanage.sqlbean.IncomeManageSelectInputSelectResultBean;

public class IncomeManageSelectInputSelectAction extends Action {

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
		IncomeManageSelectInputSelectParamBean paramBean = new IncomeManageSelectInputSelectParamBean();
		// 将检索条件放入SESSION
		request.getSession().setAttribute("incomeManageSelectInputSelectCondition", incomeManageForm);
		// 设定paramBean
		paramBean.setValue(incomeManageForm);
		// 执行数据库
		List<IncomeManageSelectInputSelectResultBean> results = incomemanagedaoserviceimpl.incomeManageSelectInputSelect(paramBean);
		// 将检索结果放入SESSION
		request.getSession().setAttribute("incomeManageSelectInputSelectResult", results);
		return mapping.findForward("success");
	}
}
