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
import com.feifan.housemanage.sqlbean.HouseManageModifyConfirmExecuteParamBean;

public class HouseManageModifyConfirmExecuteAction extends Action {

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
		// 验证可住人数是否小于现住人数
		int count = housemanagedaoserviceimpl.houseManageDeleteConfirmValidate(houseManageForm.getId());
		if (count > Integer.parseInt(houseManageForm.getAllow_num())) {
			ActionErrors actionErrors = new ActionErrors();
			actionErrors.add("error", new ActionMessage("housemanage_action_02"));
			this.addErrors(request, actionErrors);
			return mapping.findForward("fail");
		}
		HouseManageModifyConfirmExecuteParamBean paramBean = new HouseManageModifyConfirmExecuteParamBean();
		// 设定paramBean
		paramBean.setValue(houseManageForm);
		// 执行数据库
		housemanagedaoserviceimpl.houseManageModifyConfirmExecute(paramBean);
		return mapping.findForward("success");
	}
}
