package com.feifan.querymanage.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.querymanage.sqlbean.QueryManageMainBedSelectResultBean;
import com.feifan.daoservice.QueryManageDaoService;

public class QueryManageMainBedSelectAction extends Action {

	private QueryManageDaoService querymanagedaoserviceimpl;

	public QueryManageDaoService getQuerymanagedaoserviceimpl() {
		return querymanagedaoserviceimpl;
	}

	public void setQuerymanagedaoserviceimpl(QueryManageDaoService querymanagedaoserviceimpl) {
		this.querymanagedaoserviceimpl = querymanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 执行数据库
		List<QueryManageMainBedSelectResultBean> results = querymanagedaoserviceimpl.queryManageMainBedSelect();
		// 将检索结果放入SESSION
		request.setAttribute("queryManageMainBedSelectResult", results);
		return mapping.findForward("success");
	}
}
