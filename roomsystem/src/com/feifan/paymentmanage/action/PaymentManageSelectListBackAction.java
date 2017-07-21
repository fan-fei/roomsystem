package com.feifan.paymentmanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.PaymentManageDaoService;
import com.feifan.paymentmanage.form.PaymentManageForm;

public class PaymentManageSelectListBackAction extends Action {

	private PaymentManageDaoService paymentmanagedaoserviceimpl;

	public PaymentManageDaoService getPaymentmanagedaoserviceimpl() {
		return paymentmanagedaoserviceimpl;
	}

	public void setPaymentmanagedaoserviceimpl(PaymentManageDaoService paymentmanagedaoserviceimpl) {
		this.paymentmanagedaoserviceimpl = paymentmanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		PaymentManageForm paymentManageForm = (PaymentManageForm) form;
		// 取得检索条件
		PaymentManageForm condition = (PaymentManageForm) request.getSession().getAttribute("paymentManageSelectInputSelectCondition");
		// 设定检索条件
		paymentManageForm.setName(condition.getName());
		paymentManageForm.setHouse_num(condition.getHouse_num());
		paymentManageForm.setPay_date(condition.getPay_date());
		paymentManageForm.setStart_date(condition.getStart_date());
		paymentManageForm.setEnd_date(condition.getEnd_date());
		request.setAttribute("DoNotSetDefaultDate", "DoNotSetDefaultDate");
		return mapping.findForward("success");
	}
}
