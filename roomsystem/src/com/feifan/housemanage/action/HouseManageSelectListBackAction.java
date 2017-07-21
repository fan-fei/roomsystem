package com.feifan.housemanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.HouseManageDaoService;
import com.feifan.housemanage.form.HouseManageForm;

public class HouseManageSelectListBackAction extends Action {

	private HouseManageDaoService housemanagedaoserviceimpl;

	public HouseManageDaoService getHousemanagedaoserviceimpl() {
		return housemanagedaoserviceimpl;
	}

	public void setHousemanagedaoserviceimpl(HouseManageDaoService housemanagedaoserviceimpl) {
		this.housemanagedaoserviceimpl = housemanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		HouseManageForm houseManageForm = (HouseManageForm) form;
		// 取得检索条件
		HouseManageForm condition = (HouseManageForm) request.getSession().getAttribute("houseManageSelectInputSelectCondition");
		// 设定检索条件
		houseManageForm.setHouse_num((condition).getHouse_num());
		houseManageForm.setBuilding_num(condition.getBuilding_num());
		houseManageForm.setFloor_num(condition.getFloor_num());
		return mapping.findForward("success");
	}
}
