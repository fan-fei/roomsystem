package com.feifan.paymentmanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.PaymentManageDaoService;

public class PaymentManageCreateConfirmBackAction extends Action {

	private PaymentManageDaoService paymentmanagedaoserviceimpl;

	public PaymentManageDaoService getPaymentmanagedaoserviceimpl() {
		return paymentmanagedaoserviceimpl;
	}

	public void setPaymentmanagedaoserviceimpl(PaymentManageDaoService paymentmanagedaoserviceimpl) {
		this.paymentmanagedaoserviceimpl = paymentmanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 由Action或Form迁移回去时，日期不设定默认值
		request.setAttribute("DoNotSetDefaultDate", "DoNotSetDefaultDate");
		return mapping.findForward("success");
	}
}
