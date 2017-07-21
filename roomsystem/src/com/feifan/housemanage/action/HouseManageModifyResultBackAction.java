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
import com.feifan.housemanage.sqlbean.HouseManageSelectInputSelectParamBean;
import com.feifan.housemanage.sqlbean.HouseManageSelectInputSelectResultBean;

public class HouseManageModifyResultBackAction extends Action {

	private HouseManageDaoService housemanagedaoserviceimpl;

	public HouseManageDaoService getHousemanagedaoserviceimpl() {
		return housemanagedaoserviceimpl;
	}

	public void setHousemanagedaoserviceimpl(HouseManageDaoService housemanagedaoserviceimpl) {
		this.housemanagedaoserviceimpl = housemanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		HouseManageSelectInputSelectParamBean paramBean = new HouseManageSelectInputSelectParamBean();
		// 将检索条件从SESSION取出
		HouseManageForm houseManageForm = (HouseManageForm) request.getSession().getAttribute("houseManageSelectInputSelectCondition");
		// 设定paramBean
		paramBean.setValue(houseManageForm);
		// 执行数据库
		List<HouseManageSelectInputSelectResultBean> results = housemanagedaoserviceimpl.houseManageSelectInputSelect(paramBean);
		// 将检索结果放入SESSION
		request.getSession().setAttribute("houseManageSelectInputSelectResult", results);
		return mapping.findForward("success");
	}
}
