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
import com.feifan.livemanage.sqlbean.LiveManageSelectInputSelectResultBean;

public class LiveManageSelectListDeleteAction extends Action {

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
		LiveManageSelectInputSelectResultBean resultBean = ((List<LiveManageSelectInputSelectResultBean>) request.getSession().getAttribute("liveManageSelectInputSelectResult")).get(Integer.parseInt(index));
		liveManageForm.setValue(resultBean);
		return mapping.findForward("success");
	}
}
