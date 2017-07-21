package com.feifan.livemanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.LiveManageDaoService;
import com.feifan.livemanage.form.LiveManageForm;

public class LiveManageCreateReferBackAction extends Action {

	private LiveManageDaoService livemanagedaoserviceimpl;

	public LiveManageDaoService getLivemanagedaoserviceimpl() {
		return livemanagedaoserviceimpl;
	}

	public void setLivemanagedaoserviceimpl(LiveManageDaoService livemanagedaoserviceimpl) {
		this.livemanagedaoserviceimpl = livemanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		LiveManageForm liveManageForm = (LiveManageForm) form;
		// 取得输入画面已输入的值
		LiveManageForm input = (LiveManageForm) request.getSession().getAttribute("liveManageCreateInput");
		// 设定输入值
		liveManageForm.setPerson_id(input.getPerson_id());
		liveManageForm.setPerson_num(input.getPerson_num());
		liveManageForm.setName(input.getName());
		liveManageForm.setHouse_num(input.getHouse_num());
		liveManageForm.setBuilding_floor(input.getBuilding_floor());
		liveManageForm.setHouse_type(input.getHouse_type());
		liveManageForm.setBed_num(input.getBed_num());
		liveManageForm.setEnter_date(input.getEnter_date());
		liveManageForm.setComment(input.getComment());
		// 由Action或Form迁移回去时，日期不设定默认值
		request.setAttribute("DoNotSetDefaultDate", "DoNotSetDefaultDate");
		return mapping.findForward("success");
	}
}
