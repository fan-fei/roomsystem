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
import com.feifan.paymentmanage.sqlbean.PaymentManageSelectInputSelectResultBean;

public class PaymentManageSelectListDeleteAction extends Action {

	private PaymentManageDaoService paymentmanagedaoserviceimpl;

	public PaymentManageDaoService getPaymentmanagedaoserviceimpl() {
		return paymentmanagedaoserviceimpl;
	}

	public void setPaymentmanagedaoserviceimpl(PaymentManageDaoService paymentmanagedaoserviceimpl) {
		this.paymentmanagedaoserviceimpl = paymentmanagedaoserviceimpl;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		PaymentManageForm paymentManageForm = (PaymentManageForm) form;
		String index = (String) request.getParameter("index");
		PaymentManageSelectInputSelectResultBean resultBean = ((List<PaymentManageSelectInputSelectResultBean>) request.getSession().getAttribute("paymentManageSelectInputSelectResult")).get(Integer.parseInt(index));
		paymentManageForm.setValue(resultBean);
		return mapping.findForward("success");
	}
}
