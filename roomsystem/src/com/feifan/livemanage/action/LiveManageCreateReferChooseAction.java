package com.feifan.livemanage.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.LiveManageDaoService;
import com.feifan.livemanage.form.LiveManageForm;
import com.feifan.livemanage.sqlbean.LiveManageCreateInputReferResultBean;

public class LiveManageCreateReferChooseAction extends Action {

	private LiveManageDaoService livemanagedaoserviceimpl;

	public LiveManageDaoService getLivemanagedaoserviceimpl() {
		return livemanagedaoserviceimpl;
	}

	public void setLivemanagedaoserviceimpl(LiveManageDaoService livemanagedaoserviceimpl) {
		this.livemanagedaoserviceimpl = livemanagedaoserviceimpl;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		LiveManageForm liveManageForm = (LiveManageForm) form;
		String index = (String) request.getParameter("index");
		// 从一览画面取得部分字段，设定到输入画面
		LiveManageCreateInputReferResultBean resultBean = ((List<LiveManageCreateInputReferResultBean>) request.getSession().getAttribute("liveManageCreateInputReferResult")).get(Integer.parseInt(index));
		LiveManageForm input = (LiveManageForm) request.getSession().getAttribute("liveManageCreateInput");
		// 判断是点击了哪个参照按钮
		if (resultBean.getPerson_num() != null) {
			liveManageForm.setPerson_id(resultBean.getId());
			liveManageForm.setPerson_num(resultBean.getPerson_num());
			liveManageForm.setName(resultBean.getName());
			// 取得并设定输入画面已输入的字段
			liveManageForm.setHouse_id(input.getHouse_id());
			liveManageForm.setHouse_num(input.getHouse_num());
			liveManageForm.setBuilding_floor(input.getBuilding_floor());
			liveManageForm.setHouse_type(input.getHouse_type());
		} else {
			liveManageForm.setHouse_id(resultBean.getId());
			liveManageForm.setHouse_num(resultBean.getHouse_num());
			liveManageForm.setBuilding_floor(resultBean.getBuilding_floor());
			liveManageForm.setHouse_type(resultBean.getHouse_type());
			// 取得并设定输入画面已输入的字段
			liveManageForm.setPerson_id(input.getPerson_id());
			liveManageForm.setPerson_num(input.getPerson_num());
			liveManageForm.setName(input.getName());
		}
		liveManageForm.setBed_num(input.getBed_num());
		liveManageForm.setEnter_date(input.getEnter_date());
		liveManageForm.setComment(input.getComment());
		// 由Action或Form迁移回去时，日期不设定默认值
		request.setAttribute("DoNotSetDefaultDate", "DoNotSetDefaultDate");
		return mapping.findForward("success");
	}
}
