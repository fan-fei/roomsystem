package com.feifan.housemanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.feifan.daoservice.HouseManageDaoService;
import com.feifan.housemanage.form.HouseManageForm;
import com.feifan.housemanage.sqlbean.HouseManageDeleteConfirmExecuteParamBean;

public class HouseManageDeleteConfirmExecuteAction extends Action {

	private HouseManageDaoService housemanagedaoserviceimpl;

	public HouseManageDaoService getHousemanagedaoserviceimpl() {
		return housemanagedaoserviceimpl;
	}

	public void setHousemanagedaoserviceimpl(HouseManageDaoService housemanagedaoserviceimpl) {
		this.housemanagedaoserviceimpl = housemanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		HouseManageForm houseManageForm = (HouseManageForm) form;
		// 验证该用户是否已经住宿
		int count = housemanagedaoserviceimpl.houseManageDeleteConfirmValidate(houseManageForm.getId());
		if (count != 0) {
			ActionErrors actionErrors = new ActionErrors();
			actionErrors.add("error", new ActionMessage("housemanage_action_01"));
			this.addErrors(request, actionErrors);
			return mapping.findForward("fail");
		}
		// 执行删除
		HouseManageDeleteConfirmExecuteParamBean paramBean = new HouseManageDeleteConfirmExecuteParamBean();
		paramBean.setValue(houseManageForm);
		housemanagedaoserviceimpl.houseManageDeleteConfirmExecute(paramBean);
		return mapping.findForward("success");
	}
}
