package com.feifan.housemanage.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.HouseManageDaoService;
import com.feifan.housemanage.form.HouseManageForm;
import com.feifan.housemanage.sqlbean.HouseManageSelectInputSelectResultBean;

public class HouseManageSelectListDeleteAction extends Action {

	private HouseManageDaoService housemanagedaoserviceimpl;

	public HouseManageDaoService getHousemanagedaoserviceimpl() {
		return housemanagedaoserviceimpl;
	}

	public void setHousemanagedaoserviceimpl(HouseManageDaoService housemanagedaoserviceimpl) {
		this.housemanagedaoserviceimpl = housemanagedaoserviceimpl;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		HouseManageForm houseManageForm = (HouseManageForm) form;
		String index = (String) request.getParameter("index");
		HouseManageSelectInputSelectResultBean resultBean = ((List<HouseManageSelectInputSelectResultBean>) request.getSession().getAttribute("houseManageSelectInputSelectResult")).get(Integer.parseInt(index));
		houseManageForm.setValue(resultBean);
		return mapping.findForward("success");
	}
}
