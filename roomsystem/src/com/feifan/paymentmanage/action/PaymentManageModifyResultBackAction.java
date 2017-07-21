package com.feifan.paymentmanage.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.PaymentManageDaoService;
import com.feifan.paymentmanage.form.PaymentManageForm;
import com.feifan.paymentmanage.sqlbean.PaymentManageSelectInputSelectParamBean;
import com.feifan.paymentmanage.sqlbean.PaymentManageSelectInputSelectResultBean;

public class PaymentManageModifyResultBackAction extends Action {

	private PaymentManageDaoService paymentmanagedaoserviceimpl;

	public PaymentManageDaoService getPaymentmanagedaoserviceimpl() {
		return paymentmanagedaoserviceimpl;
	}

	public void setPaymentmanagedaoserviceimpl(PaymentManageDaoService paymentmanagedaoserviceimpl) {
		this.paymentmanagedaoserviceimpl = paymentmanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		PaymentManageSelectInputSelectParamBean paramBean = new PaymentManageSelectInputSelectParamBean();
		// 将检索条件从SESSION取出
		PaymentManageForm paymentManageForm = (PaymentManageForm) request.getSession().getAttribute("paymentManageSelectInputSelectCondition");
		// 设定paramBean
		paramBean.setValue(paymentManageForm);
		// 执行数据库
		List<PaymentManageSelectInputSelectResultBean> results = paymentmanagedaoserviceimpl.paymentManageSelectInputSelect(paramBean);
		for (PaymentManageSelectInputSelectResultBean result : results) {
			result.setLastupdated_date(result.getLastupdated_date().subSequence(0, 10).toString());
		}
		// 将检索结果放入SESSION
		request.getSession().setAttribute("paymentManageSelectInputSelectResult", results);
		return mapping.findForward("success");
	}
}
