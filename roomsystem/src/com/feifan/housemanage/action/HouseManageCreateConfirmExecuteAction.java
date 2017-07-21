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
import com.feifan.housemanage.sqlbean.HouseManageCreateConfirmExecuteParamBean;
import com.feifan.housemanage.sqlbean.HouseManageCreateConfirmValidateParamBean;

public class HouseManageCreateConfirmExecuteAction extends Action {

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
		// 验证该条数据是否已经存在
		HouseManageCreateConfirmValidateParamBean validateParamBean = new HouseManageCreateConfirmValidateParamBean();
		validateParamBean.setValue(houseManageForm);
		int count = housemanagedaoserviceimpl.houseManageCreateConfirmValidate(validateParamBean);
		if (count != 0) {
			ActionErrors actionErrors = new ActionErrors();
			actionErrors.add("error", new ActionMessage("housemanage_action_03"));
			this.addErrors(request, actionErrors);
			return mapping.findForward("fail");
		}
		// 如不存在则执行
		HouseManageCreateConfirmExecuteParamBean executeParamBean = new HouseManageCreateConfirmExecuteParamBean();
		executeParamBean.setValue(houseManageForm);
		housemanagedaoserviceimpl.houseManageCreateConfirmExecute(executeParamBean);

		return mapping.findForward("success");
	}
}
