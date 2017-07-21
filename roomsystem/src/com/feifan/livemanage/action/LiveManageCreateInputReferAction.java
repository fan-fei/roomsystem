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

public class LiveManageCreateInputReferAction extends Action {

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
		List<LiveManageCreateInputReferResultBean> results = livemanagedaoserviceimpl.liveManageCreateInputRefer(request.getParameter("refer").toString());
		request.getSession().setAttribute("liveManageCreateInput", liveManageForm);
		request.getSession().setAttribute("liveManageCreateInputReferResult", results);
		request.setAttribute("refer", request.getParameter("refer").toString());
		return mapping.findForward("success");
	}
}
