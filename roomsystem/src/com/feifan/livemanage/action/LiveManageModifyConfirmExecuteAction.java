package com.feifan.livemanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.LiveManageDaoService;
import com.feifan.livemanage.form.LiveManageForm;
import com.feifan.livemanage.sqlbean.LiveManageModifyConfirmExecuteParamBean;

public class LiveManageModifyConfirmExecuteAction extends Action {

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
		LiveManageModifyConfirmExecuteParamBean paramBean = new LiveManageModifyConfirmExecuteParamBean();
		// 设定paramBean
		paramBean.setValue(liveManageForm);
		// 执行数据库
		livemanagedaoserviceimpl.liveManageModifyConfirmExecute(paramBean);
		return mapping.findForward("success");
	}
}
