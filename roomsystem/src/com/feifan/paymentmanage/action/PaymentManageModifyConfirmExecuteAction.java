package com.feifan.paymentmanage.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.feifan.daoservice.PaymentManageDaoService;
import com.feifan.paymentmanage.form.PaymentManageForm;
import com.feifan.paymentmanage.sqlbean.PaymentManageModifyConfirmExecuteParamBean;

public class PaymentManageModifyConfirmExecuteAction extends Action {

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
		PaymentManageModifyConfirmExecuteParamBean paramBean = new PaymentManageModifyConfirmExecuteParamBean();
		// 设定paramBean
		paramBean.setValue(paymentManageForm);
		// 执行数据库
		paymentmanagedaoserviceimpl.paymentManageModifyConfirmExecute(paramBean);
		return mapping.findForward("success");
	}
}
