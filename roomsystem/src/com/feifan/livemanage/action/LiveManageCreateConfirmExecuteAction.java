package com.feifan.livemanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.feifan.daoservice.LiveManageDaoService;
import com.feifan.livemanage.form.LiveManageForm;
import com.feifan.livemanage.sqlbean.LiveManageCreateConfirmExecuteParamBean;

public class LiveManageCreateConfirmExecuteAction extends Action {

	private LiveManageDaoService livemanagedaoserviceimpl;

	public LiveManageDaoService getLivemanagedaoserviceimpl() {
		return livemanagedaoserviceimpl;
	}

	public void setLivemanagedaoserviceimpl(LiveManageDaoService livemanagedaoserviceimpl) {
		this.livemanagedaoserviceimpl = livemanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		LiveManageForm liveManageForm = (LiveManageForm) form;
		// 验证当前人员是否已经住宿
		int count = livemanagedaoserviceimpl.liveManageCreateConfirmValidatePerson(liveManageForm.getPerson_id());
		if (count != 0) {
			ActionErrors actionErrors = new ActionErrors();
			actionErrors.add("error", new ActionMessage("livemanage_action_01"));
			this.addErrors(request, actionErrors);
			return mapping.findForward("fail");
		}
		// 验证当前宿舍是否已经满员
		count = livemanagedaoserviceimpl.liveManageCreateConfirmValidateHouse(liveManageForm.getHouse_id());
		if (count != 0) {
			ActionErrors actionErrors = new ActionErrors();
			actionErrors.add("error", new ActionMessage("livemanage_action_02"));
			this.addErrors(request, actionErrors);
			return mapping.findForward("fail");
		}
		// 执行
		LiveManageCreateConfirmExecuteParamBean paramBean = new LiveManageCreateConfirmExecuteParamBean();
		paramBean.setValue(liveManageForm);
		livemanagedaoserviceimpl.liveManageCreateConfirmExecute(paramBean);

		return mapping.findForward("success");
	}
}
