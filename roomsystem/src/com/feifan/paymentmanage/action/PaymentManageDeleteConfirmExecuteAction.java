package com.feifan.paymentmanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.PaymentManageDaoService;
import com.feifan.paymentmanage.form.PaymentManageForm;
import com.feifan.paymentmanage.sqlbean.PaymentManageDeleteConfirmExecuteParamBean;

public class PaymentManageDeleteConfirmExecuteAction extends Action {

	private PaymentManageDaoService paymentmanagedaoserviceimpl;

	public PaymentManageDaoService getPaymentmanagedaoserviceimpl() {
		return paymentmanagedaoserviceimpl;
	}

	public void setPaymentmanagedaoserviceimpl(PaymentManageDaoService paymentmanagedaoserviceimpl) {
		this.paymentmanagedaoserviceimpl = paymentmanagedaoserviceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		PaymentManageForm paymentManageForm = (PaymentManageForm) form;
		PaymentManageDeleteConfirmExecuteParamBean paramBean = new PaymentManageDeleteConfirmExecuteParamBean();
		paramBean.setValue(paymentManageForm);
		paymentmanagedaoserviceimpl.paymentManageDeleteConfirmExecute(paramBean);
		return mapping.findForward("success");
	}
}
