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
import com.feifan.livemanage.sqlbean.LiveManageSelectInputSelectParamBean;
import com.feifan.livemanage.sqlbean.LiveManageSelectInputSelectResultBean;

public class LiveManageSelectInputSelectAction extends Action {

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
		LiveManageSelectInputSelectParamBean paramBean = new LiveManageSelectInputSelectParamBean();
		// 将检索条件放入SESSION
		request.getSession().setAttribute("liveManageSelectInputSelectCondition", liveManageForm);
		// 设定paramBean
		paramBean.setValue(liveManageForm);
		// 执行数据库
		List<LiveManageSelectInputSelectResultBean> results = livemanagedaoserviceimpl.liveManageSelectInputSelect(paramBean);
		for (LiveManageSelectInputSelectResultBean result : results) {
			result.setLastupdated_date(result.getLastupdated_date().subSequence(0, 10).toString());
		}
		// 将检索结果放入SESSION
		request.getSession().setAttribute("liveManageSelectInputSelectResult", results);
		return mapping.findForward("success");
	}
}
